package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
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
