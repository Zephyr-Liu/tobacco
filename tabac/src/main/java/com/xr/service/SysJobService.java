package com.xr.service;

import com.xr.model.SysJob;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @create 2020/6/22 10:18
 *
 * 岗位的管理
 */
public interface SysJobService {

    /**
     *  添加岗位
     * @param sysJob 岗位
     */
    void addJob(SysJob sysJob);

    /**
     * 修改对象
     * @param sysJobS  岗位对象
     */
    void updateJob(SysJob sysJobS);

    /**
     * 跟据id 删除   实则修改状态
     * @param id  id
     */
    void deleteJob(Integer id);


    /**
     * 查询所有  根据条件查询
     * @param sysJob 对象 根据条件查询
     * @return  集合
     */
    List<SysJob> query(SysJob sysJob);
}
