package com.xr.mapper;

import com.xr.model.SysRole;
import com.xr.model.SysUser;
import com.xr.model.SysUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Coisini
 */
@Mapper
public interface SysUserMapper<countByUsername, selectByIdQueryUserRoleRelationExist> {
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
     *  修改状态
     * @param updatedStatus 状态
     * @param id id
     * @return
     */
    int updateStatusById(@Param("updatedStatus")Byte updatedStatus,@Param("id")Long id);


    /**
    根据用户名来查角色Id
    */
     List<Long> findUserRolesId(String username);


    /**
     *  查询 username 是否存在
     * @param username  查询
     * @return 是否存在
     */
     Long countByUsername(@Param("username")String username);


     @Select("select * from sys_user u inner join sys_user_role sur on u.id=sur.user_id inner  join  sys_role r on r.id=sur.role_id")
     List<Map<String, Object>> selectByIdQueryUserRoleRelationExist(Integer id);


     @Select("select  * from sys_role r , sys_user_role ur ,sys_user u where  u.id=#{id} and u.id=ur.user_id and r.id=ur.role_id")
     List<SysRole>  selectRoleOrUser(Integer id);

     @Select("select  * from sys_role where del_flag=0 ")
     List<SysRole> selectRole();


     @Select("select * from sys_role where not FIND_IN_SET(`name`,#{name})")
     List<SysRole> selectNotExits(String name);

     @Insert("insert into sys_user_role(user_id,role_id) values(#{getUserId},#{a})")
     void addRoleGetUserByUserIdAndRoleId(@Param("a") Long a,@Param("getUserId") Long getUserId);

     @Select("select  avatar from sys_user where username=#{username}")
     Map<String, String> listById(@Param("username") String username);
}
