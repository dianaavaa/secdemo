package com.example.seckilldemo.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: p
 * @date 2022/5/9 4:25 下午
 * @ClassName: AccessLimit
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AccessLimit {

    int second();

    int maxCount();

    boolean needLogin() default true;
}
