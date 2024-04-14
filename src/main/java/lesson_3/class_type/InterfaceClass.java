package lesson_3.class_type;



public interface InterfaceClass {
    void methodOne();
    void methodTwo();



    default int defaultMethod() {
        System.out.println("Реализация по умолчанию");
        return 1;
    }
}
