package com.xr.controller;

import com.xr.model.SysUser;
import com.xr.service.SysUserService;
import com.xr.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    private SysUserService sysUserService;

    @RequestMapping("info")
    @ApiOperation(value = "获得用户的信息", notes = "获取用户信息")
    public ResponseResult info(String token) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if (token.equals(subject.getSession().getId().toString())) {
            // 从shiro的session里获得保存的用户信息
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
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
        List<SysUser> list = sysUserService.list(sysUser);
        ResponseResult result = new ResponseResult();
        result.getData().put("items", list);
        result.getData().put("total", list.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    @ApiOperation(value = "用户的添加", notes = "用户的添加")
    public ResponseResult add(SysUser sysUser) {
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
        sysUserService.deleteById(id);
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
}
