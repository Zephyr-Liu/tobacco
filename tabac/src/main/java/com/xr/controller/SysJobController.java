package com.xr.controller;

import com.xr.model.SysJob;
import com.xr.service.SysJobService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/22 10:16
 * @Description  岗位管理
 *
 *  实现岗位的增删查改
 */
@RequestMapping("job")
@RestController
public class SysJobController {

    private SysJobService sysJobService;

    @Autowired
    public SysJobController(SysJobService sysJobService) {
        this.sysJobService = sysJobService;
    }


    @RequestMapping("list")
    @RequiresPermissions("job:list")
    public ResponseResult list(SysJob sysJob,Integer page,Integer limit){
        List<Map<String, Object>> list=sysJobService.joblist(sysJob);
        //List<SysJob> list = sysJobService.query(sysJob);
        ResponseResult result=new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(Integer id){
        sysJobService.deleteJob(id);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(SysJob sysJob){
        sysJobService.addJob(sysJob);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(SysJob sysJob){
        sysJobService.updateJob(sysJob);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
