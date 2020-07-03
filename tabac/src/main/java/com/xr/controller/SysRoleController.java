package com.xr.controller;

import com.xr.model.SysRole;
import com.xr.service.SysRoleService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 0:22
 * @Description  角色管理
 */
@RestController
@RequestMapping("role")
public class SysRoleController {

    private SysRoleService sysRoleService;

  @Autowired
  public SysRoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
  }

  @RequestMapping("list")
  @RequiresPermissions("role:list")
  public ResponseResult list(SysRole sysRole,Integer page,Integer limit){
      ResponseResult result=new ResponseResult();
      List<SysRole> list = sysRoleService.listSysRole(sysRole,page,limit);
      result.getData().put("items",list);
      result.getData().put("total",list.size());
      return result;
  }

  @RequestMapping("add")
  @RequiresPermissions("role:add")
    public ResponseResult add(SysRole sysRole){
        ResponseResult result =new ResponseResult();
        sysRoleService.addSysRole(sysRole);
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("role:delete")
    public ResponseResult delete(Integer id){
      ResponseResult result=new ResponseResult();
      sysRoleService.deleteSysRoleById(id);
      result.getData().put("message","删除成功");
      return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("role:update")
    public ResponseResult update(SysRole sysRole){
      sysRoleService.updateSysRole(sysRole);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

}
