package com.xr.log;


import com.alibaba.fastjson.JSON;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.message.AuthException;
import javax.servlet.http.HttpServletRequest;

import com.xr.controller.SysLogController;
import com.xr.model.SysLog;
import com.xr.service.SysLogService;
import com.xr.shiro.MyShiroRealm;
import com.xr.util.GetUserTokenInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Zephyr.Liu
 * @date 2020/6/23 15:04
 * @Description
 * @Asprct  表示这是一个切面
 * @Pointcut 表示切入点，可以表达式，也可以用注解  我这里用的是表达式
 * @AfterReturning 和 @After 不同的是,表示在得到返回内容后切入
 *
 * 类描述: 日志拦截器，打印controller层的入参和出参
 */


@Aspect
@Component
public class ControllerAspect {


    private SysLogService sysLogService;

    @Autowired
    public ControllerAspect(SysLogService sysLogService) {
        this.sysLogService = sysLogService;
    }

    /**
     *  使用指定类初始化日志对象, 在日志输出的时候，可以打印出日志信息所在的类
     *   LoggerFactory中的getLogger方法，返回一个以name命名的静态绑定的实例， 而这个name一般以Logger实例所在的类命名，如通过类名.Class.getName()获取
     */
    private Logger logger=LoggerFactory.getLogger(this.getClass());


    /**
     * 装载数据 到controller 操作  这个log层 不做增加操作
     */
    private Map<String, Object> map=new HashMap<>();

    /**
     * 创建一个局部线程
     *
     * ThreadLocal 是线程的局部变量， 是每一个线程所单独持有的，
     * 其他线程不能对其进行访问， 通常是类中的 private static 字段，是对该字段初始值的一个拷贝，
     * 它们希望将状态与某一个线程（例如，用户 ID 或事务 ID）相关联
     */
    ThreadLocal<Long> startTime=new ThreadLocal<>();

    /**
     *  切面方法
     */
    @Pointcut("execution(public * com.xr.controller.*.*(..))")
    public void setLogger(){

    }

   /*public void doBefore(JoinPoint joinPoint) throws Throwable {
        start.set(System.currentTimeMillis());

        //接受请求,记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //记录以下请求内容
        logger.info("请求Url:"+request.getRequestURI().toString());
        logger.info("请求类型:"+request.getMethod());
        logger.info("请求IP"+request.getRemoteAddr());
        logger.info("接口包路径:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

    }

    @AfterReturning(returning = "ret",pointcut = "setLogger()")
    public void doAfterReturning(Object ret)throws Throwable {
        //请求处理要求,返回内容
        logger.info("RESPONSE "+ret);
        logger.info("SPEND TIME"+(System.currentTimeMillis()));
    }*/


    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Before("setLogger()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("请求url : " + request.getRequestURL().toString());
        logger.info("请求类型 : " + request.getMethod());
        logger.info("IP(这块重点不在ip) : " + request.getRemoteAddr());
        logger.info("接口包路径 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("参数 : " + Arrays.toString(joinPoint.getArgs()));

        SysLog sysLog=new SysLog();
        sysLog.setUrl(request.getRequestURL().toString());
        sysLog.setHttpMethod(request.getMethod());
        sysLog.setIp(request.getRemoteAddr());
        sysLog.setClassMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        sysLog.setRequestArgs(Arrays.toString(joinPoint.getArgs()));
        sysLogService.addLog(sysLog);
    }

    @AfterReturning(returning = "ret", pointcut = "setLogger()")
    public void doAfterReturning(Object ret) throws Exception {

        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));

    }


}
