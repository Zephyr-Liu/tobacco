package com.xr.mapper;

import com.xr.model.SysMenu;
import com.xr.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface SysMenuMapper {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

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
    int insert(SysMenu record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysMenu record);

    /**
     *  修改状态
     * @param updatedDelFlag 修改状态
     * @param id id
     */
    void updateDelFlagById(@Param("updatedDelFlag")Byte updatedDelFlag,@Param("id")Long id);


  /*  List<SysMenu> listPermissions(String username, long parentid);*/

    //动态路由 根据角色查询菜单 父菜单
    @Select("select m.id,m.`name`,m.parent_id,m.url,m.perms,m.type,m.icon,m.order_num from sys_user u, sys_user_role ur,sys_role r,sys_role_menu rm ,sys_menu m where u.id = ur.user_id  and ur.role_id = r.id and r.id = rm.role_id and m.id = rm.menu_id and r.del_flag=0 and m.del_flag=0 and u.del_flag=0 and  r.name=#{name} and m.parent_id=#{parentId} AND m.type != 2 GROUP BY m.id")
    @Results({
            @Result(id =true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "parent_id",property = "parentId"),
            @Result(column = "url",property = "url"),
            @Result(column = "perms",property = "perms"),
            @Result(column = "type",property = "type"),
            @Result(column = "icon",property = "icon"),
            @Result(column = "order_num",property = "orderNum")
    })
    public List<SysMenu> listPermissions(@Param("name") String username,@Param("parentId") long parentid);





}
