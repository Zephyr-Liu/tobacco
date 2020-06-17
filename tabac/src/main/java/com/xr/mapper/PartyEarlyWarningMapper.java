package com.xr.mapper;

import com.xr.model.PartyEarlyWarning;
import com.xr.model.PartyEarlyWarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyEarlyWarningMapper {
    long countByExample(PartyEarlyWarningExample example);

    int deleteByExample(PartyEarlyWarningExample example);

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
    int insert(PartyEarlyWarning record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyEarlyWarning record);

    List<PartyEarlyWarning> selectByExample(PartyEarlyWarningExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyEarlyWarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyEarlyWarning record, @Param("example") PartyEarlyWarningExample example);

    int updateByExample(@Param("record") PartyEarlyWarning record, @Param("example") PartyEarlyWarningExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyEarlyWarning record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyEarlyWarning record);
}
