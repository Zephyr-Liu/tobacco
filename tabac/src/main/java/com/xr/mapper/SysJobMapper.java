package com.xr.mapper;

import com.xr.model.SysJob;
import com.xr.model.SysJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobMapper {
    long countByExample(SysJobExample example);

    int deleteByExample(SysJobExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SysJob record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SysJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByExample(@Param("record") SysJob record, @Param("example") SysJobExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysJob record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysJob record);

    int updateStatusById(@Param("updatedStatus")Byte updatedStatus,@Param("id")Integer id);


}
