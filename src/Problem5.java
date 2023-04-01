public class Problem5 {
    public int fibonacciNum(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
}
