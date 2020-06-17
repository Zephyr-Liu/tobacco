package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-PartyEarlyWarning")
@Data
public class PartyEarlyWarning {
    /**
     * 编号id
     */
    @ApiModelProperty(value = "编号id")
    private Integer id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String content;

    /**
     * 投稿人
     */
    @ApiModelProperty(value = "投稿人")
    private String contributor;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date creationtime;

    /**
     * 创建者id
     */
    @ApiModelProperty(value = "创建者id")
    private String registerid;

    /**
     * 创建者姓名
     */
    @ApiModelProperty(value = "创建者姓名")
    private String creatorname;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer state;
}