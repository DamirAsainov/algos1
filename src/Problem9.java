public class Problem9 {
    public int binomialCoeff(int k, int n){
        if(k == 0 || k == n)
            return 1;
        else
            return binomialCoeff(k - 1, n - 1) + binomialCoeff(k, n - 1);
    }
}
