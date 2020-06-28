package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "com-xr-model-SysLog")
@Data
public class SysLog {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 当前登陆人id
     */
    @ApiModelProperty(value = "当前登陆人id")
    private Integer loginId;

    /**
     * 当前人登陆用户名
     */
    @ApiModelProperty(value = "当前人登陆用户名")
    private String loginUsername;

    /**
     * 请求路径
     */
    @ApiModelProperty(value = "请求路径")
    private String url;

    /**
     * 请求类型
     */
    @ApiModelProperty(value = "请求类型")
    private String httpMethod;

    /**
     * IP
     */
    @ApiModelProperty(value = "IP")
    private String ip;

    /**
     * 接口包路径
     */
    @ApiModelProperty(value = "接口包路径")
    private String classMethod;

    /**
     * 参数
     */
    @ApiModelProperty(value = "参数")
    private String requestArgs;

    /**
     * 当前时间
     */
    @ApiModelProperty(value = "当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

//自定义

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


    /**
     * 搜索创建人
     */
    private String searchName;
}
