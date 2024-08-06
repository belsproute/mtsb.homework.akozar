package lesson_3.class_type;


import org.w3c.dom.ls.LSOutput;

// Методы могут быть не абстрактными, но если хотя бы один метод абстрактный - класс должен быть абстрактным
public class AbstractClass {
    static abstract class Form {
        String hidingField = "Form class";
        protected final String someProtectedString = "some Protected String";

        abstract void shapeArea();
        abstract Number someRefNumber();
        abstract int somePrimNumber();

        public void defaultMethod() {
            System.out.println("Дефолтный метод. Текст: " + someProtectedString + " " + hidingField);
        }

    }
// Множественное наследование не поддерживается
    static class Triangle extends Form {
        String hidingField = "Triangle class";

        @Override
        void shapeArea() {
            System.out.println("0.5 основания * высоту");
        }
        @Override
        Number someRefNumber() {
            return 10;
        }
        @Override
        int somePrimNumber() {
            return 42;
        }
        @Override
        public void defaultMethod() {
            System.out.println("Дефолтный метод наследника. Текст: "+ someProtectedString + " " + hidingField + " " + super.hidingField);
        }
    }

    public static void main(String[] args) {
        Form triangleForm = new Triangle();

        triangleForm.defaultMethod();
        triangleForm.shapeArea();
    }
}
