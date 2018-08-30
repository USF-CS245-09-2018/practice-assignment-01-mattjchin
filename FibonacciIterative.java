public class FibonacciIterative implements Fibonacci{

    /**
     * Create a function that iterates a Fibonacci function without the use of recursion.
     *
     * @param n the value that will use the fibonacci sequence to find the value of the sum of differences
     * @return the sum of the number in fibonacci form (taken from differences of values of sequence)
     */
    public int fibonacci(int n){

        int count = 0;
        int count2 = 1;
        /*
           Cannot be done for negative numbers
           Only to show that factorials cannot be done on negative numbers - return -1
        */

        if(n==0)
            return -1;
        else if(n<0)
            return n;
        else if(n==1)
            return 1;

        /*
            For loop used to create the count
            Count will start at 1 as count and count2 variables' sum is 1
            Sum variable initiated that is updated as the for loop goes through
                each iteration until one less than n
         */
        for(int i=1; i<n; i++){

            int sum = count + count2;
            count = count2;
            count2 = sum;
        }
        n=count2;

        return n;
    }
}
