package ru.geekbtains.java_core1.lessons.lesson1_intro;

//UpperCamelCase (PascalCase) SomeExampleLongNamedClass
public class HelloWorld {

    public static void main(String[] args) {
//        printHelloWorld();
//        variables();

        int a = 10;
        int b = 20;
        int c = 150;

        int q = a* b - c + (a + b) / 4;
        // || или && и ! отрацание == сравнение != не равно

        byte byteVariable;
        byteVariable = 20;
//        System.out.println(byteVariable);
        byte r = 78; //1b 8bit -128...127
        short shortVar = 90;//2b -32768...32767
        int integerVar = 2_145_999_999;//4b -2.1b..2.1b
        long longVar = -1_999_999_222_545_999_999L; //8b

        double doubleVar = 10.1238; //8b D
        float floatVar = 0.24F; //4b f or F cause more bits

        char charVar = 78; //2b 0...65535
        char charVar1 = 'Q';
        char charVar2 = '\u0000';
        char charVar3 = '\u3278';
        System.out.println(charVar3);

        boolean boolVar = true;

        float f = 10.0F / 3;
        double d = 10.0 / 3;
        System.out.println("Double: " + d);
        System.out.println("Float: " + f);

        String stringVar = new String("Some");
        String s = "Hello!";
        System.out.println(s);
    }

    public static void printHelloWorld() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        }
        // if, else, else is
    //public static ...
    //return
    //camelCase someExampleLongNamedMethodForStudents (var and methods)
    }