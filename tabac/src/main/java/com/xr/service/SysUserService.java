package com.xr.service;

import com.xr.model.SysRole;
import com.xr.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:00
 * @Description
 */
public interface SysUserService {

    /**
     * 添加用户
     *
     * @param sysUser
     */
    public void add(SysUser sysUser);

    /**
     * 根据id删除
     *
     * @param id
     */
    public void deleteById(Long id);

    /**
     * 修改用户
     *
     * @param sysUser
     */
    public void update(SysUser sysUser);

    /**
     * 根据条件查询用户
     *
     * @param sysUser
     * @param page
     * @param limit
     * @return
     *
     * 2020.6.22 添加需求  不容许 admin 看到自己 不允许删除自己
     */
    public List<SysUser> list(SysUser sysUser, Integer page, Integer limit);

    /**
     * 用户登录
     *
     * @param sysUser
     * @return
     */
    public SysUser login(SysUser sysUser);

    /**
     * 根据用户名查询用户信息
     *
     * @return
     */
    public SysUser findUserByUserName(String username);

    /**
     * 根据用户名获得角色的集合
     *
     * @param username
     * @return
     */
    public List<String> findUserRoles(String username);

    /**
     * 根据用户名查找用户信息（角色，权限）
     *
     * @param username
     * @return
     */
    public SysUser findUserByNameAndRoleAndMenu(String username);


    /**
     * 假则删除 实则修改状态
     * @param id
     */
    void deleteUserById(Long id);


    /**
    *根据用户名来查角色Id
     **/
     List<Long> findUserRolesId(String username);


    /**
     *  判断是否 拥有一样的用户名
     * @param username 用户名
     * @return 用户名
     */
     Long checkname(String username);


    List<SysRole>  selectRoleOrUser(Integer id);

    /**
     * 查询所有的角色
     * @return
     */
    List<SysRole> selectRole();


    /**
     *  查询所有不存在的 role
     * @param name
     * @return
     */
    List<SysRole> selectNotExits(String name);

    /**
     *  循环添加
     * @param a roleId
     * @param getUserId UserId
     */
    void addRoleGetUserByUserIdAndRoleId(Long a,Long getUserId);

    /**
     *
     * @param username 根据当前登陆的人查询头像
     * @return 头像
     */
    Map<String, String> listById(String username);

}
