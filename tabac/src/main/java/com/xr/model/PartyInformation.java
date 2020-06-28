package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 纪检监察员在后台系统对廉政教育信息录入、修改、删除，普通用户在前台可以查看。
 * @author Coisini
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
    private String infoType;

    /**
     * 能在线编辑，能上传图片、视频
     */
    @ApiModelProperty(value = "能在线编辑，能上传图片、视频")
    private String infoContent;

    /**
     * 资讯的相关时间
     */
    @ApiModelProperty(value = "资讯的相关时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date infoIssueDate;

    /**
     * 系统当前时间
     */
    @ApiModelProperty(value = "系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
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

    //自定义查询

    /**
    *   开始时间
    */

    @DateTimeFormat(pattern = "yyyy-MM-dd") //入参
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd") //出参
    private Date startTime;

    /**
    *   结束时间
    */


    @DateTimeFormat(pattern = "yyyy-MM-dd") //入参
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd") //出参
    private Date endTime;
}
