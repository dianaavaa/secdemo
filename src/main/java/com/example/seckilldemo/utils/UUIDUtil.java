package com.example.seckilldemo.utils;

import java.util.UUID;

/**
 * UUID工具类
 *
 * @author: p
 * @date 2022/5/2 5:46 下午
 * @ClassName: UUIDUtil
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
