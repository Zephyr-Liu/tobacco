package com.xr.service.impl;

import com.xr.mapper.SysUserMapper;
import com.xr.model.SysRole;
import com.xr.model.SysUser;
import com.xr.model.SysUserExample;
import com.xr.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public List<SysUser> list(SysUser sysUser, Integer page, Integer limit) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if (sysUser != null) {
            if (sysUser.getUsername() != null) {
                criteria.andUsernameLike("%" + sysUser.getUsername() + "%");
            }
            // 还可以添加其他属性的条件
        }
        //PageHelper.startPage(page,limit);
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

    @Override
    public void deleteUserById(Long id) {
        sysUserMapper.updateStatusById((byte) 1,id);
    }

    @Override
    public List<Long> findUserRolesId(String username) {
        return sysUserMapper.findUserRolesId(username);
    }

    @Override
    public Long checkname(String username) {
    return sysUserMapper.countByUsername(username);
    }

    @Override
    public List<SysRole> selectRoleOrUser(Integer id) {
        return sysUserMapper.selectRoleOrUser(id);
    }

    @Override
    public List<SysRole> selectRole() {
        return sysUserMapper.selectRole();
    }

    @Override
    public List<SysRole> selectNotExits(String name) {
        return sysUserMapper.selectNotExits(name);
    }

    @Override
    public void addRoleGetUserByUserIdAndRoleId(Long a, Long getUserId) {
        sysUserMapper.addRoleGetUserByUserIdAndRoleId(a,getUserId);
    }

    @Override
    public Map<String, String> listById(String username) {
        return sysUserMapper.listById(username);
    }

}
