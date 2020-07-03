package com.xr.controller;

import com.xr.model.SysMenu;
import com.github.pagehelper.PageInfo;
import com.xr.model.SysRole;
import com.xr.model.SysUser;
import com.xr.service.SysMenuService;
import com.xr.service.SysUserService;
import com.xr.util.GetUserTokenInfo;
import com.xr.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 11:42
 * @Description
 */
@RestController
@RequestMapping("user")
@Api("用户管理相关接口")
public class SysUserController {

    //依赖注入业务类

    @Autowired
    public SysUserController(SysUserService sysUserService, GetUserTokenInfo userTokenInfo) {
        this.sysUserService=sysUserService;
        this.userTokenInfo = userTokenInfo;
    }
    @Autowired
    SysMenuService sysMenuService;


    private SysUserService sysUserService;

    private GetUserTokenInfo userTokenInfo;

    @RequestMapping("info")
    @ApiOperation(value = "获得用户的信息", notes = "获取用户信息")
    public ResponseResult info(String token) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if (token.equals(subject.getSession().getId().toString())) {
            // 从shiro的session里获得保存的用户信息
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
            userTokenInfo.getData().put("id",loginUser.getId());
            userTokenInfo.getData().put("createName",loginUser.getUsername());
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if (loginUser != null) {
                // 根据用户获得角色字符串数组
                roles = sysUserService.findUserRoles(loginUser.getUsername());
                result.getData().put("roles", roles);
                result.getData().put("introduction", loginUser.getIntroduction());
                result.getData().put("avatar", loginUser.getAvatar());
                result.getData().put("name", loginUser.getUsername());
                return result;
            }
        }
        return null;
    }

    @RequestMapping("list")
    @RequiresPermissions("user:list")
    @ApiOperation(value = "获得用户列表", notes = "获得用户列表")
    public ResponseResult list(SysUser sysUser, Integer page, Integer limit) {
        List<SysUser> list = sysUserService.list(sysUser,page,limit);
        //PageInfo info=new PageInfo(list);
        ResponseResult result = new ResponseResult();
        result.getData().put("items", list);
        result.getData().put("total", list.size());
        return result;
    }


    @RequestMapping("menus")
    public ResponseResult menu(String token) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        List<String> roles = sysUserService.findUserRoles(loginUser.getUsername());
        List<SysMenu> menus = (List<SysMenu>) session.getAttribute("menus");
        if (roles != null) {
            for (String role : roles) {
                long id = Long.parseLong("0");
                //父菜单
                menus = sysMenuService.listPermissions(role, id);
                for (SysMenu menu : menus) {
                    System.out.println("id" + menu.getId());
                    //子菜单
                    List<SysMenu> menuss = sysMenuService.listPermissions(role, menu.getId());
                    menu.setChildren(menuss);
                }

                result.getData().put("menuList", menus);
                return result;
            }
        }
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    @ApiOperation(value = "用户的添加", notes = "用户的添加")
    public ResponseResult add(SysUser sysUser) {

        //生成盐（部分，需要存入数据库中）
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(sysUser.getPassword(),salt,2).toString();
        sysUser.setSalt(salt);
        sysUser.setPassword(password);

        sysUserService.add(sysUser);
        ResponseResult result = new ResponseResult();
        result.getData().put("message", "添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("user:update")
    @ApiOperation(value = "用户的修改", notes = "修改用户")
    public ResponseResult update(SysUser sysUser) {
        sysUserService.update(sysUser);
        ResponseResult result = new ResponseResult();
        result.getData().put("message", "修改成功");
        return result;
    }

    @RequestMapping("delete")
    @ApiOperation(value = "用户的删除", notes = "删除的用户")
    @RequiresPermissions("user:delete")
    public ResponseResult add(Long id) {
        sysUserService.deleteUserById(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message", "删除成功");
        return result;
    }

    @RequestMapping("login")
    @ApiOperation(value = "用户的登陆", notes = "用户的登陆")
    public ResponseResult login(SysUser sysUser) {
        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token = new UsernamePasswordToken(sysUser.getUsername(), sysUser.getPassword());
        // 获得登录的主题
        Subject subject = SecurityUtils.getSubject();
        // 调用登录方法
        subject.login(token);
        // 返回给前台的toke，唯一标识用户
        result.getData().put("token", subject.getSession().getId());
        return result;
    }

    @RequestMapping("logout")
    @ApiOperation(value = "用户注销", notes = "用户注销")
    public ResponseResult logout() {
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 只需调用shiro的logout方法就可以了
        subject.logout();
        return result;
    }

    @RequestMapping("check")
    public ResponseResult check(String username){
        int number= Math.toIntExact(sysUserService.checkname(username));
        ResponseResult result=new ResponseResult();
        result.getData().put("number",number);
        return result;
    }

    @RequestMapping("getRoleUserByRole")
    public ResponseResult getRoleUserList(Integer id){
        List<SysRole> list = sysUserService.selectRoleOrUser(id);
    System.out.println(list);
        ResponseResult result= new ResponseResult();
        if (list.size() ==0) {
            result.getData().put("roleList",sysUserService.selectRole());

        }else{
            StringBuffer name= new StringBuffer();

          for (SysRole sysRole : list) {
            name.append(","+sysRole.getName());
          }
            String s = name.deleteCharAt(0).toString();
            List<SysRole> roleList = sysUserService.selectNotExits(s);
            result.getData().put("roleList",roleList);
        }

            return result;
    }

    @RequestMapping("addUserConcernRole")
    public ResponseResult addRoleUserRelation(Long [] a,Long getUserId){
        for(long b:a)
        {
            System.out.println(b);
            sysUserService.addRoleGetUserByUserIdAndRoleId(b,getUserId);
        }
        ResponseResult result=new ResponseResult();
        result.getData().put("message","分配成功");
        return result;
    }


    @RequestMapping("listById")
    public ResponseResult listByLoginId(){
        Map<String, String> map = sysUserService.listById((String) userTokenInfo.getData().get("createName"));
        ResponseResult result=new ResponseResult();
        result.getData().put("items",map);
        return result;
    }
}
