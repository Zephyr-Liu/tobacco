package com.xr.mapper;

import com.xr.model.PartyProcessRisk;
import com.xr.model.PartyProcessRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyProcessRiskMapper {
    long countByExample(PartyProcessRiskExample example);

    int deleteByExample(PartyProcessRiskExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(PartyProcessRisk record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyProcessRisk record);

    List<PartyProcessRisk> selectByExample(PartyProcessRiskExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyProcessRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyProcessRisk record, @Param("example") PartyProcessRiskExample example);

    int updateByExample(@Param("record") PartyProcessRisk record, @Param("example") PartyProcessRiskExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyProcessRisk record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyProcessRisk record);
}
