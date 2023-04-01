public class Problem3 {
    // prime number
    public boolean isPrimeNum(int n){
        if(n == 1)
            return true;
        for(int i = 2; i < n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
