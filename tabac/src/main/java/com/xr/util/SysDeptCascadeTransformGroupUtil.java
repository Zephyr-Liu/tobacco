package com.xr.util;

import com.xr.model.SysDept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/7/3 19:56
 * @Description
 *      级联选择器 进行分组
 *       进行数据转换
 *       转换成前台Cascader 级联选择器 能识别的
 */
public class SysDeptCascadeTransformGroupUtil {

    public List<Map<String, Object>> getFaterNodes(List<SysDept> list) {

        Boolean b=false;
        List<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
        for (SysDept dept : list) {
            if (dept.getParentDeptId() == 0) {
                Map<String, Object> getMap = new HashMap();
                // getMap.put("id", menu.getId()); // 这是树形控件tree的
                //  这是Cascader 级联选择器
                getMap.put("value", dept.getId());
                getMap.put("label", dept.getDeptName());
                List<Map<String, Object>> node = getChildrenNode(Long.valueOf(dept.getId()), list);
                if (node.size() > 0 && node != null) {
                    getMap.put("children", node);
                }
                map.add(getMap);
            }
        }
        return map;
    }

    public List<Map<String, Object>> getChildrenNode(Long mid, List<SysDept> list) {
        // TODO Auto-generated method stub
        List<Map<String, Object>> tempArray = new ArrayList();
        for (SysDept dept : list) {
            if (dept.getParentDeptId() == 0) {
                continue;
            }
            if (dept.getParentDeptId().equals(mid)) {
                Map<String, Object> tempMap = new HashMap();
                //tempMap.put("id", menu.getId());//这是树形控件tree的
                //  这是Cascader 级联选择器
                tempMap.put("value", dept.getId());
                tempMap.put("label", dept.getDeptName());
                List<Map<String, Object>> node = getChildrenNode(Long.valueOf(dept.getId()), list);
                if (node!=null){
                    tempMap.put("children",node);
                }
                tempArray.add(tempMap);
            }
        }
        return tempArray;
    }
}
