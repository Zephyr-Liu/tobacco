package com.xr.service.impl;

import com.xr.mapper.PartyInformationMapper;
import com.xr.model.PartyInformation;
import com.xr.model.PartyInformationExample;
import com.xr.service.PartyInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 14:49
 * @Description
 */
@Service
public class PartyInformationServiceImpl implements PartyInformationService {

    private PartyInformationMapper partyInformationMapper;

    @Autowired
    public PartyInformationServiceImpl(PartyInformationMapper partyInformationMapper) {
        this.partyInformationMapper = partyInformationMapper;
    }

    @Override
    public void addPartyInformation(PartyInformation partyInformation) {
        partyInformationMapper.insertSelective(partyInformation);
    }

    @Override
    public void updatePartyInformation(PartyInformation partyInformation) {
        partyInformationMapper.updateByPrimaryKeySelective(partyInformation);
    }

    @Override
    public List<PartyInformation> selectPartyInformationList(PartyInformation partyInformation)  {
        PartyInformationExample partyInformationExample=new PartyInformationExample();
        PartyInformationExample.Criteria criteria=partyInformationExample.createCriteria();
        criteria.andStatusEqualTo((byte) 0);
        if(partyInformation != null){
            if (partyInformation.getInfoTitle()!=null){
                criteria.andInfoTitleLike("%"+partyInformation.getInfoTitle()+"%");
            }
            if (partyInformation.getInfoContent()!=null){
                criteria.andInfoContentLike("%"+partyInformation.getInfoContent()+"%");
            }
            if (partyInformation.getStartTime()!=null&&partyInformation.getEndTime()!=null){

                criteria.andInfoIssueDateBetween(partyInformation.getStartTime(),partyInformation.getEndTime());
            }
        }
        return partyInformationMapper.selectByExample(partyInformationExample);
    }

    @Override
    public void deletePartyInformationById(Integer id) {
        partyInformationMapper.updateStatusById((byte) 1,id);
    }
}
