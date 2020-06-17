package com.xr.mapper;

import com.xr.model.PartyPositionRisk;
import com.xr.model.PartyPositionRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyPositionRiskMapper {
    long countByExample(PartyPositionRiskExample example);

    int deleteByExample(PartyPositionRiskExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(PartyPositionRisk record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyPositionRisk record);

    List<PartyPositionRisk> selectByExample(PartyPositionRiskExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PartyPositionRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyPositionRisk record, @Param("example") PartyPositionRiskExample example);

    int updateByExample(@Param("record") PartyPositionRisk record, @Param("example") PartyPositionRiskExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyPositionRisk record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyPositionRisk record);
}