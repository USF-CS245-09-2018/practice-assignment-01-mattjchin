public class FibonacciRecursive implements Fibonacci{

    /**
     * Function represents the Fibonacci sequence of the number used with recursion
     * Function fibonacci will be called multiple times
     *
     * If n is 0 or 1 the sum of n using the fibonacci sequence is respectively 0 or 1
     *
     * @param n the integer used to calculate the fibonacci sum of the number
     * @return the sum of the number used for the fibonacci sequence via recursion
     */
    public int fibonacci(int n){

        if(n==0)
            return n;
        else if(n==1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
