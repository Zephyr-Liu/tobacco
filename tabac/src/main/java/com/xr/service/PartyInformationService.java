package com.xr.service;

import com.xr.model.PartyInformation;

import java.text.ParseException;
import java.util.List;

/**
 * @author Zephyr.Liu
 * @create 2020/6/18 14:43
 *      资讯表的curd
 *      廉政教育资讯
 */
public interface PartyInformationService {

    /**
     * 添加
     * @param partyInformation 对象
     */
    void addPartyInformation(PartyInformation partyInformation);

    /**
     *  修改
     * @param partyInformation 对象
     */
    void updatePartyInformation(PartyInformation partyInformation);

    /**
     * 查询
     * @return 集合
     */
    List<PartyInformation> selectPartyInformationList(PartyInformation partyInformation) ;

    /**
     * 删除 实际上是修改状态
     * @param id 当前资讯id
     */
    void deletePartyInformationById(Integer id);

}
