package com.xr.mapper;

import com.xr.model.SysMenu;
import com.xr.model.SysMenuExample;
import java.util.List;

import com.xr.model.SysRoleMenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
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



    /**
     *  添加 角色和菜单的关系
     * @param sysRoleMenu sys_role_menu
     */
    @Insert("insert INTO sys_role_menu(role_id,menu_id) VALUES(#{rid},#{mid})")
     void addRoleMenuRelation(SysRoleMenu sysRoleMenu);

    /**
     *  根据id 查询所有的 菜单信息 从而取得权限
     * @param id 角色id
     * @return long id的数组
     */
    @Select(
            "SELECT m.id\n"
                    + "    from sys_user u\n"
                    + "    INNER JOIN sys_user_role ur\n"
                    + "    ON u.id = ur.user_id\n"
                    + "    INNER JOIN sys_role r\n"
                    + "    ON ur.role_id = r.id\n"
                    + "    INNER JOIN sys_role_menu rm\n"
                    + "    ON r.id = rm.role_id\n"
                    + "    INNER JOIN sys_menu m\n"
                    + "    ON m.id = rm.menu_id\n"
                    + "\twhere r.id=#{id} GROUP BY m.id")
    Long[] selectMenuById(Long id);

    /**
     * 物理删除
     * @param roleId 传来的id
     * @return 是否删除成功
     */
    @Delete("delete from sys_role_menu where role_id=#{roleId} ")
    int delete(@Param("roleId") Long roleId);
}
