package com.xr.service.impl;

import com.xr.mapper.SysLogMapper;
import com.xr.model.SysLog;
import com.xr.model.SysLogExample;
import com.xr.service.SysLogService;
import com.xr.util.GetUserTokenInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/28 15:17
 * @Description
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    private SysLogMapper sysLogMapper;
    private GetUserTokenInfo getUserTokenInfo;

    @Autowired
    public SysLogServiceImpl(SysLogMapper sysLogMapper,GetUserTokenInfo getUserTokenInfo) {
        this.sysLogMapper = sysLogMapper;
        this.getUserTokenInfo=getUserTokenInfo;
    }

    @Override
    public void addLog(SysLog sysLog) {

        /*
            判断 当前是不是 登陆时间  因为登陆事件还未登陆成功 所以肯定不知道 当前登陆的id和用户名
         */
        if (getUserTokenInfo.getData().get("createName")!=null) {
            sysLog.setLoginId(Math.toIntExact(Long.parseLong(String.valueOf(getUserTokenInfo.getData().get("id")))));
            sysLog.setLoginUsername((String) getUserTokenInfo.getData().get("createName"));
        }
            sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public List<SysLog> selectLog(SysLog sysLog) {
        SysLogExample sysLogExample=new SysLogExample();
        SysLogExample.Criteria criteria=sysLogExample.createCriteria();
        if (sysLog != null) {
            if (sysLog.getCreateDate() != null) {
                criteria.andCreateDateBetween(sysLog.getStartTime(),sysLog.getEndTime());
            }
            if (sysLog.getSearchName() != null) {
                criteria.andLoginUsernameLike("%"+sysLog.getSearchName()+"%");
            }
            if (sysLog.getUrl() != null) {
                criteria.andUrlLike("%"+sysLog.getUrl()+"%");
            }
        }
        //默认最新内容排序
        sysLogExample.setOrderByClause("id DESC");
        return sysLogMapper.selectByExample(sysLogExample);
    }
}
