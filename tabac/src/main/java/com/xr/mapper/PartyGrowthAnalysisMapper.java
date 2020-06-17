package com.xr.mapper;

import com.xr.model.PartyGrowthAnalysis;
import com.xr.model.PartyGrowthAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyGrowthAnalysisMapper {
    long countByExample(PartyGrowthAnalysisExample example);

    int deleteByExample(PartyGrowthAnalysisExample example);

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
    int insert(PartyGrowthAnalysis record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyGrowthAnalysis record);

    List<PartyGrowthAnalysis> selectByExample(PartyGrowthAnalysisExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyGrowthAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyGrowthAnalysis record, @Param("example") PartyGrowthAnalysisExample example);

    int updateByExample(@Param("record") PartyGrowthAnalysis record, @Param("example") PartyGrowthAnalysisExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyGrowthAnalysis record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyGrowthAnalysis record);
}
