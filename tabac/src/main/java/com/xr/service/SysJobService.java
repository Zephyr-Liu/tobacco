package com.xr.service;

import com.xr.model.SysJob;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @create 2020/6/22 10:18
 *
 * 岗位的管理
 */
public interface SysJobService {
    /**
     * 工作部门查询
     */
    List<Map<String, Object>> joblist(SysJob job);

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



}
