package lesson_3.constructions;

public class ConstructionalsExpressions {
    public void ifElse(int first) {

        if (first > 10) {
            System.out.println("Значение больше 10");
        } else {
            System.out.println("Значение меньше или равно 10");
        }
    }

    public void switchExp(int first) {
        switch (first){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("не смогли определить число");
        }
    }

    public void ternary(int first) {
        int second = first > 10 ? 20 : 15;
    }

}
