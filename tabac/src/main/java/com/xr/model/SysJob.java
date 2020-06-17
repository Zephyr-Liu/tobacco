package com.xr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-xr-model-SysJob")
@Data
public class SysJob {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 岗位编号
    */
    @ApiModelProperty(value="岗位编号")
    private String jobId;

    /**
    * 岗位名称	
    */
    @ApiModelProperty(value="岗位名称	")
    private String jobName;

    /**
    * 部门名称id	员工所在部门的ID、名称
    */
    @ApiModelProperty(value="部门名称id	员工所在部门的ID、名称")
    private String empInDeptId;

    /**
    * 岗位描述	员工对应的岗位信息
    */
    @ApiModelProperty(value="岗位描述	员工对应的岗位信息")
    private String jobDesc;

    /**
    * 创建时间	系统当前时间
    */
    @ApiModelProperty(value="创建时间	系统当前时间")
    private Date createTime;

    @ApiModelProperty(value="")
    private String createId;

    @ApiModelProperty(value="")
    private String createName;

    /**
    * 岗位状态	0 正常、1 删除
    */
    @ApiModelProperty(value="岗位状态	0 正常、1 删除")
    private Byte status;
}