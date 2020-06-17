package com.xr.mapper;

import com.xr.model.PartyDuty;
import com.xr.model.PartyDutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyDutyMapper {
    long countByExample(PartyDutyExample example);

    int deleteByExample(PartyDutyExample example);

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
    int insert(PartyDuty record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyDuty record);

    List<PartyDuty> selectByExample(PartyDutyExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    PartyDuty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyDuty record, @Param("example") PartyDutyExample example);

    int updateByExample(@Param("record") PartyDuty record, @Param("example") PartyDutyExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyDuty record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyDuty record);
}