package com.annotation.helper.test.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.FIELD,
        ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Name {
    String name();
}
