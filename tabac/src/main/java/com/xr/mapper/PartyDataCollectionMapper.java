package com.xr.mapper;

import com.xr.model.PartyDataCollection;
import com.xr.model.PartyDataCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyDataCollectionMapper {
    long countByExample(PartyDataCollectionExample example);

    int deleteByExample(PartyDataCollectionExample example);

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
    int insert(PartyDataCollection record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyDataCollection record);

    List<PartyDataCollection> selectByExample(PartyDataCollectionExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyDataCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyDataCollection record, @Param("example") PartyDataCollectionExample example);

    int updateByExample(@Param("record") PartyDataCollection record, @Param("example") PartyDataCollectionExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyDataCollection record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyDataCollection record);
}
