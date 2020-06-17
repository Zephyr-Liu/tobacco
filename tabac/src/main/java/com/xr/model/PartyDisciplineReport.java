package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "com-xr-model-PartyDisciplineReport")
@Data
public class PartyDisciplineReport {
    /**
     * id 主键生成
     */
    @ApiModelProperty(value = "id 主键生成")
    private Integer id;

    /**
     * 月报、季报、半年报、及时报、重要节点报
     */
    @ApiModelProperty(value = "月报、季报、半年报、及时报、重要节点报")
    private String reportType;

    /**
     * 报表文件	要上传的文件
     */
    @ApiModelProperty(value = "报表文件	要上传的文件")
    private String reportFile;

    /**
     * 创建时间	系统当前时间
     */
    @ApiModelProperty(value = "创建时间	系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createTime;

    /**
     * 登陆id 当前登陆人id
     */
    @ApiModelProperty(value = "登陆id 当前登陆人id")
    private Integer loginId;

    /**
     * 创建者姓名	当前登录人姓名
     */
    @ApiModelProperty(value = "创建者姓名	当前登录人姓名")
    private String createName;

    /**
     * 状态	0 正常、1 删除
     */
    @ApiModelProperty(value = "状态	0 正常、1 删除")
    private Boolean status;
}
