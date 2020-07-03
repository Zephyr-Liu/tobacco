package com.xr.service;

import com.xr.model.SysRole;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @create 2020/6/22 19:24
 *     角色管理
 *     作用 :
 *          角色：
 *     系统管理员： 管理系统用户、角色与权限，保证系统正常运行。 普
 *     通用户： 浏览系统发布的信息、信访举报。
 *     兼职纪检监察员：
 *     每个部门内有岗位兼任，县局综合室有专门的纪检监察员，负责填写系统内的纪检相关报表。
 *     纪检监察员：
 *     纪检科的监察员，可以系统内的廉政教育、工作之窗、廉政文化、风险防控、资料集锦的信息的发布，信访举报内容的审核和回复。
 *     单位、部门负责人： 该身份才能填写本部门的廉政纪实手册。
 *     纪检监察科科长： 信访举报内容的审核情况查看，廉政纪实手册内容审核。 局领导： 信访举报内容的情况查看，廉政纪实 手册内 容查看。
 */
public interface SysRoleService {

    /**
     * 添加
     * @param sysRole 添加
     */
    void addSysRole(SysRole sysRole);

    /**
     *  修改
     * @param sysRole 角色
     */
    void updateSysRole(SysRole sysRole);

    /**
     * 删除角色  实则 修改状态
     * @param id id
     */
    void deleteSysRoleById(Integer id);

    /**
     *  查询所有 和 条件查询
     * @param sysRole  对象
     * @param page 从什么开始
     * @param limit 到哪里结束
     * @return 集合数据
     */
    List<SysRole> listSysRole (SysRole sysRole,Integer page,Integer limit);


}
