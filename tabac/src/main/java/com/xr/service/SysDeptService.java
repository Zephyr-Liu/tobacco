package com.xr.service;

import com.xr.model.SysDept;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:37
 * @Description
 */
public interface SysDeptService {

    /**
     * 分组
     *
     * @return
     */
    List<SysDept> getGroupDept();

    /**
     * 修改
     * @param sysDept 对象
     */
    void updateDept(SysDept sysDept);

    /**
     * 添加
     * @param sysDept 对象
     */
    void addSysDept(SysDept sysDept);

    /**
     * 修改状态 假装删除
     * @param id
     */
    void deleteSysDeptById(Integer id);

    /**
     * 查询所有
     * @param sysDept 查询所有
     * @return
     */
    List<SysDept> selectSysDept(SysDept sysDept);
}
