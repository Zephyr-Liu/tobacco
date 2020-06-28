package com.xr.service.impl;



import com.xr.mapper.PartyDutyMapper;
import com.xr.model.PartyDuty;
import com.xr.model.PartyDutyExample;
import com.xr.service.PartyDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class PartyDutyServiceImpl implements PartyDutyService {

    @Autowired
    private PartyDutyMapper partyDutyMapper;


    @Override
    public List<PartyDuty> listpartyDuty(PartyDuty partyDuty) {
            PartyDutyExample example=new PartyDutyExample();

        PartyDutyExample.Criteria criteria = example.createCriteria();
        if(partyDuty!=null){
            if(partyDuty.getDutyItle()!=null){
                criteria.andDutyItleLike("%"+partyDuty.getDutyItle()+"%");
            }
            // 还可以添加其他属性的条件
            if(partyDuty.getDutyContent()!=null){
                criteria.andDutyContentLike("%"+partyDuty.getDutyContent()+"%");
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
        return partyDutyMapper.updateByPrimaryKeyStatus(record);
    }
}
