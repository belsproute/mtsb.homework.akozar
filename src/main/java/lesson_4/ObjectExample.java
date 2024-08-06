package lesson_4;

import java.sql.SQLOutput;
import java.util.Objects;

public class ObjectExample {
    static class Example {
        private String name;
        private int count;

        public Example(String name, int count){
            this.name = name;
            this.count = count;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Example example = (Example) o; // Приведение типов  для доступа к полям
            return count == example.count && Objects.equals(name, example.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, count);
        }

        @Override
        public String toString() {
            return "Example{" +
                    "name='" + name + '\'' +
                    ", count=" + count +
                    '}';
        }
    }

    public static void main(String[] args){


       // System.out.println(first.getClass().getSimpleName());
        // Возвращает инфо по классу, можно кратко получить имя класса
        // System.out.println(first.hashCode());
        // Возвращает хэш-код объекта
        Example first = new Example("first",1);
        Example second = new Example("second",2);
        Example duplicate = new Example("first",1); // Объекты не равны.

        System.out.println(first.toString());
        System.out.println(second.toString());

        System.out.println(first.hashCode());
        System.out.println(duplicate.hashCode());

        System.out.println(first.equals(second));
        System.out.println(first.equals(duplicate));
        System.out.println(first.equals(null)); // Будет false, никакой ошибки

        // Многопоточное программирование

        first.notify();
        first.notifyAll();

        // first.wait();

    }
}
