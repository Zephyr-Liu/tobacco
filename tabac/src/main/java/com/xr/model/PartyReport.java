package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 通过系统实现系统内部在线信访举报，可以登录实名举报，也可以匿名举报，对信访举报进行处理。匿名举报处理结果不公开，实名举报
 */
@ApiModel(value = "com-xr-model-PartyReport")
@Data
public class PartyReport {
    /**
     * 主键 自动生成
     */
    @ApiModelProperty(value = "主键 自动生成")
    private Integer id;

    /**
     * 信访编号	每次信访的编号
     */
    @ApiModelProperty(value = "信访编号	每次信访的编号")
    private String petitionId;

    /**
     * 信访时间	默认为填写的时间
     */
    @ApiModelProperty(value = "信访时间	默认为填写的时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date petitionDate;

    /**
     * 来访人姓名
     */
    @ApiModelProperty(value = "来访人姓名")
    private String visitingName;

    /**
     * 来访人部门/单位
     */
    @ApiModelProperty(value = "来访人部门/单位")
    private String visitingDept;

    /**
     * 来访人岗位/职务
     */
    @ApiModelProperty(value = "来访人岗位/职务")
    private String visitingJoc;

    /**
     * 被反映人姓名
     */
    @ApiModelProperty(value = "被反映人姓名")
    private String beReflectedName;

    /**
     * 被反映人部门/单位
     */
    @ApiModelProperty(value = "被反映人部门/单位")
    private String beReflectedDept;

    /**
     * 被反映人岗位/职务
     */
    @ApiModelProperty(value = "被反映人岗位/职务")
    private String beReflectedJoc;

    /**
     * 原始信访内容
     */
    @ApiModelProperty(value = "原始信访内容")
    private String visitingContent;

    /**
     * 信访内容摘要	纪检监察员编辑的信访内容摘要
     */
    @ApiModelProperty(value = "信访内容摘要	纪检监察员编辑的信访内容摘要")
    private String contentSummary;

    /**
     * 监察科部门意见	纪检监察科科长签署的意见
     */
    @ApiModelProperty(value = "监察科部门意见	纪检监察科科长签署的意见")
    private String monitorOpinion;

    /**
     * 监察科部门意见签署时间	纪检监察科科长签署意见的时间
     */
    @ApiModelProperty(value = "监察科部门意见签署时间	纪检监察科科长签署意见的时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date monitorOpinioDete;

    /**
     * 纪检组长意见	纪检组长签署的意见
     */
    @ApiModelProperty(value = "纪检组长意见	纪检组长签署的意见")
    private String disciplineInspectionOpinio;

    /**
     * 纪检组长签署时间	纪检组长签署时间
     */
    @ApiModelProperty(value = "纪检组长签署时间	纪检组长签署时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date isciplineInspectionOpinio;

    /**
     * 局领导意见	局领导签署的意见
     */
    @ApiModelProperty(value = "局领导意见	局领导签署的意见")
    private String bureauOpinio;

    /**
     * 局领导签署时间	局领导签署时间
     */
    @ApiModelProperty(value = "局领导签署时间	局领导签署时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date bureauOpinioDate;

    /**
     * 转办部门处理结果，市局纪检监察员录入
     */
    @ApiModelProperty(value = "转办部门处理结果，市局纪检监察员录入")
    private String transitResult;

    /**
     * 转办意见签署时间
     */
    @ApiModelProperty(value = "转办意见签署时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date transitResultDate;

    /**
     * 监察科自办处理结果，市局纪检监察员录入
     */
    @ApiModelProperty(value = "监察科自办处理结果，市局纪检监察员录入")
    private String selfResult;

    /**
     * 监察科自办时间
     */
    @ApiModelProperty(value = "监察科自办时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date selfDate;

    /**
     * 系统当前时间
     */
    @ApiModelProperty(value = "系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

    /**
     * 当前登录人 id
     */
    @ApiModelProperty(value = "当前登录人 id")
    private Integer createId;

    /**
     * 创建者姓名	当前登录人姓名
     */
    @ApiModelProperty(value = "创建者姓名	当前登录人姓名")
    private String createName;

    /**
     * 0 正常、1 删除
     */
    @ApiModelProperty(value = "0 正常、1 删除")
    private Byte status;
}
