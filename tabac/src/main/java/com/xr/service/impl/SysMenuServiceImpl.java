package com.xr.service.impl;

import com.xr.mapper.SysMenuMapper;
import com.xr.model.SysMenu;
import com.xr.model.SysMenuExample;
import com.xr.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/23 11:20
 * @Description
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
    public List<SysMenu> listMenu(SysMenu sysMenu) {
        SysMenuExample sysMenuExample=new SysMenuExample();
        SysMenuExample.Criteria criteria=sysMenuExample.createCriteria();
        criteria.andDelFlagEqualTo((byte) 0);
        if (sysMenu != null) {
            if (sysMenu.getName() != null) {
                criteria.andNameLike("%"+sysMenu.getName()+"%");
            }
        }
        return  sysMenuMapper.selectByExample(sysMenuExample);
    }
}
