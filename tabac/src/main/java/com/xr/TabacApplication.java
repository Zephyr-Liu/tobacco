package com.xr;


import org.apache.shiro.spring.config.ShiroAnnotationProcessorConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(value = "com.xr.mapper")
public class TabacApplication {

    public static void main(String[] args) {
        SpringApplication.run(TabacApplication.class, args);
    }

}
