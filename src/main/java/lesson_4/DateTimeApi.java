package lesson_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeApi {
    static class DocumentForPrint{
        private String text;


        public DocumentForPrint(String text){
            this.text = text;
        }
    }
    public static void main(String[] args) {
        printDocument(new DocumentForPrint("Примитивный документ"));

        LocalDate localDate = LocalDate.of(2020, Month.MAY,10);
        System.out.println(localDate);

        System.out.println(localDate.plusYears(10));
    }

    public static void printDocument(DocumentForPrint documentForPrint) {
        LocalDateTime currentDate = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyy");

        System.out.println("Печатаем документ " + documentForPrint.text + " с датой " + dateTimeFormatter.format(currentDate));
    }
}
