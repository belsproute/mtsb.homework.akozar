package lesson_3.operators;

public class Logical {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("!IsTrue = " + !isTrue);
        System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));

        System.out.println("isTrue ^ isFalse = " + (isTrue ^ isFalse));
    }
}
