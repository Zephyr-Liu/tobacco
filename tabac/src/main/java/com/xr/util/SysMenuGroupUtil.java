package com.xr.util;

import com.xr.model.SysMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Coisini
 */
public class SysMenuGroupUtil {

  public List<Map<String, Object>> getFaterNodes(List<SysMenu> list) {

    Boolean b=false;
    List<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
    for (SysMenu menu : list) {
      if (menu.getParentId() == 0) {
        Map<String, Object> getMap = new HashMap();
        getMap.put("id", menu.getId());
        getMap.put("label", menu.getName());
//        getMap.put("field", menu.getSuperior());
//        getMap.put("checked", false);
        List<Map<String, Object>> node = getChildrenNode(menu.getId(), list);
        if (node.size() > 0 && node != null) {
          getMap.put("children", node);
        }
        map.add(getMap);

      }
    }



    return map;

  }
  public List<Map<String, Object>> getChildrenNode(Long mid, List<SysMenu> list) {
    // TODO Auto-generated method stub
    List<Map<String, Object>> tempArray = new ArrayList();
    for (SysMenu menu : list) {
      if (menu.getParentId() == 0) {
        continue;
      }
      if (menu.getParentId() == mid) {
        Map<String, Object> tempMap = new HashMap();

        // 这是树形控件tree的
        tempMap.put("id", menu.getId());
        //这是Cascader 级联选择器
        tempMap.put("label", menu.getName());

        List<Map<String, Object>> node = getChildrenNode(menu.getId(), list);
        if (node!=null){
          tempMap.put("children",node);
        }

        tempArray.add(tempMap);
      }

    }
    return tempArray;
  }




}
