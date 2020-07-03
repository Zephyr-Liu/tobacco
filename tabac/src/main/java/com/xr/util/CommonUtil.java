package com.xr.util;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 19:21
 * @Description   加盐加密
 */
public class CommonUtil {
    /**
     * 产生盐值
     *
     * @return  加盐密码
     */
    public static String getSalt() {
        //生成盐需要存入数据库中的
        return new SecureRandomNumberGenerator().nextBytes().toHex();
    }

    /**
     * 根据盐值和原始密码MD5加密n次
     *
     * @param originalPassword 原始密码
     * @param salt             盐
     * @param n                次数
     * @return md5 密码
     */
    public static String getMd5Password(String originalPassword, String salt, Integer n) {
        return new Md5Hash(originalPassword, salt, n).toString();
    }

    /**
     * 测试 过程
     */

    public static void main(String[] args) {
        //生成盐（部分，需要存入数据库中）
        String salt = getSalt();
        System.out.println(salt);
        //将原始密码加盐（上面生成的盐），并且用md5算法加密三次，将最后结果存入数据库中
        String pwd = getMd5Password("431028", salt, 2);
        System.out.println(pwd);
    }
}
