package com.xr.controller;

import com.xr.log.ControllerAspect;
import com.xr.model.SysLog;
import com.xr.service.SysLogService;
import com.xr.util.GetUserTokenInfo;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/28 15:36
 * @Description
 *  添加日志
 */
@RestController
@RequestMapping("log")
public class SysLogController {

    private SysLogService sysLogService;

    @Autowired
    public SysLogController(SysLogService sysLogService) {
        this.sysLogService = sysLogService;
    }

    @RequestMapping("list")
    @RequiresPermissions("log:list")
    public ResponseResult list(SysLog sysLog,Integer page,Integer limit){
        List<SysLog> list = sysLogService.selectLog(sysLog);
        ResponseResult result=new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        return result;
    }


}
