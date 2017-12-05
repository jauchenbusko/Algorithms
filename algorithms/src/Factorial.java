public class Factorial {
    public static int calcFactorialIteral(int n){
        if (n<1)
            throw new IllegalArgumentException();

        int toReturn = 1;

        for (int i =1; i <=n; i++)
            toReturn *= i;

        return toReturn;
    }

    public static int calcFactorialRecural(int n){
        if (n<1)
            throw new IllegalArgumentException();
        if(n == 1){
            return 1;
        }
        return n * (calcFactorialRecural(n-1));
    }

    public static void main(String[] args){
        System.out.println(Factorial.calcFactorialIteral(5));
        System.out.println(Factorial.calcFactorialRecural(6));
    }
}
