package com.xr.controller;

import com.xr.model.SysDept;
import com.xr.model.SysRole;
import com.xr.service.SysDeptService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:37
 * @Description  部门表的 CURD
 */
@RestController
@RequestMapping("dept")
public class SysDeptController {

    private SysDeptService sysDeptService;

    @Autowired
    public SysDeptController(SysDeptService sysDeptService) {
        this.sysDeptService = sysDeptService;
    }

    /**
     * 获取分组好的部门信息，供前台部门下拉框使用
     *
     * @return 查寻所有的部门
     */
    @RequestMapping("groupDept")
    public ResponseResult groupDept() {
        ResponseResult result = new ResponseResult();
        result.getData().put("deptList", sysDeptService.getGroupDept());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("dept:add")
    public ResponseResult addDept(SysDept dept){
        ResponseResult result =new ResponseResult();
        sysDeptService.addSysDept(dept);
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("dept:update")
    public ResponseResult updateDept(SysDept dept){
        ResponseResult result= new ResponseResult();
        sysDeptService.updateDept(dept);
        result.getData().put("message","修改成功");
        return result;
    }


    @RequestMapping("delete")
    @RequiresPermissions("dept:delete")
    public ResponseResult deleteDept (Integer id){
        ResponseResult result =new ResponseResult();
        sysDeptService.deleteSysDeptById(id);
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("dept:list")
    public ResponseResult list(SysDept sysDept,Integer page,Integer limit){
        ResponseResult result=new ResponseResult();
        List<Map<String, Object>> list = sysDeptService.query(sysDept);
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("inEmpFaceDeptDataNeatenData")
    public ResponseResult inEmpFaceDeptDataNeatenData() {
        ResponseResult result = new ResponseResult();
        result.getData().put("deptList", sysDeptService.inEmpFaceDeptDataNeatenData());
        return result;
    }
}
