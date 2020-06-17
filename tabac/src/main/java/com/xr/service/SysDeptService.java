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


}
