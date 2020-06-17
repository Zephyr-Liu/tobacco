package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-xr-model-SysEmp")
@Data
public class SysEmp {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String empId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String gender;

    @ApiModelProperty(value = "")
    private Integer age;

    @ApiModelProperty(value = "")
    private String education;

    @ApiModelProperty(value = "")
    private String politics;

    @ApiModelProperty(value = "")
    private String phone;

    @ApiModelProperty(value = "")
    private Integer deptId;

    @ApiModelProperty(value = "")
    private String loginName;

    @ApiModelProperty(value = "")
    private String loginPassword;

    @ApiModelProperty(value = "")
    private Integer positionId;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private String creator;

    @ApiModelProperty(value = "")
    private String createName;

    @ApiModelProperty(value = "")
    private Integer status;
}