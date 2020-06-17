package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 业务概述
 * 填写主体责任
 * 使用者
 * 部门负责人，纪检检查科长，局领导
 * -&#&
 */
@ApiModel(value = "com-xr-model-PartyDuty")
@Data
public class PartyDuty {
    /**
     * 主键 编号
     */
    @ApiModelProperty(value = "主键 编号")
    private Integer id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String dutyItle;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String dutyContent;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    /**
     * 创建者 当前登陆人id
     */
    @ApiModelProperty(value = "创建者 当前登陆人id")
    private Integer createId;

    /**
     * 创建姓名 当前登陆人姓名
     */
    @ApiModelProperty(value = "创建姓名 当前登陆人姓名")
    private String createName;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Byte status;
}