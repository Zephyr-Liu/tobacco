package com.xr.controller;

import com.xr.model.SysMenu;
import com.xr.model.SysRoleMenu;
import com.xr.service.SysMenuService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 0:26
 * @Description 角色表
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

    private SysMenuService sysMenuService;

    @Autowired
    public SysMenuController(SysMenuService sysMenuService) {
        this.sysMenuService = sysMenuService;
    }

    @RequestMapping("list")
    public ResponseResult list(){
        ResponseResult result = new ResponseResult();
        result.getData().put("menuList", sysMenuService.listMenuAll());
        return result;
    }

    @RequestMapping("listById")
    public ResponseResult groupMenu1(Long id) {
        ResponseResult result = new ResponseResult();
        result.getData().put("menuList1", sysMenuService.selectMenuById(id));
        return result;
    }

  @RequestMapping("add")
  public ResponseResult add(Long[] a, Long rid) {
    SysRoleMenu sysRoleMenu = new SysRoleMenu();
    for (int i = 0; i < a.length; i++) {
      sysRoleMenu.setMid(a[i]);
      sysRoleMenu.setRid(rid);
      sysMenuService.addRoleMenuRelation(sysRoleMenu);
    }
      ResponseResult result = new ResponseResult();
      result.getData().put("message", "修改成功");
      return result;

  }


    @RequestMapping("update")
    public ResponseResult updateMenu(SysMenu sysMenu){
        sysMenuService.updateMenu(sysMenu);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult deleteMenu(Long rid){
        sysMenuService.delete(rid);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }


}
