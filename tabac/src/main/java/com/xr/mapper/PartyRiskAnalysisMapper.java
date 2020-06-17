package com.xr.mapper;

import com.xr.model.PartyRiskAnalysis;
import com.xr.model.PartyRiskAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyRiskAnalysisMapper {
    long countByExample(PartyRiskAnalysisExample example);

    int deleteByExample(PartyRiskAnalysisExample example);

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
    int insert(PartyRiskAnalysis record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyRiskAnalysis record);

    List<PartyRiskAnalysis> selectByExample(PartyRiskAnalysisExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyRiskAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyRiskAnalysis record, @Param("example") PartyRiskAnalysisExample example);

    int updateByExample(@Param("record") PartyRiskAnalysis record, @Param("example") PartyRiskAnalysisExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyRiskAnalysis record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyRiskAnalysis record);
}