package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-PartyDisciplineReport")
@Data
public class PartyDisciplineReport {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String reporttype;

    @ApiModelProperty(value = "")
    private String reportfile;

    @ApiModelProperty(value = "")
    private Date createtime;

    @ApiModelProperty(value = "")
    private Integer cid;

    @ApiModelProperty(value = "")
    private String cname;

    @ApiModelProperty(value = "")
    private Integer sid;
}