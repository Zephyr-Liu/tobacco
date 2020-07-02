package com.xr.service.impl;


import com.xr.mapper.PartyWorkArrangementMapper;
import com.xr.model.PartyWorkArrangement;
import com.xr.model.PartyWorkArrangementExample;
import com.xr.service.PartyWorkAarrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyWorkAarrangementServiceImpl implements PartyWorkAarrangementService {

    @Autowired
    PartyWorkArrangementMapper partyWorkArrangementMapper;

    @Override
    public List<PartyWorkArrangement> listpartyWorkAarrangement(PartyWorkArrangement partyWorkAarrangement,String rids,String username) {
        PartyWorkArrangementExample example=new PartyWorkArrangementExample();

        PartyWorkArrangementExample.Criteria criteria = example.createCriteria();

        // 没有反应
        if (rids.trim().equals('2')){
            criteria.andCreateNameEqualTo(username);
        }
        criteria.andStatusNotEqualTo((byte) 3);
        if(partyWorkAarrangement!=null){
            if(partyWorkAarrangement.getWorkDeploymentTitle()!=null){
                criteria.andWorkDeploymentTitleLike("%"+partyWorkAarrangement.getWorkDeploymentTitle()+"%");
            }
            // 还可以添加其他属性的条件
            if(partyWorkAarrangement.getCreateName()!=null){
                criteria.andCreateNameLike("%"+partyWorkAarrangement.getCreateName()+"%");
            }
            if (partyWorkAarrangement.getStartTime()!=null&&partyWorkAarrangement.getEndTime()!=null){

                criteria.andCreateDateBetween(partyWorkAarrangement.getStartTime(),partyWorkAarrangement.getEndTime());
            }
        }
        List<PartyWorkArrangement> list =  partyWorkArrangementMapper.selectByExample(example);
        return list;
    }

    @Override
    public void insertSelective(PartyWorkArrangement partyWorkAarrangement) {
        partyWorkArrangementMapper.insertSelective(partyWorkAarrangement);
    }

    @Override
    public void deleteById(PartyWorkArrangement partyWorkArrangement) {
        partyWorkArrangementMapper.updateByPrimaryKeySelective(partyWorkArrangement);
    }

    @Override
    public int update(PartyWorkArrangement partyWorkAarrangement) {
      return   partyWorkArrangementMapper.updateByPrimaryKey(partyWorkAarrangement);
    }

    @Override
    public int updateByPrimaryKeyStatus(PartyWorkArrangement record) {
        return partyWorkArrangementMapper.updateByPrimaryKeySelective(record);
    }
}
