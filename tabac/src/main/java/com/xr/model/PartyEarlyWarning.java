package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
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
