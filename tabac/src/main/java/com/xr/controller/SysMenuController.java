package com.xr.controller;

import com.xr.model.SysMenu;
import com.xr.service.SysMenuService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @RequiresPermissions("menu:list")
    public ResponseResult list(SysMenu sysMenu,Integer page,Integer limit){
        List<SysMenu> list = sysMenuService.listMenu(sysMenu);
        ResponseResult result=new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("menu:add")
    public ResponseResult addMenu(SysMenu sysMenu){
        ResponseResult result=new ResponseResult();
        sysMenuService.addMenu(sysMenu);
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("menu:update")
    public ResponseResult updateMenu(SysMenu sysMenu){
        sysMenuService.updateMenu(sysMenu);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("menu:delete")
    public ResponseResult deleteMenu(Long id){
        sysMenuService.deleteMenuById(id);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }


}
