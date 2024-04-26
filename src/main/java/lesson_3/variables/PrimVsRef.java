package lesson_3.variables;

import lesson_3.class_type.SimpleClass;

public class PrimVsRef {

    public static void main(String[] args) {
        // Примитивы

        // Целочисленные переменные. Дефолтное значение всегда 0
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000;

        // Плавающая точка. Дефолтное значение всегда 0.0
        float floatVar = 2.3F;
        double doubleVar = 2.3;

        // Логическая переменная
        boolean isTrue = true;
        boolean isFalse = false;

        // Символьная переменная
        char charVar = '1';

        // Ссылочные переменные. Дефолтное значение - null
        // wrapper

        Byte byteRef = Byte.valueOf(byteVar);
        Short shortRef = Short.valueOf(shortVar);
        Integer intRef = Integer.valueOf(intVar);


        // Строковая переменная
        String stringVar = "Строковая переменная";

        SimpleClass simpleClass = new SimpleClass("some String");
        // SimpleClass simpleClassWithDef = new SimpleClass();

        int firstInt;

        SimpleClass simpleClassWithout = null;

    }
}
