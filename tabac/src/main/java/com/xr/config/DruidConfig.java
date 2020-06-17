package com.xr.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zephyr.Liu
 * @date 2020/5/20 11:16
 * @Description Druid的配置类
 */
@Configuration
public class DruidConfig {


    /**
     * 将所有前缀为spring.datasource下的配置项都加载DataSource中
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }


    @Bean
    public ServletRegistrationBean registrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet());
        //添加初始化参数：initParams
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> map = new HashMap<>();
        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
        //用户名
        map.put("loginUsername", "root");
        //密码
        map.put("loginPassword", "root");
        //是否重置数据源
        map.put("resetEnable", "false");
        //白名单
        map.put("allow", "127.0.0.1");
        //"deny", "192.168.31.253"  黑名单
        //设置初始化参数
        servletRegistrationBean.setInitParameters(map);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        // 所有请求进行监控处理
        filterRegistrationBean.addUrlPatterns("/*");
        // 排除名单
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
        return filterRegistrationBean;
    }

}
