package lesson_3.class_type;

public class SimpleClass {
    private final String simpleField;
/*
    public SimpleClass(){} // Конструктор с пустым значением
*/
    public SimpleClass(String simpleField){ // Конструктор с инициализацией строки
        this.simpleField = simpleField;
    }

    public void simpleMethod(){
        System.out.println("Метод для вывода значения переменной: " + simpleField);
    }

    public static void main(String[] args) {
        SimpleClass first = new SimpleClass("First object");
        SimpleClass second = new SimpleClass("Second object");

        first.simpleMethod();
        second.simpleMethod();
    }
}
