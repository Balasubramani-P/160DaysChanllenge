package EXwiTAns;

public class RecursionExample {

    public static int factorial(int n){
        if(n!=0){
            return n*factorial(n-1);
        }
        else {
            return 1;
        }
    }
    public static int fibonoci(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonoci(n-1)+fibonoci(n-2);
        }
    }
}

