package lesson_3.operators;

public class Bits {
// Битовое представление
    public static void main(String[] args) {
        int first = 123;
        int second = 321;

        System.out.println(Integer.toBinaryString(first));
        System.out.println(Integer.toBinaryString(-first));

        System.out.println(Integer.toBinaryString(second));

        System.out.println(Integer.toBinaryString(first & second));
        System.out.println(Integer.toBinaryString(first | second));
        System.out.println(Integer.toBinaryString(first * second));

        // Почитать больше
    }

}
