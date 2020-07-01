package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户
 */
@ApiModel(value = "com-xr-model-SysUser")
@Data
public class SysUser {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private Long id;

    /**
     * 员工编号
     */
    @ApiModelProperty(value = "员工编号")
    private String empId;

    /**
     * 员工姓名
     */
    @ApiModelProperty(value = "员工姓名")
    private String empName;

    /**
     * 0--男，1--女
     */
    @ApiModelProperty(value = "0--男，1--女")
    private Integer empSex;

    /**
     * 学历
     */
    @ApiModelProperty(value = "学历")
    private String education;

    /**
     * 政治面貌
     */
    @ApiModelProperty(value = "政治面貌")
    private String politics;

    /**
     * 创建人Id
     */
    @ApiModelProperty(value = "创建人Id")
    private String createId;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createTime;

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
