package com.xr.mapper;

import com.xr.model.PartyPublishArticle;
import com.xr.model.PartyPublishArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyPublishArticleMapper {
    long countByExample(PartyPublishArticleExample example);

    int deleteByExample(PartyPublishArticleExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(PartyPublishArticle record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyPublishArticle record);

    List<PartyPublishArticle> selectByExample(PartyPublishArticleExample example);

    int updateByExampleSelective(@Param("record") PartyPublishArticle record, @Param("example") PartyPublishArticleExample example);

    int updateByExample(@Param("record") PartyPublishArticle record, @Param("example") PartyPublishArticleExample example);
}