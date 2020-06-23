package com.xr.controller;

import com.xr.model.PartyInformation;
import com.xr.service.PartyInformationService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 16:51
 * @Description  廉政教育资讯
 */
@RestController
@RequestMapping("information")
public class PartyInformationController {


    private PartyInformationService partyInformationService;

    @Autowired
    public PartyInformationController(PartyInformationService partyInformationService) {
        this.partyInformationService = partyInformationService;
    }


    @RequestMapping("list")
    @RequiresPermissions("information:list")
    public ResponseResult list(PartyInformation partyInformation, Integer page, Integer limit){
        List<PartyInformation> list = partyInformationService.selectPartyInformationList(partyInformation);
        ResponseResult result=new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("information:update")
    public ResponseResult updateParty(PartyInformation partyInformation){
        partyInformationService.updatePartyInformation(partyInformation);
        ResponseResult result= new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("information:add")
    public ResponseResult addParty(PartyInformation partyInformation){
        partyInformationService.addPartyInformation(partyInformation);
        ResponseResult result= new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("information:delete")
    public ResponseResult deleteInfo(Integer id){
        partyInformationService.deletePartyInformationById(id);
        ResponseResult result= new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

}
