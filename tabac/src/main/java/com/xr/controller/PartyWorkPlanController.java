package com.xr.controller;


import com.xr.model.PartyWorkPlan;
import com.xr.model.SysUser;
import com.xr.service.PartyWorkPlanService;
import com.xr.service.SysUserService;
import com.xr.util.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("partyworkplan")
public class PartyWorkPlanController {

    @Autowired
    private PartyWorkPlanService partyWorkPlanService;
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("list")
    @RequiresPermissions("partywork:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(PartyWorkPlan partyWorkPlan, Integer page, Integer limit, String token){

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        List<Long> userRoles = sysUserService.findUserRolesId(loginUser.getUsername());
        String rid=userRoles.get(0)+"  ";

        List<PartyWorkPlan> list = partyWorkPlanService.listPartyWorkPlan(partyWorkPlan,rid,loginUser.getUsername());
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("roleId",userRoles.get(0));
        result.getData().put("total",list.size());
        return result;
    }



    @RequestMapping("add")
    @RequiresPermissions("partywork:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(PartyWorkPlan partyWorkPlan){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        System.out.println("Id"+loginUser.getId());
        System.out.println("用户名："+loginUser.getUsername());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("时间"+new Date());
        partyWorkPlan.setCreateDate(new Date());
        partyWorkPlan.setCreateId(Integer.parseInt(loginUser.getId().toString()));
        partyWorkPlan.setCreateName(loginUser.getUsername());
        byte b=0;
        partyWorkPlan.setStatus(b);
        partyWorkPlanService.insertSelective(partyWorkPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("partywork:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult update(PartyWorkPlan partyWorkPlan){
        if (partyWorkPlan.getStatus()==0){
            partyWorkPlan.setStatus((byte) 1);
        }
        partyWorkPlanService.update(partyWorkPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("updateStatus")
    @RequiresPermissions("partywork:updateStatus")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult updateStatus(Long id){
        PartyWorkPlan partyWorkPlan = new PartyWorkPlan();
        byte b=2;
        partyWorkPlan.setStatus(b);
        partyWorkPlan.setId(Integer.parseInt(id.toString()));
        partyWorkPlanService.updateByPrimaryKeyStatus(partyWorkPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("partywork:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult delete(Long id){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");

        PartyWorkPlan partyWorkPlan=new PartyWorkPlan();
        partyWorkPlan.setStatus((byte) 3);
        partyWorkPlan.setId(Integer.parseInt(id.toString()));

        partyWorkPlanService.deleteById(partyWorkPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }



}
