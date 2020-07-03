package com.xr.controller;

import com.xr.model.PartyDialogue;
import com.xr.model.PartyDuty;
import com.xr.model.SysUser;
import com.xr.service.PartyDialogueService;
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
@RequestMapping("partyDialogue")
public class PartyDialogueController {



    @Autowired
    PartyDialogueService partyDialogueService;
    @Autowired
    SysUserService sysUserService;

    @RequestMapping("list")
    @RequiresPermissions("partyDialogue:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(PartyDialogue partyDialogue, Integer page, Integer limit, String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        List<Long> userRoles = sysUserService.findUserRolesId(loginUser.getUsername());
        String rid=userRoles.get(0)+"  ";
        List<PartyDialogue> list = partyDialogueService.selectByExample(partyDialogue,rid,loginUser.getUsername());

        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("roleId",userRoles.get(0));
        result.getData().put("total",list.size());
        return result;
    }



    @RequestMapping("add")
    @RequiresPermissions("partyDialogue:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(PartyDialogue partyDialogue){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        partyDialogue.setCreateDate(new Date());
        partyDialogue.setCreateId(Integer.parseInt(loginUser.getId().toString()));
        partyDialogue.setCreateName(loginUser.getUsername());
        partyDialogue.setStatus((byte) 0);
        partyDialogueService.insert(partyDialogue);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("partyDialogue:update")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult update(PartyDialogue partyDialogue){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        partyDialogue.setCreateDate(new Date());
        partyDialogue.setStatus((byte) 1);
        partyDialogueService.updateByPrimaryKey(partyDialogue);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("updateStatus")
    @RequiresPermissions("partyDialogue:updateStatus")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult updateStatus(Long id){
        PartyDialogue partyDialogue = new PartyDialogue();
        partyDialogue.setStatus((byte) 2);
        partyDialogue.setId(Integer.parseInt(id.toString()));
        partyDialogueService.updateByPrimaryKeySelective(partyDialogue);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }


    @RequestMapping("delete")
    @RequiresPermissions("partyDialogue:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult delete(Long id){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        PartyDialogue partyDialogue = new PartyDialogue();
        partyDialogue.setStatus((byte) 3);
        partyDialogue.setId(Integer.parseInt(id.toString()));
        partyDialogueService.updateByPrimaryKeySelective(partyDialogue);
        ResponseResult result = new ResponseResult();

        result.getData().put("message","删除成功");
        return result;
    }


}
