package com.xr.service;

import com.xr.model.PartyWorkPlan;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/19 20:54
 * @Description
 */
public interface PartyWorkPlanService {

    /**
     *
     */
    void addWorkPlan();

    /**
     *
     * @param partyWorkPlan 对象
     */
    void updateWorkPlan(PartyWorkPlan partyWorkPlan);

    public List<PartyWorkPlan> listPartyWorkPlan(PartyWorkPlan partyWorkPlan, String rids, String userName);


    /**
     * 添加用户
     * @param
     */
    public void insertSelective(PartyWorkPlan partyWorkPlan);

    /**
     * 根据id删除
     * @param
     */
    public void deleteById(PartyWorkPlan partyWorkPlan);

    /**
     * 修改用户
     * @param
     */
    public void update(PartyWorkPlan partyWorkPlan);


    int updateByPrimaryKeyStatus(PartyWorkPlan record);

}
