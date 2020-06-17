package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 填写工作计划
 */
@ApiModel(value = "com-xr-model-PartyWorkPlan")
@Data
public class PartyWorkPlan {
    /**
     * 编号 自动生成
     */
    @ApiModelProperty(value = "编号 自动生成")
    private Integer id;

    /**
     * 计划 标题
     */
    @ApiModelProperty(value = "计划 标题")
    private String planTitle;

    /**
     * 工作计划 内容
     */
    @ApiModelProperty(value = "工作计划 内容")
    private String planContent;

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
     * 创建者姓名 当前登陆人姓名
     */
    @ApiModelProperty(value = "创建者姓名 当前登陆人姓名")
    private String createName;

    /**
     * 0 创建、1 待审、2 已审核
     */
    @ApiModelProperty(value = "0 创建、1 待审、2 已审核")
    private Byte status;
}