package com.xr.mapper;

import com.xr.model.PartyRiskAssessment;
import com.xr.model.PartyRiskAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyRiskAssessmentMapper {
    long countByExample(PartyRiskAssessmentExample example);

    int deleteByExample(PartyRiskAssessmentExample example);

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
    int insert(PartyRiskAssessment record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyRiskAssessment record);

    List<PartyRiskAssessment> selectByExample(PartyRiskAssessmentExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyRiskAssessment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyRiskAssessment record, @Param("example") PartyRiskAssessmentExample example);

    int updateByExample(@Param("record") PartyRiskAssessment record, @Param("example") PartyRiskAssessmentExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyRiskAssessment record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyRiskAssessment record);
}
