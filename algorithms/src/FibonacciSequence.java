import java.util.Stack;

public class FibonacciSequence {
    public static int doFibonacciSequence(int i){
        if (i < 0)
            throw new IllegalArgumentException();
        if (i == 1) return 1;
        if (i == 0) return 0;
        return (doFibonacciSequence(i-1)+doFibonacciSequence(i-2));
    }

    public static void stackFibonacci(int n){

        Stack<Integer> fibonacciStack = new Stack<>();
        fibonacciStack.push(1);
        fibonacciStack.push(1);

        int temp1;
        int temp2;

        for(int i = 0; i<n; i++){

            temp1= fibonacciStack.peek();
            temp2= fibonacciStack.pop()+fibonacciStack.peek();

            fibonacciStack.push(temp1);
            fibonacciStack.push(temp2);
        }


        System.out.println(fibonacciStack.toString());
    }

    public static void main(String[] args){
        for (int i = 1; i<13; i++)
            System.out.println(FibonacciSequence.doFibonacciSequence(i));

        System.out.println();

        FibonacciSequence.stackFibonacci(10);

    }
}