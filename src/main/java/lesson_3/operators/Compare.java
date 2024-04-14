package lesson_3.operators;

public class Compare {
    public static void main(String[] args) {
        compareNum(10, 5);
        compareNum(5, 10);
        compareNum(5, 5);
    }

    public static void compareNum(int first, int second) {
        System.out.println(first + " > " + second + " = " + (first > second));
        System.out.println(first + " < " + second + " = " + (first < second));

        System.out.println(first + " == " + second + " = " + (first == second));
        System.out.println(first + " != " + second + " = " + (first != second));

        System.out.println(first + " >= " + second + " = " + (first >= second));
        System.out.println(first + " <= " + second + " = " + (first <= second));

        System.out.println("----------------------------");
    }
}
