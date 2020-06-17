package com.xr.mapper;

import com.xr.model.PartyMeasureMangement;
import com.xr.model.PartyMeasureMangementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyMeasureMangementMapper {
    long countByExample(PartyMeasureMangementExample example);

    int deleteByExample(PartyMeasureMangementExample example);

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
    int insert(PartyMeasureMangement record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyMeasureMangement record);

    List<PartyMeasureMangement> selectByExample(PartyMeasureMangementExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyMeasureMangement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyMeasureMangement record, @Param("example") PartyMeasureMangementExample example);

    int updateByExample(@Param("record") PartyMeasureMangement record, @Param("example") PartyMeasureMangementExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyMeasureMangement record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyMeasureMangement record);
}