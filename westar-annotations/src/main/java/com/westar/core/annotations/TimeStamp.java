package com.westar.core.annotations;

import java.lang.annotation.*;

/**
 * 全文检索, 标识时间戳
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface TimeStamp {
}
