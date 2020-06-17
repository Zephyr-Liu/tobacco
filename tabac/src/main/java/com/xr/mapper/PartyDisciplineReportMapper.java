package com.xr.mapper;

import com.xr.model.PartyDisciplineReport;
import com.xr.model.PartyDisciplineReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyDisciplineReportMapper {
    long countByExample(PartyDisciplineReportExample example);

    int deleteByExample(PartyDisciplineReportExample example);

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
    int insert(PartyDisciplineReport record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyDisciplineReport record);

    List<PartyDisciplineReport> selectByExample(PartyDisciplineReportExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyDisciplineReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyDisciplineReport record, @Param("example") PartyDisciplineReportExample example);

    int updateByExample(@Param("record") PartyDisciplineReport record, @Param("example") PartyDisciplineReportExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyDisciplineReport record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyDisciplineReport record);
}