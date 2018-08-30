
public class FactorialRecursive implements Factorial{

    /**
     * Return the factorial product of a number using recursion
     * Subtract 1 from n after each recursive process
     *
     * @param n the number that will be multiplied in factorial form
     * @return the product of the factorial of n starting with n and taking 1 from n each time around
     */
    public int factorial(int n){

        /*
           Cannot be done for negative numbers
           Only to show that factorials cannot be done on negative numbers - return -1
        */
        if(n<0)
            return -1;
        // Factorial of 0 or 1 is 1
        if(n==0 || n==1)
            return 1;
        /*
            Return the product of n and factorial(n-1)
            Functions keep calling until factorial(0) = 1
         */
        return n * factorial(n-1);
    }

}
