package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "com-xr-model-PartySupervise")
@Data
public class PartySupervise {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 备案登记事项摘要
     */
    @ApiModelProperty(value = "备案登记事项摘要")
    private String itemsinthispaper;

    /**
     * 备案登记上传的附件
     */
    @ApiModelProperty(value = "备案登记上传的附件")
    private String accessory;

    /**
     * 备案登记事项实施方式
     */
    @ApiModelProperty(value = "备案登记事项实施方式")
    private String modeofexecution;

    /**
     * 实施事项耗费的物资
     */
    @ApiModelProperty(value = "实施事项耗费的物资")
    private String cost;

    /**
     * 负责实施登记事项的人
     */
    @ApiModelProperty(value = "负责实施登记事项的人")
    private String undertaker;

    /**
     * 承办部门	上述承办人所在部门
     */
    @ApiModelProperty(value = "承办部门	上述承办人所在部门")
    private String undertakedept;

    /**
     * 备案登记审批时得到的意见
     */
    @ApiModelProperty(value = "备案登记审批时得到的意见")
    private String auditopinion;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date creationtime;

    /**
     * 当前登录人
     */
    @ApiModelProperty(value = "当前登录人")
    private String creator;

    /**
     * 当前登录人姓名
     */
    @ApiModelProperty(value = "当前登录人姓名")
    private String creatorname;

    /**
     * 0正常，1非正常
     */
    @ApiModelProperty(value = "0正常，1非正常")
    private Integer state;
}
