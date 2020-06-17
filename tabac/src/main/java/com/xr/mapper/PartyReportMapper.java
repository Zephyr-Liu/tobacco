package com.xr.mapper;

import com.xr.model.PartyReport;
import com.xr.model.PartyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyReportMapper {
    long countByExample(PartyReportExample example);

    int deleteByExample(PartyReportExample example);

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
    int insert(PartyReport record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyReport record);

    List<PartyReport> selectByExample(PartyReportExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyReport record, @Param("example") PartyReportExample example);

    int updateByExample(@Param("record") PartyReport record, @Param("example") PartyReportExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyReport record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyReport record);
}