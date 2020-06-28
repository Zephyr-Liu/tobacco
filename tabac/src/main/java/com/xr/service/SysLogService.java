package com.xr.service;

import com.xr.model.SysLog;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @create 2020/6/28 15:13
 *
 *  日志管理
 */
public interface SysLogService {
    /**
     * 添加日志
     * @param sysLog 日志
     */
    void addLog(SysLog sysLog) throws Exception;

    /**
     *  查询所有 根据条件查询
     * @param sysLog 对象
     * @return   集合
     */
     List<SysLog> selectLog(SysLog sysLog);
}
