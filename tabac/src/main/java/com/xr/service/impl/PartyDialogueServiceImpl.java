package com.xr.service.impl;

import com.xr.mapper.PartyDialogueMapper;
import com.xr.model.PartyDialogue;
import com.xr.model.PartyDialogueExample;
import com.xr.service.PartyDialogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyDialogueServiceImpl implements PartyDialogueService {

    @Autowired
    PartyDialogueMapper partyDialogueMapper;

    @Override
    public List<PartyDialogue> selectByExample(PartyDialogue partyDialogue,String rids,String username) {
        PartyDialogueExample example=new PartyDialogueExample();

        PartyDialogueExample.Criteria criteria = example.createCriteria();
        System.out.println("登录人角色"+rids);
        System.out.println();
        if (rids.trim().equals('2')){
            System.out.println(rids);
            System.out.println("登录人姓名"+username);
            criteria.andCreateNameEqualTo(username);
        }
        criteria.andStatusNotEqualTo((byte) 3);
        if(partyDialogue!=null){
            //谈话类型
            if(partyDialogue.getTalkType()!=null){
                criteria.andTalkTypeEqualTo(partyDialogue.getTalkType());
            }
            // 还可以添加其他属性的条件
            if(partyDialogue.getCreateName()!=null){
                criteria.andCreateNameLike("%"+partyDialogue.getCreateName()+"%");
            }
            if (partyDialogue.getStartTime()!=null&&partyDialogue.getEndTime()!=null){

                criteria.andCreateDateBetween(partyDialogue.getStartTime(),partyDialogue.getEndTime());
            }
        }
        List<PartyDialogue> list =  partyDialogueMapper.selectByExample(example);
        return list;
    }

    @Override
    public int insert(PartyDialogue record) {
        return partyDialogueMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(PartyDialogue record) {
        return partyDialogueMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(PartyDialogue record) {
        return partyDialogueMapper.updateByPrimaryKeySelective(record);
    }


}
