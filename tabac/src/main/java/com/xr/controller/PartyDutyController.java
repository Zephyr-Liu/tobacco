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
        List<PartyDuty> list = partyDutyService.listpartyDuty(partyDuty);

        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("roleId",userRoles.get(0));
        result.getData().put("total",list.size());
        return result;
    }


}
