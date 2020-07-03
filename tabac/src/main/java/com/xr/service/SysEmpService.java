package com.xr.service;

import com.xr.model.SysEmp;
import com.xr.model.SysRole;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @create 2020/6/18 0:30
 *
 * 员工管理
 */
public interface SysEmpService {

    /**
     *  看起来是删除 实际上只是改变状态 这样就查不到了
     * @param id 角色id
     */
     void deleteSysEmpById(Integer id);

    /**
     * 根据员工id修改信息
     * @param sysEmp 员工管理
     */
    void updateEmp(SysEmp sysEmp);


    /**
     *  应聘进来一个员工
     * @param sysEmp 招员工
     */
    void addEmp(SysEmp sysEmp);

    /**
     *  所有的状态为0 的员工 正常工作员工
     *  查询所有
     * @return  List<SysEmp> 对象
     */
    List<SysEmp> selectAll(SysEmp sysEmp);

    /**
     *  查询 员工信息 详细看mapper 注释
     * @return map
     */
    List<Map<String, Object>> listEmpResultPrincipal();
}
