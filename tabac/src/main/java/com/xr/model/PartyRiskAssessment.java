package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 需要提供部门汇总图，所有部门都显示，显示每个部门的一级风险数、二级风险数、三级风险数，点击部门显示该部门所有的风险信息。
 */
@ApiModel(value = "com-xr-model-PartyRiskAssessment")
@Data
public class PartyRiskAssessment {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 部门相关信息
     */
    @ApiModelProperty(value = "部门相关信息")
    private Integer deptInfo;

    /**
     * 一级风险数	一级风险数目
     */
    @ApiModelProperty(value = "一级风险数	一级风险数目")
    private Integer firstRiskCount;

    /**
     * 二级风险数	二级风险数目
     */
    @ApiModelProperty(value = "二级风险数	二级风险数目")
    private Integer minorRiskCount;

    /**
     * 三级风险数	三级风险数目
     */
    @ApiModelProperty(value = "三级风险数	三级风险数目")
    private Integer tertiaryRiskCount;

    /**
     * 创建时间	系统当前时间
     */
    @ApiModelProperty(value = "创建时间	系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

    /**
     * 创建者id 当前登陆的用户id
     */
    @ApiModelProperty(value = "创建者id 当前登陆的用户id")
    private Integer createId;

    /**
     * 当前登陆姓名
     */
    @ApiModelProperty(value = "当前登陆姓名")
    private String createName;

    /**
     * 0 正常、1 删除
     */
    @ApiModelProperty(value = "0 正常、1 删除")
    private Byte status;
}
