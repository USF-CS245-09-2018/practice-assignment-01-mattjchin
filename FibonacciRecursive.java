public class FibonacciRecursive implements Fibonacci{

    public int fibonacci(int n){

        if(n==0)
            return n;
        else if(n<0)
            return n;
        else if(n==1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
