package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "com-xr-model-PartyCreditRating")
@Data
public class PartyCreditRating {
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private Integer id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
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
    private Integer status;
}
