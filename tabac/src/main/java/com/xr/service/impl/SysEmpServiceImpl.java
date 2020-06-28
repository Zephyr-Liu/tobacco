package com.xr.service.impl;

import com.xr.mapper.SysEmpMapper;
import com.xr.model.SysEmp;
import com.xr.model.SysEmpExample;
import com.xr.service.SysEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/18 0:45
 * @Description
 */
@Service
public class SysEmpServiceImpl implements SysEmpService {


    private  SysEmpMapper sysEmpMapper;

    @Autowired
    public  SysEmpServiceImpl(SysEmpMapper sysEmpMapper) {
        this.sysEmpMapper=sysEmpMapper;
    }

    @Override
    public void deleteSysEmpById(Integer id) {
        //实际上是修改状态
        sysEmpMapper.updateStatusById(0,id);
    }

    @Override
    public void updateEmp(SysEmp sysEmp) {
        sysEmpMapper.updateByPrimaryKeySelective(sysEmp);
    }

    @Override
    public void addEmp(SysEmp sysEmp) {
        sysEmpMapper.insertSelective(sysEmp);
    }

    @Override
    public List<SysEmp> selectAll(SysEmp sysEmp) {
        SysEmpExample sysEmpExample=new SysEmpExample();
        SysEmpExample.Criteria criteria=sysEmpExample.createCriteria();
        //查询状态为0的 正常的
        //criteria.andStatusEqualTo(0);
        if (sysEmp != null){
            if(sysEmp.getEmpName() !=null){
                criteria.andEmpNameEqualTo("%"+sysEmp.getEmpName()+"%");
            }
        }
        return sysEmpMapper.selectByExample(sysEmpExample);
    }
}
