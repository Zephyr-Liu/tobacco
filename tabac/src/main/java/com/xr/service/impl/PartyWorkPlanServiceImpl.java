package com.xr.service.impl;


import com.xr.mapper.PartyWorkPlanMapper;
import com.xr.model.PartyWorkPlan;
import com.xr.model.PartyWorkPlanExample;
import com.xr.service.PartyWorkPlanService;
import com.xr.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyWorkPlanServiceImpl implements PartyWorkPlanService {

    @Autowired
    private PartyWorkPlanMapper partyWorkPlanMapper;
    @Autowired
    private SysUserService sysUserService;

    @Override
    public void addWorkPlan() {

    }

    @Override
    public void updateWorkPlan(PartyWorkPlan partyWorkPlan) {

    }

    @Override
    public List<PartyWorkPlan> listPartyWorkPlan(PartyWorkPlan partyWorkPlan,String rids, String userName) {
        PartyWorkPlanExample example=new PartyWorkPlanExample();
        List<Long> userRoles =(sysUserService.findUserRolesId(userName));

//        System.out.println("所对应的角色Id"+userRoles.get(0));


       PartyWorkPlanExample.Criteria criteria = example.createCriteria();

            // 没有反应
        if (rids.trim().equals('2')){
            criteria.andCreateNameEqualTo(userName);
        }
        criteria.andStatusNotEqualTo((byte) 3);

            if (partyWorkPlan != null) {
                if (partyWorkPlan.getPlanTitle() != null) {
                    criteria.andPlanTitleLike("%" + partyWorkPlan.getPlanTitle() + "%");
                }
                if (partyWorkPlan.getCreateName() != null) {
                    criteria.andCreateNameLike("%" + partyWorkPlan.getCreateName() + "%");
                }
                if (partyWorkPlan.getStartTime()!=null&&partyWorkPlan.getEndTime()!=null){

                    criteria.andCreateDateBetween(partyWorkPlan.getStartTime(),partyWorkPlan.getEndTime());
                }
    }

        List<PartyWorkPlan> list =  partyWorkPlanMapper.selectByExample(example);
        return list;
    }

    @Override
    public void insertSelective(PartyWorkPlan partyWorkPlan) {
            partyWorkPlanMapper.insertSelective(partyWorkPlan);
    }

    @Override
    public void deleteById(PartyWorkPlan partyWorkPlan) {
            partyWorkPlanMapper.updateByPrimaryKeySelective(partyWorkPlan);
    }

    @Override
    public void update(PartyWorkPlan partyWorkPlan) {
            partyWorkPlanMapper.updateByPrimaryKey(partyWorkPlan);
    }

    @Override
    public int updateByPrimaryKeyStatus(PartyWorkPlan record) {
        return partyWorkPlanMapper.updateByPrimaryKeySelective(record);
    }
}
