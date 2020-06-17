package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-xr-model-PartyPositionRisk")
@Data
public class PartyPositionRisk {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Integer id;

    /**
    * 岗位风险编号
    */
    @ApiModelProperty(value="岗位风险编号")
    private Integer riskId;

    /**
    * 风险信息录入、执行的年份，默认输入的年份
    */
    @ApiModelProperty(value="风险信息录入、执行的年份，默认输入的年份")
    private Date riskYears;

    /**
    * 岗位所在部门信息
    */
    @ApiModelProperty(value="岗位所在部门信息")
    private Integer deptId;

    /**
    * 岗位信息id	岗位名称、岗位编号
    */
    @ApiModelProperty(value="岗位信息id	岗位名称、岗位编号")
    private Integer jobId;

    /**
    * 项目	风险项目名称
    */
    @ApiModelProperty(value="项目	风险项目名称")
    private String riskProject;

    /**
    * 廉政风险点描述，文字信息
    */
    @ApiModelProperty(value="廉政风险点描述，文字信息")
    private String riskDescribe;

    /**
    * 风险发生可能性 L值
    */
    @ApiModelProperty(value="风险发生可能性 L值")
    private String riskMayValue;

    /**
    * 风险产生后果的严重性 C值
    */
    @ApiModelProperty(value="风险产生后果的严重性 C值")
    private Integer riskResultValue;

    /**
    * 廉政风险值 D值
    */
    @ApiModelProperty(value="廉政风险值 D值")
    private Integer riskIntegrityValue;

    /**
    * 风险等级  0 一级风险、1 二级风险、2 三级风险
    */
    @ApiModelProperty(value="风险等级  0 一级风险、1 二级风险、2 三级风险")
    private Integer riskGrade;

    /**
    * 预防和控制措施
    */
    @ApiModelProperty(value="预防和控制措施")
    private Byte prevention;

    /**
    * 创建时间	系统当前时间
    */
    @ApiModelProperty(value="创建时间	系统当前时间")
    private Date createDate;

    /**
    * 创建者	当前登录人id
    */
    @ApiModelProperty(value="创建者	当前登录人id")
    private Integer createId;

    /**
    * 创建者姓名	当前登录人姓名
    */
    @ApiModelProperty(value="创建者姓名	当前登录人姓名")
    private String createName;

    /**
    * 状态	0  正常、1 删除
    */
    @ApiModelProperty(value="状态	0  正常、1 删除")
    private Byte status;
}