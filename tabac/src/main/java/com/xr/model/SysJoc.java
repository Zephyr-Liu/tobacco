package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-SysJoc")
@Data
public class SysJoc {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String positionId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String empNameId;

    @ApiModelProperty(value = "")
    private String desc;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private String creator;

    @ApiModelProperty(value = "")
    private String createName;

    @ApiModelProperty(value = "")
    private Integer status;
}