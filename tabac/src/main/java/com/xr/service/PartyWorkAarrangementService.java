package com.xr.service;


import com.xr.model.PartyWorkArrangement;
import java.util.List;

public interface PartyWorkAarrangementService {


    public List<PartyWorkArrangement> listpartyWorkAarrangement(PartyWorkArrangement partyWorkArrangement,String rids,String username);


    /**
     * 添加用户
     * @param
     */
    public void insertSelective(PartyWorkArrangement partyWorkAarrangement);

    /**
     * 根据id删除
     * @param
     */
    public void deleteById(PartyWorkArrangement partyWorkArrangement);

    /**
     * 修改用户
     * @param
     */
    public int update(PartyWorkArrangement partyWorkAarrangement);

    int updateByPrimaryKeyStatus(PartyWorkArrangement record);

}
