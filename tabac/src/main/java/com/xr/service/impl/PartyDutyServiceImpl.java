package com.xr.service.impl;



import com.xr.mapper.PartyDutyMapper;
import com.xr.model.PartyDutyExample;
import com.xr.service.PartyDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xr.model.PartyDuty;

import java.util.List;

@Service
public  class PartyDutyServiceImpl implements PartyDutyService {

    @Autowired
    private PartyDutyMapper partyDutyMapper;


    @Override
    public List<PartyDuty> listpartyDuty(PartyDuty partyDuty,String rids,String username) {
        PartyDutyExample example=new PartyDutyExample();

        PartyDutyExample.Criteria criteria = example.createCriteria();
        System.out.println("登录人角色"+rids);
        if (rids.equals('2')){
            System.out.println(rids);
            System.out.println("登录人姓名"+username);
            criteria.andCreateNameEqualTo(username);
        }
        criteria.andStatusNotEqualTo((byte) 3);
        if(partyDuty!=null){
            if(partyDuty.getDutyTitle()!=null){
                criteria.andDutyTitleLike("%"+partyDuty.getDutyTitle()+"%");
            }
            // 还可以添加其他属性的条件
            if(partyDuty.getCreateName()!=null){
                criteria.andCreateNameLike("%"+partyDuty.getCreateName()+"%");
            }
            if (partyDuty.getStartTime()!=null&&partyDuty.getEndTime()!=null){

                criteria.andCreateDateBetween(partyDuty.getStartTime(),partyDuty.getEndTime());
            }
        }
        List<PartyDuty> list =  partyDutyMapper.selectByExample(example);
        return list;
    }



    @Override
    public void insertSelective(PartyDuty partyDuty) {
                partyDutyMapper.insertSelective(partyDuty);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(PartyDuty partyDuty) {
                partyDutyMapper.updateByPrimaryKey(partyDuty);
    }

    @Override
    public int updateByPrimaryKeyStatus(PartyDuty record) {
        return partyDutyMapper.updateByPrimaryKeySelective(record);
    }
}
