package com.xr.service.impl;

import com.xr.mapper.SysMenuMapper;
import com.xr.model.SysMenu;
import com.xr.model.SysMenuExample;
import com.xr.service.SysMenuService;
import com.xr.util.SysMenuGroupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/23 11:20
 * @Description  菜单表 权限
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    private SysMenuMapper sysMenuMapper;

    @Autowired
    public SysMenuServiceImpl(SysMenuMapper sysMenuMapper) {
        this.sysMenuMapper = sysMenuMapper;
    }

    @Override
    public void addMenu(SysMenu sysMenu) {
        sysMenuMapper.insertSelective(sysMenu);
    }

    @Override
    public void updateMenu(SysMenu sysMenu) {
        sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
    }

    @Override
    public void deleteMenuById(Long id) {
        sysMenuMapper.updateDelFlagById((byte) 1,id);
    }


    @Override
    public List<Map<String, Object>> listMenu(SysMenu sysMenu) {
        SysMenuExample sysMenuExample=new SysMenuExample();
        List<SysMenu> sysMenus=sysMenuMapper.selectByExample(sysMenuExample);
        if (sysMenus!=null&&sysMenus.size()>0){
            SysMenuGroupUtil groupUtil=new SysMenuGroupUtil();
            return groupUtil.getFaterNodes(sysMenus);
        }
        return  null;
    }
}
