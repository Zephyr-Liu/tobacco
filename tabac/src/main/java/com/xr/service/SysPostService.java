package com.xr.service;

import com.xr.model.SysJob;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 0:29
 * @Description
 */
public interface SysPostService {

    /**
     * 查询所有
     * @param sysJob 对象
     * @return 集合
     */
    List<SysJob> selectByJob(SysJob sysJob);

    /**
     * 添加
     * @param sysJob 前端传的对象
     */
    void addJob(SysJob sysJob);

    /**
     * 修改
     */
    void updateJob();

    /**
     * 删除 id 传值
     * @param id id
     */
    void deleteJobById(int id);

    /**
     * 查询所有的岗位
     * @param sysJob  对象
     * @return 集合
     */
    List<SysJob> selectAllJobs(SysJob sysJob);
}
