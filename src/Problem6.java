public class Problem6 {
    public int pow(int a, int n){
        if(n == 0)
            return 1;
        else
            return a * pow(a, n - 1);
        /*
        @ pow - finding a^n or a power of n
        @ a - integer number
        @ n - integer number
        @ return - returning product of a^n
     */
    }
}
