
public class SelectSort extends Array {

    public SelectSort(int max){
        super(max);
    }

    public void sort(){
        System.out.println("Selection sort test");

        int out, in, min;

        for (out = 0; out < getnElems()-1; out++){
            min = out;
            for (in = out+1; in < getnElems(); in++)
                if(getElemValue(in) < getElemValue(min))
                    min = in;
            swap(out, min);

        }
    }
}
