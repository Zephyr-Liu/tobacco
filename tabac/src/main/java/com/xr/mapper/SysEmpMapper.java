package com.xr.mapper;

import com.xr.model.SysEmp;
import com.xr.model.SysEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEmpMapper {


    long countByExample(SysEmpExample example);

    int deleteByExample(SysEmpExample example);

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
    int insert(SysEmp record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysEmp record);

    List<SysEmp> selectByExample(SysEmpExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysEmp record, @Param("example") SysEmpExample example);

    int updateByExample(@Param("record") SysEmp record, @Param("example") SysEmpExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysEmp record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysEmp record);

    /**
     * 修改状态
     *
     * @param updatedStatus 对象
     * @param id            id
     * @return 修改成功
     */
    int updateStatusById(@Param("updatedStatus") Integer updatedStatus, @Param("id") Integer id);


    /**
     *  自定义的查询方法 也是查询所有
     * @return 集合数据
     */
    List<SysEmp> empAndDeptAndJob();

    public SysEmp findUserByNameAndRoleAndMenu(String empname);
}
