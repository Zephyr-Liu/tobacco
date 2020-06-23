package com.xr.util;

import com.xr.model.SysDept;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归对部门进行分组
 * @author Coisini
 *     部门表的递归分组  分组
 */
public class SysDeptGroupUtil {

    /**
     * 获得一级部门
     * @param list
     * @return
     */
    public List<SysDept> getFirstDept(List<SysDept> list){
        List<SysDept> firstDept = new ArrayList<>();
        //查询所有的parentId为0的部门
        for (SysDept dept:list){
            if(dept.getParentDeptId() ==0){
                dept.setItems(getChildrenDept(Long.valueOf(dept.getId()),list));
                firstDept.add(dept);
            }
        }
        return firstDept;
    }

    /**
     * 递归调用获得所有部门的子集
     * @param parentId    分组id
     * @param list
     * @return
     */
    public List<SysDept> getChildrenDept(Long parentId,List<SysDept> list){
        List<SysDept> childrenDept = new ArrayList<>();
        for (SysDept dept:list){
            // 一级部门不需要加进去
            if(dept.getParentDeptId() ==0){
                continue;
            }
            if(dept.getParentDeptId().longValue()==parentId){
                dept.setItems(getChildrenDept(Long.valueOf(dept.getId()),list));

                childrenDept.add(dept);
            }
        }
        return childrenDept;
    }
}
