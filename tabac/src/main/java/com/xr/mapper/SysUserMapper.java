package com.xr.mapper;

import com.xr.model.SysUser;
import com.xr.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Select;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

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
    int insert(SysUser record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户名查询用户角色和权限
     *
     * @param username 用户名
     * @return
     */
    List<SysUser> findUserByNameAndRoleAndMenu(String username);

    /**
     * 根据用户名查询角色集合
     *
     * @param username
     * @return
     */
    List<String> findUserRoles(String username);

    /**
     * 修改状态
     *
     * @param updatedStatus 状态
     * @param id            id
     * @return
     */
    int updateStatusById(@Param("updatedStatus") Byte updatedStatus, @Param("id") Long id);

    /**
     * 根据用户名来查角色Id
     */
    List<Long> findUserRolesId(String username);

    @Select("SELECT COUNT(*) FROM sys_user WHERE username=#{username}")
    /**
     * 判断 用户是否唯一
     * @param username
     * @return
     */
    int checkname(String username);
}