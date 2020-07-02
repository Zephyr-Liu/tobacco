package com.xr.service;

import com.xr.model.SysMenu;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @create 2020/6/23 11:17
 */
public interface SysMenuService {

    /**
     * 添加
     * @param sysMenu 对象
     */
    void addMenu(SysMenu sysMenu);

    /**
     * 修改 菜单
     */
    void updateMenu(SysMenu sysMenu);

    /**
     *  修改状态
     * @param id id
     */
    void deleteMenuById(Long id);

    /**
     *  查询所有 根据条件查询
     * @param sysMenu 条件
     * @return 集合
     */
    List<Map<String, Object>> listMenu(SysMenu sysMenu);


}
