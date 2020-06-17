package com.xr.mapper;

import com.xr.model.PartyInformation;
import com.xr.model.PartyInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyInformationMapper {
    long countByExample(PartyInformationExample example);

    int deleteByExample(PartyInformationExample example);

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
    int insert(PartyInformation record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyInformation record);

    List<PartyInformation> selectByExample(PartyInformationExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyInformation record, @Param("example") PartyInformationExample example);

    int updateByExample(@Param("record") PartyInformation record, @Param("example") PartyInformationExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyInformation record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyInformation record);
}