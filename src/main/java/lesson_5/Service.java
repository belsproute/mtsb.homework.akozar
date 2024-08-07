package lesson_5;



import java.io.FilterOutputStream;


public class Service {


    private final DataHelper dataHelper;


    public Service(DataHelper dataHelper) {
        this.dataHelper = dataHelper;
    }

    public int sum(Request request) {
        Integer first = request.getFirst();
        Integer second = request.getSecond();

        System.out.println(">> sum() first " + first + " second " + second);

        if (first == null) {
            throw new RuntimeException("First is empty");
        }

        if (second == null) {
            System.out.println("Empty second. Using default");
            second = Fetcher.getDefaultValue();

        }

        if (first > second) {
            System.out.println("Using DataHelper");
            try{
                first = dataHelper.checkForInteger(second);
            }
            catch(RuntimeException e){
                throw new RuntimeException("Error during service running");
            }

            first = dataHelper.checkForInteger(second);
            System.out.println("New value = " + first);
        }


        int result = first + second;
        System.out.println("<< sum() result = " + result);
        return result;

    }
}
