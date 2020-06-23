package com.xr.util;

import com.xr.model.SysUser;

/**
 * @author Zephyr.Liu
 * @date 2020/6/23 9:34
 * @Description  获取当前的用户的id 和 name
 */
public class GetUserTokenInfo {
    private SysUser sysUser;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    @Override
    public String toString() {
        return "GetUserTokenInfo{" +
                "sysUser=" + sysUser +
                '}';
    }
}
