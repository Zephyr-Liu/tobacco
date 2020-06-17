package com.xr.mapper;

import com.xr.model.PartySupervisionResponsibility;
import com.xr.model.PartySupervisionResponsibilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartySupervisionResponsibilityMapper {
    long countByExample(PartySupervisionResponsibilityExample example);

    int deleteByExample(PartySupervisionResponsibilityExample example);

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
    int insert(PartySupervisionResponsibility record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartySupervisionResponsibility record);

    List<PartySupervisionResponsibility> selectByExample(PartySupervisionResponsibilityExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartySupervisionResponsibility selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartySupervisionResponsibility record, @Param("example") PartySupervisionResponsibilityExample example);

    int updateByExample(@Param("record") PartySupervisionResponsibility record, @Param("example") PartySupervisionResponsibilityExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartySupervisionResponsibility record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartySupervisionResponsibility record);
}