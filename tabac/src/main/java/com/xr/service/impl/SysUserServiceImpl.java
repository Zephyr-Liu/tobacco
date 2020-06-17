package com.xr.service.impl;

import com.xr.mapper.SysUserMapper;
import com.xr.model.SysUser;
import com.xr.model.SysUserExample;
import com.xr.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:00
 * @Description
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void add(SysUser sysUser) {
        sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public void deleteById(Long id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public List<SysUser> list(SysUser sysUser) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if (sysUser != null) {
            if (sysUser.getUsername() != null) {
                criteria.andUsernameLike("%" + sysUser.getUsername() + "%");
            }
            // 还可以添加其他属性的条件
        }
        List<SysUser> list = sysUserMapper.selectByExample(example);
        return list;
    }

    @Override
    public SysUser login(SysUser sysUser) {
        // 构建自定义查询条件
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(sysUser.getUsername());
        criteria.andPasswordEqualTo(sysUser.getPassword());
        List<SysUser> list = sysUserMapper.selectByExample(example);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public SysUser findUserByUserName(String username) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findUserRoles(String username) {
        List<String> roles = sysUserMapper.findUserRoles(username);
        return roles;
    }

    @Override
    public SysUser findUserByNameAndRoleAndMenu(String username) {
        List<SysUser> list = sysUserMapper.findUserByNameAndRoleAndMenu(username);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }



}
