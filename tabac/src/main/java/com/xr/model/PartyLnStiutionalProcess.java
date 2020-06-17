package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-PartyLnStiutionalProcess")
@Data
public class PartyLnStiutionalProcess {
    /**
     * 编号id
     */
    @ApiModelProperty(value = "编号id")
    private Long id;

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
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    private String createname;

    /**
     * 创建者姓名
     */
    @ApiModelProperty(value = "创建者姓名")
    private String createusername;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Byte status;
}