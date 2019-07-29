package com.westar.core.annotations;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface ExcelExportTitle {

    //标题
    public String title() default "";


}

