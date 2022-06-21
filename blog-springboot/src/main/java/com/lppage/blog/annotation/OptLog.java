package com.lppage.blog.annotation;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

    /**
     * @return 操作类型
     */
    String optType() default "";

}
