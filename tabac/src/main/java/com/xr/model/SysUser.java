package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 用户
 */
@ApiModel(value = "com-xr-model-SysUser")
@Data
public class SysUser {
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 盐
     */
    @ApiModelProperty(value = "盐")
    private String salt;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    @ApiModelProperty(value = "状态  0：禁用   1：正常")
    private Byte status;

    /**
     * 机构ID
     */
    @ApiModelProperty(value = "机构ID")
    private Long deptId;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date lastUpdateTime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Byte delFlag;

    /**
     * 个人介绍
     */
    @ApiModelProperty(value = "个人介绍")
    private String introduction;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;
}