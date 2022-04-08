package org.zy.ones.manager.common.excel;


import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DictConverter {
    String[] value() default "";
}
