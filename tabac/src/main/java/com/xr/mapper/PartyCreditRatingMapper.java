package com.xr.mapper;

import com.xr.model.PartyCreditRating;
import com.xr.model.PartyCreditRatingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyCreditRatingMapper {
    long countByExample(PartyCreditRatingExample example);

    int deleteByExample(PartyCreditRatingExample example);

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
    int insert(PartyCreditRating record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PartyCreditRating record);

    List<PartyCreditRating> selectByExample(PartyCreditRatingExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PartyCreditRating selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartyCreditRating record, @Param("example") PartyCreditRatingExample example);

    int updateByExample(@Param("record") PartyCreditRating record, @Param("example") PartyCreditRatingExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PartyCreditRating record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PartyCreditRating record);
}
