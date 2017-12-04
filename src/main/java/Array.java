import java.util.InputMismatchException;
import java.util.Random;

public abstract class Array {

    private long[] a;
    private int nElems;


    public Array( int max){
        a = new long[max];
        nElems = 0;
    }


    private Random random = new Random();


    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void setElement(int index, long value){
        a[index] = value;
    }

    public void display(){
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int getnElems(){
        return nElems;
    }

    public long getElemValue(int index){
        return a[index];
    }

    public void randomSet(int size){
        for (int i = 0; i < size; i++)
            insert(random.nextInt(100));
    }

    public void sort(){
    }

}
