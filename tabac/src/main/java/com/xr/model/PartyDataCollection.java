package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
    * 发布资料集锦信息。
使用者：纪检监察员


纪检监察员将资料上传，并发布
    */
@ApiModel(value="com-xr-model-PartyDataCollection")
@Data
public class PartyDataCollection {
    /**
    * 系统自动生成
    */
    @ApiModelProperty(value="系统自动生成")
    private Integer id;

    /**
    * 资料集锦的标题
    */
    @ApiModelProperty(value="资料集锦的标题")
    private String datumTitle;

    /**
    * 文件名	文件名称，唯一
    */
    @ApiModelProperty(value="文件名	文件名称，唯一")
    private String fileName;

    /**
    * 文件	具体的文件，存放在应用服务器上
    */
    @ApiModelProperty(value="文件	具体的文件，存放在应用服务器上")
    private String file;

    /**
    * 创建时间	系统当前时间
    */
    @ApiModelProperty(value="创建时间	系统当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createDate;

    /**
    * 创建者	当前登录人id
    */
    @ApiModelProperty(value="创建者	当前登录人id")
    private Integer createProson;

    /**
    * 创建者姓名	当前登录人姓名
    */
    @ApiModelProperty(value="创建者姓名	当前登录人姓名")
    private String createName;

    /**
    * 状态      0 创建     1待审      2 已审核
    */
    @ApiModelProperty(value="状态      0 创建     1待审      2 已审核")
    private Byte status;
}
