package lesson_4;

import java.util.Objects;
import java.util.StringJoiner;

public class StringExample {

    public  static void main(String[] args){
        String first = "first str";
        String second = "first stR";


//        System.out.println(first.equals(second));
//        System.out.println(first.equalsIgnoreCase(second));// почему то false
        System.out.println(first.substring(3,7));

        char symbol = '1';
        Character symbolRef = '1';

        // String -> final - наследоваться от final нельзя


        String firstPull = "первая строка";


        String withNew = new String("первая строка"); // Конструктор. Минует пулл строк. (всегда новый объект)

        // withNew.intern(); // Помести значение в пулл

      // System.out.println(first.toLowerCase()); // каждая функция создает новую строку
        System.out.println("Строка без переменной");
        System.out.println("Строка без переменной " + " плюс вторая строка ");
        second.length(); // Длина

        String name = "John";
        String message = "Hello, %s %d %f";
        System.out.println(String.format(message, name, 123, 123F));

        StringBuilder stringBuilder  = new StringBuilder()
                .append("Первое значение")
                .append("Второе значение")
                .append("Третье значение");

if (message.length()> 10){
    stringBuilder.append("Final");
}
else {
    stringBuilder.append("One more")
            .append("Final");
}

        System.out.println(stringBuilder.toString());

        StringJoiner stringJoiner = new StringJoiner(" ","Это ", ", вот и все")
                .add("Первое значение")
                .add("Второе значение")
                .add("Третье значение");
        System.out.println(stringJoiner.toString());

        // Есть еще стринг буффер!
    }

}
