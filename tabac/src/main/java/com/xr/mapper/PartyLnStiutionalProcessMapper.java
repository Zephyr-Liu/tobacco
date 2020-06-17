package com.xr.mapper;

import com.xr.model.PartyLnStiutionalProcess;
import com.xr.model.PartyLnStiutionalProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyLnStiutionalProcessMapper {
    long countByExample(PartyLnStiutionalProcessExample example);

    int deleteByExample(PartyLnStiutionalProcessExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(PartyLnStiutionalProcess record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyLnStiutionalProcess record);

    List<PartyLnStiutionalProcess> selectByExample(PartyLnStiutionalProcessExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyLnStiutionalProcess selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PartyLnStiutionalProcess record, @Param("example") PartyLnStiutionalProcessExample example);

    int updateByExample(@Param("record") PartyLnStiutionalProcess record, @Param("example") PartyLnStiutionalProcessExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyLnStiutionalProcess record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyLnStiutionalProcess record);
}