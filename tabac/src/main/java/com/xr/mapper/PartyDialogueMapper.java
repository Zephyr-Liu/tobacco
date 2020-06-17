package com.xr.mapper;

import com.xr.model.PartyDialogue;
import com.xr.model.PartyDialogueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyDialogueMapper {
    long countByExample(PartyDialogueExample example);

    int deleteByExample(PartyDialogueExample example);

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
    int insert(PartyDialogue record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyDialogue record);

    List<PartyDialogue> selectByExample(PartyDialogueExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyDialogue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyDialogue record, @Param("example") PartyDialogueExample example);

    int updateByExample(@Param("record") PartyDialogue record, @Param("example") PartyDialogueExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyDialogue record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyDialogue record);
}
