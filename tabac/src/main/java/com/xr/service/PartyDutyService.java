package com.xr.service;



import java.util.List;
import com.xr.model.PartyDuty;

public interface PartyDutyService {


    public List<PartyDuty> listpartyDuty(PartyDuty partyDuty);


    /**
     * 添加用户
     * @param
     */
    public void insertSelective(PartyDuty partyWorkAarrangement);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(Long id);

    /**
     * 修改用户
     * @param
     */
    public void update(PartyDuty partyWorkAarrangement);

    int updateByPrimaryKeyStatus(PartyDuty record);

}
