package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Coisini
 */
@ApiModel(value="com-xr-model-SysDept")
@Data
public class SysDept {
    /**
    * 主键增加 编号
    */
    @ApiModelProperty(value="主键增加 编号")
    private Integer id;

    /**
    * 部门id
    */
    @ApiModelProperty(value="部门id")
    private String deptId;

    /**
    * 部门名称
    */
    @ApiModelProperty(value="部门名称")
    private String deptName;

    /**
    * 责任人
    */
    @ApiModelProperty(value="责任人")
    private String dutyPrincipal;

    /**
    * 父机构信息	有父机构的需要录入父机构信息
    */
    @ApiModelProperty(value="父机构信息	有父机构的需要录入父机构信息")
    private Long parentDeptId;

    /**
    * 分管领导
    */
    @ApiModelProperty(value="分管领导")
    private String inChargeLead;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createTime;

    /**
    * 创建者id
    */
    @ApiModelProperty(value="创建者id")
    private Integer creatId;

    /**
    * 创建者姓名 当前登陆人姓名
    */
    @ApiModelProperty(value="创建者姓名 当前登陆人姓名")
    private String createName;

    /**
    * 是否删除   -1：已删除    0：正常
    */
    @ApiModelProperty(value="是否删除   -1：已删除    0：正常")
    private Byte status;

    /**
     * 部门下的部门子集
     */

    private List<SysDept> items = new ArrayList<>();
}
