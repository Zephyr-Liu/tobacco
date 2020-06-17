package com.xr.mapper;

import com.xr.model.PartyWorkPlan;
import com.xr.model.PartyWorkPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyWorkPlanMapper {
    long countByExample(PartyWorkPlanExample example);

    int deleteByExample(PartyWorkPlanExample example);

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
    int insert(PartyWorkPlan record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyWorkPlan record);

    List<PartyWorkPlan> selectByExample(PartyWorkPlanExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyWorkPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyWorkPlan record, @Param("example") PartyWorkPlanExample example);

    int updateByExample(@Param("record") PartyWorkPlan record, @Param("example") PartyWorkPlanExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyWorkPlan record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyWorkPlan record);
}