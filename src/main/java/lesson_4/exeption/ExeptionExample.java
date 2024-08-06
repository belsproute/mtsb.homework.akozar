package lesson_4.exeption;

import java.io.*;

public class ExeptionExample {
    private static  Integer CONST = 100;
    public static void main(String[] args) {
        // System.out.println(divide(null,10));

        int result;
        try {
           // result = divideWithCheckedExeption(null,10);
            result = divideWithCheckedExeption(10,null);

        }catch (InvalidObjectException e){
          //  throw new RuntimeException(e);
            // System.out.println("Произошла некритичная ошибка: " + e);

          throw new CustomExeption("При делении произошла ошибка", e);
        }catch(CustomExeption e){
            System.out.println("Ничего страшного");
        }
        finally {
            System.out.println("Вызываем finally");
        }
        try (FileInputStream fileInputStream = new FileInputStream("exampe.txt")){
            InputStreamReader reader = new InputStreamReader(fileInputStream);
        }
        catch (IOException e){

        }
        System.out.println("Продолжаем исполнение");
    }

    public static int divide(Integer first, Integer second){
        if (first == null || first < 0) {
           throw  new RuntimeException("Был передан некорректный параметр");
        }
        return first / second;
    }

    public static int divideWithCheckedExeption(Integer first, Integer second) throws InvalidObjectException{
        if (first == null || first < 0) {
            throw new InvalidObjectException("Был передан некорректный параметр");
        }

        if (second == null){
            throw new CustomExeption("Ошибка! Нет второго поля", new NullPointerException("Пустое поле"));
        }

        return first / second;
    }

}
