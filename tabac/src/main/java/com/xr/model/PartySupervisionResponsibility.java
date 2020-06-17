package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 纪检监察员是指纪检监察科的纪检监察员，兼职纪检监察员指各部门的兼职纪检监察员和县局综合室的纪检监察员。
 */
@ApiModel(value = "com-xr-model-PartySupervisionResponsibility")
@Data
public class PartySupervisionResponsibility {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 责任监督编号
     */
    @ApiModelProperty(value = "责任监督编号")
    private Integer responsibilityId;

    /**
     * 责任监督类型	0  作风建设、1  纪检再监督、2 执行力检查
     */
    @ApiModelProperty(value = "责任监督类型	0  作风建设、1  纪检再监督、2 执行力检查")
    private Byte dutyType;

    /**
     * 责任监督标题
     */
    @ApiModelProperty(value = "责任监督标题")
    private String dutyTitle;

    /**
     * 责任监督标题
     */
    @ApiModelProperty(value = "责任监督标题")
    private String dutyContent;

    /**
     * 责任监督内容	包含图片、文字
     */
    @ApiModelProperty(value = "责任监督内容	包含图片、文字")
    private Integer dept;

    /**
     * 部门id	对应的执行部门，用户选择，可以多选
     */
    @ApiModelProperty(value = "部门id	对应的执行部门，用户选择，可以多选")
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
    private String createId;

    /**
     * 创建者姓名	当前登录人姓名
     */
    @ApiModelProperty(value = "创建者姓名	当前登录人姓名")
    private String createName;

    /**
     * 0 通知、1 自查、2  再检查、3 整改通知、4  提整改报告、5  通报、6 结束
     */
    @ApiModelProperty(value = "0 通知、1 自查、2  再检查、3 整改通知、4  提整改报告、5  通报、6 结束")
    private Byte status;
}
