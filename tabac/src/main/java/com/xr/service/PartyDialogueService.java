package com.xr.service;

import com.xr.model.PartyDialogue;
import com.xr.model.PartyDialogueExample;

import java.util.List;

public interface PartyDialogueService {


    List<PartyDialogue> selectByExample(PartyDialogue example,String rids,String username);

    int insert(PartyDialogue record);

    int updateByPrimaryKey(PartyDialogue record);

    int updateByPrimaryKeySelective(PartyDialogue record);

}
