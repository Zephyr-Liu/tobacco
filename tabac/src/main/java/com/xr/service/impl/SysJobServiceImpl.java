package com.xr.service.impl;

import com.xr.mapper.SysJobMapper;
import com.xr.model.SysJob;
import com.xr.model.SysJobExample;
import com.xr.service.SysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/22 10:19
 * @Description
 */
@Service
public class SysJobServiceImpl implements SysJobService {

    private SysJobMapper sysJobMapper;

    @Autowired
    public SysJobServiceImpl(SysJobMapper sysJobMapper) {
        this.sysJobMapper = sysJobMapper;
    }

    @Override
    public void addJob(SysJob sysJob) {
        sysJobMapper.insertSelective(sysJob);
    }

    @Override
    public void updateJob(SysJob sysJob) {
        sysJobMapper.updateByPrimaryKeySelective(sysJob);
    }

    @Override
    public void deleteJob(Integer id) {
        //修改状态
        sysJobMapper.updateStatusById((byte) 1,id);
    }

    @Override
    public List<SysJob> query(SysJob sysJob) {
        SysJobExample sysJobExample=new SysJobExample();
        SysJobExample.Criteria criteria=sysJobExample.createCriteria();
       criteria.andStatusEqualTo((byte) 0);
        if (sysJob != null) {
            if (sysJob.getJobName() != null) {
                criteria.andJobNameLike("%"+sysJob.getJobName()+"%");
            }
            if (sysJob.getJobDesc() != null) {
                criteria.andJobDescLike("%"+sysJob.getJobDesc()+"%");
            }
        }
        return null;
    }
}
