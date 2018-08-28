public class FactorialIterative implements Factorial{

    /**
     * Create a function that iterates a factorial function
     *
     * @param n the integer that is used to determine the product factorial
     * @return the factorial form of the number, as a product
     */
    public int factorial(int n){

        int x = n;
        int prod=1;  // Product will be initialized as 1
        if(x<0)
            return x;
        if(x == 0 || x == 1)
            return x;
        /*
            If the number is greater than 1 the function will go through the for loop
            Until the iteration reaches n, the product will continue to be updated
            The value i will be multiplied to the product until i>n and exits the for loop
         */
        for (int i=1; i<=n; i++)
            prod *= i;
            n=prod;
        return n;
    }

}
