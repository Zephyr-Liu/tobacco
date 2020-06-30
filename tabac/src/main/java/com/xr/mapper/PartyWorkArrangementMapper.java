package com.xr.mapper;

import com.xr.model.PartyWorkArrangement;
import com.xr.model.PartyWorkArrangementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyWorkArrangementMapper {
    long countByExample(PartyWorkArrangementExample example);

    int deleteByExample(PartyWorkArrangementExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(PartyWorkArrangement record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyWorkArrangement record);

    List<PartyWorkArrangement> selectByExample(PartyWorkArrangementExample example);

    int updateByExampleSelective(@Param("record") PartyWorkArrangement record, @Param("example") PartyWorkArrangementExample example);

    int updateByExample(@Param("record") PartyWorkArrangement record, @Param("example") PartyWorkArrangementExample example);

    int updateByPrimaryKeySelective(PartyWorkArrangement record);

    int updateByPrimaryKey(PartyWorkArrangement partyWorkAarrangement);
}
