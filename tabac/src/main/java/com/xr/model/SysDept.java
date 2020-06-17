package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-SysDept")
@Data
public class SysDept {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private String deptId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String principal;

    @ApiModelProperty(value = "")
    private Long parentId;

    @ApiModelProperty(value = "")
    private String manager;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Integer creator;

    @ApiModelProperty(value = "")
    private String createName;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Byte status;
}