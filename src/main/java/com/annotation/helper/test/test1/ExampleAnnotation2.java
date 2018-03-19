package com.annotation.helper.test.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.FIELD,
        ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ExampleAnnotation2 {
    String nameOfAnnotation() default "ExampleAnnotation2";
    int number();
}

