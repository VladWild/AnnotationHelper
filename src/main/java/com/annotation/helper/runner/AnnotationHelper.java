package com.annotation.helper.runner;

import com.annotation.helper.utilities.FactoryHandler;
import com.annotation.helper.utilities.Handler;

public class AnnotationHelper {
    //private static final String CLASS_NAME = "com.annotation.helper.test.test1.ExampleClass";
    private static final String CLASS_NAME = "com.annotation.helper.test.test2.ClassWithInnerClasses";

    private void run() throws ClassNotFoundException {
        Handler handler = FactoryHandler.getTypeHandler(FactoryHandler.RECURSION);

        System.out.println("Processing class " + CLASS_NAME + ":\n");
        for (String annotation : handler.getAnnotations(CLASS_NAME)) {
            System.out.println(annotation);
        }

        System.out.println("\nDone");
    }

    public static void main(String[] args) {
        AnnotationHelper helper = new AnnotationHelper();
        try {
            helper.run();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

