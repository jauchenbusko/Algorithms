import java.util.ArrayList;
import java.util.List;

public class StackOverFlow {

    public static void addElemet(List<String> strings) throws StackOverflowError {

        strings.add("a");
        StackOverFlow.addElemet(strings);

    }


    public static void main(String[] args){

        try {
            StackOverFlow.addElemet(new ArrayList<>());

        } catch (Throwable stackOverflowError){
            stackOverflowError.printStackTrace();
            System.out.print(stackOverflowError.getCause().toString());
        }




    }
}
