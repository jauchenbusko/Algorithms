

public class BubbleSort extends Array{


    public BubbleSort(int max){
        super(max);
    }

    public void sort(){
        System.out.println("Bubble sort test");

        int out, in;

        for (out = getnElems()-1; out > 1; out--)                   //outside cicle minimazing
            for (in = 0; in < out; in++)                            //inside cicle maximazing
                if(getElemValue(in) > getElemValue(in+1)){
                swap(in, in+1);
                }
    }

}
