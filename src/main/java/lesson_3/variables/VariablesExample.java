package lesson_3.variables;

import org.w3c.dom.ls.LSOutput;

public class VariablesExample {

    // public - глобальный уровень доступа,
    // final - неизменное значение,
    // static - для получения доступа не нужен экземпляр класса
    public final static int GLOBAL_CONST = 42;
    // получение доступа из другого места: System.out.println(VariablesExample.GLOBAL_CONST); - без класса

    // private - область видимости внутри класса
    private final static String STATIC_CLASS_CONST = "Статичная константа класса";


    final static VariablesExample REF_EX = new VariablesExample();

    String text = "Переменная экземпляра";

    public void someMethodWithLocal(){
        int localVar = 10;
        System.out.println("Локальная переменная = " + localVar);
    }
    public void someMethodWithParam(int firstParam, int secondParam){
        System.out.println("Параметры: firstParam = " + firstParam + ", secondParam = " + secondParam);
    }
    public void shadowing(){  // Затенение
        String text = "Переменная, которая затеняет исходный текст";
        System.out.println(text);  // переменная метода
        System.out.println(this.text); // переменная экземпляра
    }
    public void shadowingByArg(String text){}

    public static void main(String[] args) {

        House firstHouse = new House();
        firstHouse.materials = "Кирпич";

        House secondHouse = new House();
        firstHouse.materials = "Дерево";



    }

}
