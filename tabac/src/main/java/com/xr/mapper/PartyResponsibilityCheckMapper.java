package com.xr.mapper;

import com.xr.model.PartyResponsibilityCheck;
import com.xr.model.PartyResponsibilityCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyResponsibilityCheckMapper {
    long countByExample(PartyResponsibilityCheckExample example);

    int deleteByExample(PartyResponsibilityCheckExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(PartyResponsibilityCheck record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyResponsibilityCheck record);

    List<PartyResponsibilityCheck> selectByExample(PartyResponsibilityCheckExample example);

    int updateByExampleSelective(@Param("record") PartyResponsibilityCheck record, @Param("example") PartyResponsibilityCheckExample example);

    int updateByExample(@Param("record") PartyResponsibilityCheck record, @Param("example") PartyResponsibilityCheckExample example);
}