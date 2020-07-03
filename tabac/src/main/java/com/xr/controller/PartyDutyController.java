package com.xr.controller;

import com.xr.model.PartyDuty;
import com.xr.model.SysUser;
import com.xr.service.PartyDutyService;
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

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("PartyDuty")
public class PartyDutyController {

    @Autowired
    private PartyDutyService partyDutyService;
    @Autowired
    private SysUserService sysUserService;


    @RequestMapping("list")
    @RequiresPermissions("PartyDuty:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(PartyDuty partyDuty, Integer page, Integer limit, String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        List<Long> userRoles = sysUserService.findUserRolesId(loginUser.getUsername());
        String rid=userRoles.get(0).toString();
        List<PartyDuty> list = partyDutyService.listpartyDuty(partyDuty,rid,loginUser.getUsername());

        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("roleId",userRoles.get(0));
        result.getData().put("total",list.size());
        return result;
    }




    @RequestMapping("add")
    @RequiresPermissions("partyduty:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(PartyDuty partyDuty){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        partyDuty.setCreateDate(new Date());
        partyDuty.setCreateId(Integer.parseInt(loginUser.getId().toString()));
        partyDuty.setCreateName(loginUser.getUsername());
        byte b=1;
        partyDuty.setStatus(b);
        partyDutyService.insertSelective(partyDuty);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }



    @RequestMapping("updateStatus")
    @RequiresPermissions("partyduty:updateStatus")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult updateStatus(Long id){
        PartyDuty partyDuty = new PartyDuty();
        byte b=2;
        partyDuty.setStatus(b);
        partyDuty.setId(Integer.parseInt(id.toString()));
        partyDutyService.updateByPrimaryKeyStatus(partyDuty);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("partyduty:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult update(PartyDuty partyDuty){
        System.out.println(partyDuty.getStatus());
        if(partyDuty.getStatus()==0){
            partyDuty.setStatus((byte) 1);
        }
        partyDutyService.update(partyDuty);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("partyduty:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult delete(Long id){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        PartyDuty partyDuty = new PartyDuty();
        byte b=3;
        partyDuty.setStatus(b);
        partyDuty.setId(Integer.parseInt(id.toString()));
        partyDutyService.updateByPrimaryKeyStatus(partyDuty);
        ResponseResult result = new ResponseResult();

        result.getData().put("message","删除成功");
        return result;
    }




}
