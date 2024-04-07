package lesson_3.class_type;

// может быть несколько
public class InterfaceImpl implements InterfaceClass {
    @Override
    public void methodOne(){
        System.out.println("Переопределенный метод");
    }

    @Override
    public void methodTwo() {

    }

    public static void main(String[] args) {
        InterfaceClass example = new InterfaceImpl();

        example.methodOne();
        example.defaultMethod();
    }
}
