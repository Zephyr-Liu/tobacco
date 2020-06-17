package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 纪检监察员在后台系统对廉政教育信息录入、修改、删除，普通用户在前台可以查看。
 */
@ApiModel(value = "com-xr-model-PartyInformation")
@Data
public class PartyInformation {
    /**
     * 系统自动生成
     */
    @ApiModelProperty(value = "系统自动生成")
    private Integer id;

    /**
     * 资讯的标题
     */
    @ApiModelProperty(value = "资讯的标题")
    private String infoTitle;

    /**
     * 资讯的来源
     */
    @ApiModelProperty(value = "资讯的来源")
    private String source;

    /**
     * 0 领导讲话、1 廉政要闻、2 文件制度、3 警钟长鸣
     */
    @ApiModelProperty(value = "0 领导讲话、1 廉政要闻、2 文件制度、3 警钟长鸣")
    private Byte infoType;

    /**
     * 能在线编辑，能上传图片、视频
     */
    @ApiModelProperty(value = "能在线编辑，能上传图片、视频")
    private String infoContent;

    /**
     * 资讯的相关时间
     */
    @ApiModelProperty(value = "资讯的相关时间")
    private Date infoIssueDate;

    /**
     * 系统当前时间
     */
    @ApiModelProperty(value = "系统当前时间")
    private Date createDate;

    /**
     * 当前登录人id
     */
    @ApiModelProperty(value = "当前登录人id")
    private Integer createId;

    /**
     * 当前登录人姓名
     */
    @ApiModelProperty(value = "当前登录人姓名")
    private String createName;

    /**
     * 0 正常、1 删除
     */
    @ApiModelProperty(value = "0 正常、1 删除")
    private Byte status;
}