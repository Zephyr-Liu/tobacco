package com.xr.controller;

import com.xr.model.PartyWorkArrangement;
import com.xr.model.SysUser;
import com.xr.service.PartyWorkAarrangementService;
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
@RequestMapping("partyArrangement")
public class PartyWorkArrangementController {


    @Autowired
    PartyWorkAarrangementService partyWorkAarrangementService;
    @Autowired
    SysUserService sysUserService;


    @RequestMapping("list")
    @RequiresPermissions("partyArrangement:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(PartyWorkArrangement partyWorkAarrangement, Integer page, Integer limit, String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");

        List<Long> userRoles = sysUserService.findUserRolesId(loginUser.getUsername());
        String rid=userRoles.get(0)+"  ";

        List<PartyWorkArrangement> list = partyWorkAarrangementService.listpartyWorkAarrangement(partyWorkAarrangement,rid,loginUser.getUsername());

        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("roleId",userRoles.get(0));
        result.getData().put("total",list.size());
        return result;
    }



    @RequestMapping("add")
    @RequiresPermissions("partyArrangement:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(PartyWorkArrangement partyWorkAarrangement){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        partyWorkAarrangement.setCreateDate(new Date());
        partyWorkAarrangement.setCreateId(Integer.parseInt(loginUser.getId().toString()));
        partyWorkAarrangement.setCreateName(loginUser.getUsername());
        byte b=0;
        partyWorkAarrangement.setStatus(b);
        partyWorkAarrangementService.insertSelective(partyWorkAarrangement);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }



    @RequestMapping("updateStatus")
    @RequiresPermissions("partyArrangement:updateStatus")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult updateStatus(Long id){
        PartyWorkArrangement partyWorkAarrangement = new PartyWorkArrangement();
        byte b=2;
        partyWorkAarrangement.setStatus(b);
        partyWorkAarrangement.setId(Integer.parseInt(id.toString()));
        partyWorkAarrangementService.updateByPrimaryKeyStatus(partyWorkAarrangement);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("partyArrangement:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult update(PartyWorkArrangement partyWorkAarrangement){
        if (partyWorkAarrangement.getStatus()==0){
            partyWorkAarrangement.setStatus((byte) 1);
        }
        partyWorkAarrangementService.update(partyWorkAarrangement);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("partyArrangement:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult delete(Long id){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        PartyWorkArrangement partyWorkArrangement=new PartyWorkArrangement();
        partyWorkArrangement.setId(Integer.parseInt(id.toString()));
        partyWorkArrangement.setStatus((byte) 3);

        partyWorkAarrangementService.deleteById(partyWorkArrangement);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }




}
