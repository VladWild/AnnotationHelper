package com.annotation.helper.test.test1;

@ExampleAnnotation(name = "before class B")
@ExampleAnnotation2(number = 1)
public class ExampleClass {
    @ExampleAnnotation(name = "before static field class B")
    @ExampleAnnotation2(number = 2)
    public static String s = "Hello";

    @ExampleAnnotation(name = "before non-static field class B")
    public int a = 1;

    @ExampleAnnotation(name = "before constructor class B")
    @ExampleAnnotation2(number = 2)
    public ExampleClass() {
        super();
        a = 2;
    }

    public int c = 3;

    {
        a=11;
        c=33;
    }

    @ExampleAnnotation(name = "before method class B")
    public void method(){}

    @ExampleAnnotation(name = "before method toString class B")
    @Override
    public String toString() {
        return "B{" + "a=" + a + ", c=" + c + '}';
    }

    @ExampleAnnotation(name = "before inner class ClassA")
    private class ClassA {
        @ExampleAnnotation(name = "before field inner class ClassA")
        @ExampleAnnotation2(number = 2)
        public String s = "Hello";

        @ExampleAnnotation(name = "before method inner class ClassA")
        void method(){};

    }

    @ExampleAnnotation(name = "before nested class ClassB")
    @ExampleAnnotation2(number = 2)
    public static class ClassB {

        @ExampleAnnotation(name = "before constructor nested class ClassB")
        @ExampleAnnotation2(number = 6)
        ClassB(){

        }
    }
}

