package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 监督责任表完成 审查
 */
@ApiModel(value = "com-xr-model-PartyResponsibilityCheck")
@Data
public class PartyResponsibilityCheck {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 责任监督编号
     */
    @ApiModelProperty(value = "责任监督编号")
    private String dutyId;

    /**
     * 作风建设、纪检再监督、执行力检查
     */
    @ApiModelProperty(value = "作风建设、纪检再监督、执行力检查")
    private Byte dutyType;

    /**
     * 反馈类型	根据上一个操作自动确认，如发通知后，自动为反馈自查报告，发整改通知后，自动为提整改报告，只有这两项需要反馈
     */
    @ApiModelProperty(value = "反馈类型	根据上一个操作自动确认，如发通知后，自动为反馈自查报告，发整改通知后，自动为提整改报告，只有这两项需要反馈")
    private Byte feedbackId;

    /**
     * 反馈内容	包含图片、文字
     */
    @ApiModelProperty(value = "反馈内容	包含图片、文字")
    private String feedbackContent;

    /**
     * 部门id	对应的执行部门，根据通知里的部门自动确认部门
     */
    @ApiModelProperty(value = "部门id	对应的执行部门，根据通知里的部门自动确认部门 ")
    private Integer deptId;

    /**
     * 附件相关	上传的相关文件
     */
    @ApiModelProperty(value = "附件相关	上传的相关文件")
    private String annex;

    /**
     * 创建时间	系统当前时间
     */
    @ApiModelProperty(value = "创建时间	系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

    /**
     * 创建者	当前登录人
     */
    @ApiModelProperty(value = "创建者	当前登录人")
    private Integer createId;

    /**
     * 创建者姓名	当前登录人姓名
     */
    @ApiModelProperty(value = "创建者姓名	当前登录人姓名")
    private String createName;

    /**
     * 状态	0  通知、1  自查、2 再检查、3 整改通知、4 提整改报告、5 通报、6 结束
     * 根据操人的处理，自动变更。
     */
    @ApiModelProperty(value = "状态	0  通知、1  自查、2 再检查、3 整改通知、4 提整改报告、5 通报、6 结束,            根据操人的处理，自动变更。")
    private Byte status;
}
