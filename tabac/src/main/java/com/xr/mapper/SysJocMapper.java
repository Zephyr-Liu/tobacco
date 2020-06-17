package com.xr.mapper;

import com.xr.model.SysJoc;
import com.xr.model.SysJocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJocMapper {
    long countByExample(SysJocExample example);

    int deleteByExample(SysJocExample example);

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
    int insert(SysJoc record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysJoc record);

    List<SysJoc> selectByExample(SysJocExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysJoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysJoc record, @Param("example") SysJocExample example);

    int updateByExample(@Param("record") SysJoc record, @Param("example") SysJocExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysJoc record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysJoc record);
}