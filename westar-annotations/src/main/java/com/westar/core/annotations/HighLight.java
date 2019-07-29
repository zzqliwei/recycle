package com.westar.core.annotations;

import java.lang.annotation.*;

/**
 * 全文检索高亮字段
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface HighLight {
}
