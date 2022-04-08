package org.robin.ones.gasmanager.common.excel;


import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DictConverter {
    String[] value() default "";
}
