package lesson_3.operators;

// Математические операции
public class Maths {
    public static  int sum(int first, int second){ return first + second;  }
    public static  int subtract(int first, int second){ return first - second;  }
    public static  int multiply (int first, int second){ return first * second; }
    public static  int divide(int first, int second){ return first / second;  }

    public static int operWithAssign(int first, int second) {
        first += 10;
        second -= 3;

        first %= 1;
        second *= 5;

        return first + second;
    }

    public static void main(String[] args) {
        int first = 3;
        int second = 3;

        int incrementResult = 2* first++;
        int decrementResult = 2* --second;

        System.out.println("Increment Result = " + incrementResult);
        System.out.println("Decrement Result = " + decrementResult);
    }
}
