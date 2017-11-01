import java.util.InputMismatchException;
import java.util.Scanner;

public class SortTests {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);



        //Bubble sort test
        System.out.println("Bubble sort test, please enter number of elements");


            int nElems1 = in.nextInt();
            System.out.println("Input mismatch");

            BubbleSort bubble = new BubbleSort(1000);

            bubble.randomSet(nElems1);
            bubble.display();

            bubble.sort();
            bubble.display();

            bubble.randomSet(5);
            bubble.display();

            bubble.sort();
            bubble.display();


        //Selection sort test
        System.out.println("\nSelection sort test, please enter number of elements");

        int nElems2 = in.nextInt();
        SelectSort select = new SelectSort(1000);

        select.randomSet(nElems2);
        select.display();

        select.sort();
        select.display();

        select.randomSet(5);
        select.display();

        select.sort();
        select.display();


        //Insert sort test
        System.out.println("\nInsert sort test, please enter number of elements");

        int nElems3 = in.nextInt();
        InsertSort insert = new InsertSort(1000);

        insert.randomSet(nElems3);
        insert.display();

        insert.sort();
        insert.display();

        insert.randomSet(5);
        insert.display();

        insert.sort();
        insert.display();
    }
}
