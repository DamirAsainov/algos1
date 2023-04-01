public class Problem6 {
    public int pow(int a, int n){
        if(n == 0)
            return 1;
        else
            return a * pow(a, n - 1);
    }
}
