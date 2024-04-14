package lesson_3.class_type;



// может быть несколько
public  class InterfaceImpl implements InterfaceClass {
    @Override
    public void methodOne(){
        System.out.println("Переопределенный метод");
    }

    @Override
    public void methodTwo() {
        System.out.println("2");
    }
    public void methodThree() {
        System.out.println("3");
    }
    public static void main(String[] args) {
        InterfaceClass example = new InterfaceImpl();

       // example.methodOne();
       //  example.defaultMethod();
    }

}
