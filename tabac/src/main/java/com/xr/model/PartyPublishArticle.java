package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 员工投稿，纪检监察员负责在系统里发布
 */
@ApiModel(value = "com-xr-model-PartyPublishArticle")
@Data
public class PartyPublishArticle {
    /**
     * 自动生成
     */
    @ApiModelProperty(value = "自动生成")
    private Integer id;

    /**
     * 工作部署标题
     */
    @ApiModelProperty(value = "工作部署标题")
    private String contributeTitle;

    /**
     * 工作内容
     */
    @ApiModelProperty(value = "工作内容")
    private String contributeContent;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    /**
     * 创建者 当前登陆人id
     */
    @ApiModelProperty(value = "创建者 当前登陆人id")
    private Integer createId;

    /**
     * 当前登陆人姓名
     */
    @ApiModelProperty(value = "当前登陆人姓名")
    private String createName;

    /**
     * 0 创建、 1 待审、2 已审核
     */
    @ApiModelProperty(value = "0 创建、 1 待审、2 已审核")
    private Byte status;
}