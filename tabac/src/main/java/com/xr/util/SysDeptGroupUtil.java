package com.xr.util;

import com.xr.model.SysDept;

import java.util.ArrayList;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:49
 * @Description
 */
public class SysDeptGroupUtil {

    /**
     * 查找一级部门
     *
     * @param list
     * @return
     */
    public List<SysDept> getFirstDept(List<SysDept> list) {
        //定义一个集合，放一级部门
        List<SysDept> firstList = new ArrayList<SysDept>();
        for (SysDept m : list) {
            // 父级部门的id为0的是一级部门
            if (m.getParentDeptId().longValue() == 0) {
                //调用下面的递归方法查找所有的子部门
                m.setItems(getItems(new Long(m.getId()), list));
                //一级部门加入到集合
                firstList.add(m);
            }
        }
        return firstList;
    }

    /**
     * 根据一级部门的id查找里面所有的子部门，包含递归算法
     *
     * @param pid
     * @param list
     * @return
     */
    public List<SysDept> getItems(Long pid, List<SysDept> list) {
        List<SysDept> secondList = new ArrayList<SysDept>();
        for (SysDept m : list) {
            //是一级部门，不需要加进去
            if (m.getParentDeptId().longValue() == 0) {
                continue;
            }
            //如果当前部门的父id和传过来的一致，就可以直接加到集合里
            //Long类型对象比较相等需要使用longValue获取之后再来比较
            if (m.getParentDeptId().longValue() == pid.longValue()) {
                m.setItems(getItems(m.getParentDeptId(), list));
                secondList.add(m);
            }
        }
        return secondList;
    }
}
