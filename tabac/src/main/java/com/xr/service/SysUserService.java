package com.xr.service;

import com.xr.model.SysUser;

import java.util.List;

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
     * @return
     */
    public List<SysUser> list(SysUser sysUser);

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


}
