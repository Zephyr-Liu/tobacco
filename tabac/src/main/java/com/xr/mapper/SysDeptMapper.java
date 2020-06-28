package com.xr.mapper;

import com.xr.model.SysDept;
import com.xr.model.SysDeptExample;
import java.util.List;

import com.xr.model.SysMenu;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {
  long countByExample(SysDeptExample example);

  int deleteByExample(SysDeptExample example);

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
  int insert(SysDept record);

  /**
   * insert record to table selective
   *
   * @param record the record
   * @return insert count
   */
  int insertSelective(SysDept record);

  List<SysDept> selectByExample(SysDeptExample example);

  /**
   * select by primary key
   *
   * @param id primary key
   * @return object by primary key
   */
  SysDept selectByPrimaryKey(Integer id);

  int updateByExampleSelective(
      @Param("record") SysDept record, @Param("example") SysDeptExample example);

  int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example);

  /**
   * update record selective
   *
   * @param record the updated record
   * @return update count
   */
  int updateByPrimaryKeySelective(SysDept record);

  /**
   * update record
   *
   * @param record the updated record
   * @return update count
   */
  int updateByPrimaryKey(SysDept record);

  /**
   * 修改id
   *
   * @param updatedStatus 修改状态
   * @param id id
   * @return 删除是否成功
   */
  int updateStatusById(@Param("updatedStatus") Byte updatedStatus, @Param("id") Integer id);

  List<SysDept> selectMultilistMenu(SysDept sysDept);


}
