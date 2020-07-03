package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
    * 业务概述
  填写廉政谈话
使用者
  部门负责人，纪检检查科长，局领导
                                  -&#&
    */
@ApiModel(value="com-xr-model-PartyDialogue")
@Data
public class PartyDialogue {
    /**
    * 编号 主键 自动生成
    */
    @ApiModelProperty(value="编号 主键 自动生成")
    private Integer id;

    /**
    * 谈话对象姓名
    */
    @ApiModelProperty(value="谈话对象姓名")
    private String otherSideName;

    /**
    * 谈话对象单位
    */
    @ApiModelProperty(value="谈话对象单位")
    private Integer otherSideDept;

    /**
    * 谈话对象政治面貌
    */
    @ApiModelProperty(value="谈话对象政治面貌")
    private String otherSideFace;

    /**
    * 谈话对象职务
    */
    @ApiModelProperty(value="谈话对象职务")
    private String otherSideJoc;

    /**
    * 谈话类型	0 廉政谈话、1  任前廉政谈话、2  提醒谈话  三选一
    */
    @ApiModelProperty(value="谈话类型	0 廉政谈话、1  任前廉政谈话、2  提醒谈话  三选一")
    private Byte talkType;

    /**
    * 谈话时间	廉政谈话时间，精确到年月日
    */
    @ApiModelProperty(value="谈话时间	廉政谈话时间，精确到年月日")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date talkDate;

    /**
    * 谈话地点
    */
    @ApiModelProperty(value="谈话地点")
    private String talkSite;

    /**
    * 记录人
    */
    @ApiModelProperty(value="记录人")
    private String recordProson;

    /**
    * 谈话提纲  最大400字符

    */
    @ApiModelProperty(value="谈话提纲  最大400字符,            ")
    private String talkOutline;

    /**
    * 谈话内容 最大字符2000字符
    */
    @ApiModelProperty(value="谈话内容 最大字符2000字符")
    private String talkContent;

    /**
    * 创建时间 默认当前时间
    */
    @ApiModelProperty(value="创建时间 默认当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

    /**
    * 创建者者 当前登陆人
    */
    @ApiModelProperty(value="创建者者 当前登陆人")
    private Integer createId;

    /**
    * 创建者登陆人姓名
    */
    @ApiModelProperty(value="创建者登陆人姓名")
    private String createName;

    /**
    * 0 创建、1 待审、2 已审核
    */
    @ApiModelProperty(value="0 创建、1 待审、2 已审核， 3 删除")
    private Byte status;



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


    private  String deptname;
}
