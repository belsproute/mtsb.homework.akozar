package lesson_4.exeption;

public class CustomExeption extends RuntimeException {
private static final String ERROE_MESSAGE = "Произошла критическая ошибка";
    public CustomExeption(){
        super(ERROE_MESSAGE);
    }

    public CustomExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
