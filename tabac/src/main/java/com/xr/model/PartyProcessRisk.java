package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 在工作中涉及的流程中有流程图片，纪检监察员对于流程的风险描述，可以上传附件，进行流程风险信息的添加、修改、删除。普通用户
 */
@ApiModel(value = "com-xr-model-PartyProcessRisk")
@Data
public class PartyProcessRisk {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 风险流程编号
     */
    @ApiModelProperty(value = "风险流程编号")
    private String riskId;

    /**
     * 风险流程名称
     */
    @ApiModelProperty(value = "风险流程名称")
    private String riskName;

    /**
     * 该风险流程是哪一年的
     */
    @ApiModelProperty(value = "该风险流程是哪一年的")
    private Date riskYears;

    /**
     * 包括流程图片、文字说明
     */
    @ApiModelProperty(value = "包括流程图片、文字说明")
    private String riskInfo;

    /**
     * 流程风险信息相关的附件
     */
    @ApiModelProperty(value = "流程风险信息相关的附件")
    private String attachment;

    /**
     * 系统当前时间
     */
    @ApiModelProperty(value = "系统当前时间")
    private Date createDate;

    /**
     * 创建者 当前的登陆人编号
     */
    @ApiModelProperty(value = "创建者 当前的登陆人编号")
    private Integer createId;

    /**
     * 当前登陆人的姓名
     */
    @ApiModelProperty(value = "当前登陆人的姓名")
    private String createName;

    /**
     * 0 正常、1 删除
     */
    @ApiModelProperty(value = "0 正常、1 删除")
    private Byte status;
}