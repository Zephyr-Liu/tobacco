package com.xr.controller;

import com.xr.model.SysDept;
import com.xr.model.SysEmp;
import com.xr.service.SysEmpService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/20 18:34
 * @Description  系统管理  员工管理
 */
@RestController
@RequestMapping("emp")
public class SysEmpController {

    private SysEmpService sysEmpService;

    @Autowired
    public SysEmpController(SysEmpService sysEmpService) {
        this.sysEmpService = sysEmpService;
    }

    @RequestMapping("add")
    @RequiresPermissions("emp:add")
    public ResponseResult addDept(SysEmp sysEmp){
        ResponseResult result =new ResponseResult();
        sysEmpService.addEmp(sysEmp);
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("emp:update")
    public ResponseResult updateDept(SysEmp sysEmp){
        ResponseResult result= new ResponseResult();
        sysEmpService.updateEmp(sysEmp);
        result.getData().put("message","修改成功");
        return result;
    }


    @RequestMapping("delete")
    @RequiresPermissions("emp:delete")
    public ResponseResult deleteEmp (Integer id){
        ResponseResult result =new ResponseResult();
        sysEmpService.deleteSysEmpById(id);
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("emp:list")
    public ResponseResult list(SysEmp sysEmp,Integer page,Integer limit){
        ResponseResult result=new ResponseResult();
        List<SysEmp> list = sysEmpService.selectAll(sysEmp);
        result.getData().put("items",list);
        result.getData().put("total", list.size());
        return result;
    }


}
