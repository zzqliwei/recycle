package com.westar.core.annotations;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface ExcelExportColumn {

    //列名
    public String name();

    //导出次序
    public int order() default 0;

}

