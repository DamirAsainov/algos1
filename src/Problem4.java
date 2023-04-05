public class Problem4 {
    public int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
        /*
        @ factorial - finding n! or factorial of n
        @ n - integer number
        @ return - returning factorial of n

     */
    }
}
