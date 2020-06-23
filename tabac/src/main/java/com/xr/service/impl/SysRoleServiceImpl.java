package com.xr.service.impl;

import com.xr.mapper.SysRoleMapper;
import com.xr.model.SysRole;
import com.xr.model.SysRoleExample;
import com.xr.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/22 19:33
 * @Description
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    public SysRoleServiceImpl(SysRoleMapper sysRoleMapper) {
        this.sysRoleMapper = sysRoleMapper;
    }

    private SysRoleMapper sysRoleMapper;

    @Override
    public void addSysRole(SysRole sysRole) {
        sysRoleMapper.insertSelective(sysRole);
    }

    @Override
    public void updateSysRole(SysRole sysRole) {
        sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public void deleteSysRoleById(Integer id) {
        sysRoleMapper.updateDelFlagById((byte) 1,id);
    }

    @Override
    public List<SysRole> listSysRole(SysRole sysRole,Integer page,Integer limit) {

        SysRoleExample sysRoleExample=new SysRoleExample();
        SysRoleExample.Criteria criteria=sysRoleExample.createCriteria();
        if (sysRole != null) {
            if (sysRole.getName() != null) {
                criteria.andNameLike("%"+sysRole.getName()+"%");
            }
            if (sysRole.getRemark() != null) {
                criteria.andRemarkLike("%"+sysRole.getRemark()+"%");
            }
        }
        return sysRoleMapper.selectByExample(sysRoleExample);
    }
}
