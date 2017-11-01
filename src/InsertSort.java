import java.util.Scanner;

public class InsertSort extends Array {

    public InsertSort(int max){
        super(max);
    }

    public void sort(){
        System.out.println("Insert sort test");

        int in, out;

        for (out = 1; out < getnElems(); out ++){
            long temp = getElemValue(out);
            in = out;

            while (in > 0 && getElemValue(in-1) >= temp){
                setElement(in, getElemValue(in-1));
                --in;
            }
            setElement(in,temp);
        }
    }

}
