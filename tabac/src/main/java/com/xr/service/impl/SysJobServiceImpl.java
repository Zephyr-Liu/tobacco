package com.xr.service.impl;

import com.xr.mapper.SysJobMapper;
import com.xr.model.SysJob;
import com.xr.model.SysJobExample;
import com.xr.service.SysJobService;
import com.xr.util.GetUserTokenInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private GetUserTokenInfo getUserTokenInfo;

    @Override
    public List<Map<String, Object>> joblist(SysJob sysJob) {
        if (sysJob.getStatus() == null) {
            sysJob.setStatus((byte) 0);
        }
        return sysJobMapper.joblist(sysJob);
    }

    @Override
    public void addJob(SysJob sysJob) {
        if (getUserTokenInfo.getData().get("createName")!=null) {
            sysJob.setCreateId(String.valueOf(getUserTokenInfo.getData().get("id")));
            sysJob.setCreateName((String) getUserTokenInfo.getData().get("createName"));
        }
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

}
