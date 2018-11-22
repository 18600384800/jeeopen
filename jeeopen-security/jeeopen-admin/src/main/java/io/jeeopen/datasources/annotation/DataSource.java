package io.jeeopen.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author Alan
 * @date 2018/11/20 19:49
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
