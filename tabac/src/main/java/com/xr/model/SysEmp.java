package com.xr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Coisini
 */
@ApiModel(value="com-xr-model-SysEmp")
@Data
public class SysEmp {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Integer id;

    /**
    * 部门id
    */
    @ApiModelProperty(value="员工编号id")
    private String empId;

    /**
    * 员工姓名
    */
    @ApiModelProperty(value="员工姓名")
    private String empName;

    /**
    * 员工姓名
    */
    @ApiModelProperty(value="员工性别")
    private String empSex;

    /**
    * 员工年龄
    */
    @ApiModelProperty(value="员工年龄")
    private Integer empAge;

    /**
    * 员工的学历
    */
    @ApiModelProperty(value="员工的学历")
    private String empEducation;

    /**
    * 政治面貌 党员、团员、无
    */
    @ApiModelProperty(value="政治面貌 党员、团员、无")
    private String empPoliticalFace;

    /**
    * 员工手机号
    */
    @ApiModelProperty(value="员工手机号")
    private String empPhone;

    /**
    * 部门id
    */
    @ApiModelProperty(value="部门id")
    private Integer deptId;

    /**
    * 登录名
    */
    @ApiModelProperty(value="登录名")
    private String loginName;

    /**
    * 登陆密码
    */
    @ApiModelProperty(value="登陆密码")
    private String loginPassword;

    /**
    * 岗位id
    */
    @ApiModelProperty(value="岗位id")
    private Integer jobId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台传到前台的日期格式转换
    private Date createTime;

    /**
    * 创建者 当前登陆人的id
    */
    @ApiModelProperty(value="创建者 当前登陆人的id")
    private Integer createId;

    /**
    * 创建者姓名
    */
    @ApiModelProperty(value="创建者姓名")
    private String createName;

    /**
    * 状态  0  正常、1  删除、2  离退、3 借调
    */
    @ApiModelProperty(value="状态  0  正常、1  删除、2  离退、3 借调")
    private Integer status;

    /**
     *  多表联查
     */
    private SysJob job;

    /**
     * 多表联查
     */
    private SysDept dept;
}
