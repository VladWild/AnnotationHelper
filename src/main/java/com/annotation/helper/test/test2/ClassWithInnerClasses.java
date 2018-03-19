package com.annotation.helper.test.test2;


import java.lang.annotation.ElementType;

@Type(type = ElementType.TYPE)
@Name(name = "ClassWithInnerClasses")
@Level(level = 0)
public class ClassWithInnerClasses {
    @Type(type = ElementType.FIELD)
    @Name(name = "field1")
    @Level(level = 0)
    int field1;

    @Type(type = ElementType.FIELD)
    @Name(name = "field2")
    @Level(level = 0)
    String field2;

    @Type(type = ElementType.CONSTRUCTOR)
    @Name(name = "ClassWithInnerClasses(){};")
    @Level(level = 0)
    public ClassWithInnerClasses(){};

    @Type(type = ElementType.CONSTRUCTOR)
    @Name(name = "ClassWithInnerClasses(int field1, String field2) {}")
    @Level(level = 0)
    public ClassWithInnerClasses(int field1, String field2) {}

    @Type(type = ElementType.TYPE)
    @Name(name = "A")
    @Level(level = 1)
    class A{

        @Type(type = ElementType.FIELD)
        @Name(name = "field1")
        @Level(level = 1)
        int field1;

        @Type(type = ElementType.FIELD)
        @Name(name = "field2")
        @Level(level = 1)
        String field2;


        @Type(type = ElementType.TYPE)
        @Name(name = "A1")
        @Level(level = 2)
        class A1{

            @Type(type = ElementType.FIELD)
            @Name(name = "field1")
            @Level(level = 2)
            int field1;

            @Type(type = ElementType.FIELD)
            @Name(name = "field2")
            @Level(level = 2)
            String field2;


            @Type(type = ElementType.TYPE)
            @Name(name = "A11")
            @Level(level = 3)
            class A11{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;
            }

            @Type(type = ElementType.TYPE)
            @Name(name = "A12")
            @Level(level = 3)
            class A12{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;

                @Type(type = ElementType.METHOD)
                @Name(name = "method1")
                @Level(level = 3)
                void method1(){};

                @Type(type = ElementType.METHOD)
                @Name(name = "method2")
                @Level(level = 3)
                void method2(){};
            }
        }

        @Type(type = ElementType.TYPE)
        @Name(name = "A2")
        @Level(level = 2)
        class A2{
            @Type(type = ElementType.FIELD)
            @Name(name = "field1")
            @Level(level = 2)
            int field1;

            @Type(type = ElementType.FIELD)
            @Name(name = "field2")
            @Level(level = 2)
            String field2;

            @Type(type = ElementType.CONSTRUCTOR)
            @Name(name = "A2(){};")
            @Level(level = 0)
            public A2(){};

            @Type(type = ElementType.CONSTRUCTOR)
            @Name(name = "A2(int field1, String field2) {}")
            @Level(level = 0)
            public A2(int field1, String field2) {}

            @Type(type = ElementType.TYPE)
            @Name(name = "A21")
            @Level(level = 3)
            class A21{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;
            }

            @Type(type = ElementType.TYPE)
            @Name(name = "A22")
            @Level(level = 3)
            class A22{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;
            }
        }
    }

    @Type(type = ElementType.TYPE)
    @Name(name = "B")
    @Level(level = 1)
    class B{
        @Type(type = ElementType.FIELD)
        @Name(name = "field1")
        @Level(level = 1)
        int field1;

        @Type(type = ElementType.FIELD)
        @Name(name = "field2")
        @Level(level = 1)
        String field2;

        @Type(type = ElementType.TYPE)
        @Name(name = "B1")
        @Level(level = 2)
        class B1{
            @Type(type = ElementType.FIELD)
            @Name(name = "field1")
            @Level(level = 2)
            int field1;

            @Type(type = ElementType.FIELD)
            @Name(name = "field2")
            @Level(level = 2)
            String field2;

            @Type(type = ElementType.TYPE)
            @Name(name = "B11")
            @Level(level = 3)
            class B11{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;

                @Type(type = ElementType.METHOD)
                @Name(name = "method1")
                @Level(level = 3)
                void method1(){};

                @Type(type = ElementType.METHOD)
                @Name(name = "method2")
                @Level(level = 3)
                void method2(){};
            }

            @Type(type = ElementType.TYPE)
            @Name(name = "B12")
            @Level(level = 3)
            class B12{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;
            }
        }

        @Type(type = ElementType.TYPE)
        @Name(name = "B2")
        @Level(level = 2)
        class B2{
            @Type(type = ElementType.FIELD)
            @Name(name = "field1")
            @Level(level = 2)
            int field1;

            @Type(type = ElementType.FIELD)
            @Name(name = "field2")
            @Level(level = 2)
            String field2;

            @Type(type = ElementType.TYPE)
            @Name(name = "B21")
            @Level(level = 3)
            class B21{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;
            }

            @Type(type = ElementType.TYPE)
            @Name(name = "B22")
            @Level(level = 3)
            class B22{
                @Type(type = ElementType.FIELD)
                @Name(name = "field1")
                @Level(level = 3)
                int field1;

                @Type(type = ElementType.FIELD)
                @Name(name = "field2")
                @Level(level = 3)
                String field2;

                @Type(type = ElementType.CONSTRUCTOR)
                @Name(name = "B22(){};")
                @Level(level = 3)
                public B22(){};

                @Type(type = ElementType.CONSTRUCTOR)
                @Name(name = "B22(int field1, String field2) {}")
                @Level(level = 3)
                public B22(int field1, String field2) {}
            }

            @Type(type = ElementType.METHOD)
            @Name(name = "method1")
            @Level(level = 2)
            void method1(){};

            @Type(type = ElementType.METHOD)
            @Name(name = "method2")
            @Level(level = 2)
            void method2(){};
        }

        @Type(type = ElementType.METHOD)
        @Name(name = "method1")
        @Level(level = 1)
        void method1(){};

        @Type(type = ElementType.METHOD)
        @Name(name = "method2")
        @Level(level = 1)
        void method2(){};
    }
}
