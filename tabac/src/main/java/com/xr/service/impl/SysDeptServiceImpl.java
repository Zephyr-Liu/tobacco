package com.xr.service.impl;

import com.xr.mapper.SysDeptMapper;
import com.xr.model.SysDept;
import com.xr.model.SysDeptExample;
import com.xr.service.SysDeptService;
import com.xr.util.SysDeptGroupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:48
 * @Description
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {


    private SysDeptMapper sysDeptMapper;

    @Autowired
    public SysDeptServiceImpl(SysDeptMapper sysDeptMapper) {
        this.sysDeptMapper = sysDeptMapper;
    }

    @Override
    public List<SysDept> getGroupDept() {
        SysDeptExample example = new SysDeptExample();
        SysDeptExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(new Byte("0"));
        List<SysDept> deptList = sysDeptMapper.selectByExample(example);
        if (deptList != null && deptList.size() > 0) {
            // 进行递归分组
            SysDeptGroupUtil groupUtil = new SysDeptGroupUtil();
            deptList = groupUtil.getFirstDept(deptList);
            return deptList;
        }
        return null;
    }

    @Override
    public void updateDept(SysDept sysDept) {
        sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }

    @Override
    public void addSysDept(SysDept sysDept) {
        sysDeptMapper.insertSelective(sysDept);
    }

    @Override
    public void deleteSysDeptById(Integer id) {

    }


}
