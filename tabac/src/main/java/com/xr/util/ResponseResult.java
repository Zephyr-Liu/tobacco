package com.xr.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/6/10 19:29
 * @Description 与前台的验证 验证状态
 */
@Data
public class ResponseResult {
    /**
     * 返回到前端的状态码，20000表示成功
     */
    private Integer code = 20000;

    /**
     * private Map<String,Object> data = new HashMap<>();
     */
    private Map<String, Object> data = new HashMap<>();

    private String message = "默认的错误信息";

}
