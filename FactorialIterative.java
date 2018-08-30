public class FactorialIterative implements Factorial{

    /**
     * Create a function that iterates a factorial function
     *
     * @param n the integer that is used to determine the product factorial
     * @return the factorial form of the number, as a product
     */
    public int factorial(int n){

        int x = n;  // Create a new variable
        int prod=1;  // Product will be initialized as 1
        if(x<0)
            return -1;  // only to show that factorials cannot be done on negative numbers - return -1
        else if(x == 0)
            return 1;  // Return 1 if it is 0! or factorial(0)
        else if(x == 1)
            return x;  // Return 1 if it is factorial(1)

        /*
            If the number is greater than 1 the function will go through the for loop
            Until the iteration reaches n, the product will continue to be updated
            The value i will be multiplied to the product until i>n and exits the for loop
         */
        for (int i=1; i<=n; i++)
            prod *= i;
            n=prod;
        return n;  // Return the value of n - the factorial of n
    }

}
