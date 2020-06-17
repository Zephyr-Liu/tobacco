package com.xr.mapper;

import com.xr.model.PartySupervise;
import com.xr.model.PartySuperviseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartySuperviseMapper {
    long countByExample(PartySuperviseExample example);

    int deleteByExample(PartySuperviseExample example);

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
    int insert(PartySupervise record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartySupervise record);

    List<PartySupervise> selectByExample(PartySuperviseExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartySupervise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartySupervise record, @Param("example") PartySuperviseExample example);

    int updateByExample(@Param("record") PartySupervise record, @Param("example") PartySuperviseExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartySupervise record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartySupervise record);
}