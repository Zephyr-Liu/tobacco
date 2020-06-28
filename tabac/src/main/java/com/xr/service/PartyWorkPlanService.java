package com.xr.service;

import com.xr.model.PartyWorkPlan;

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



}
