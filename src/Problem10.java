public class Problem10 {
    public int GCD(int a, int b){
        if(a % b == 0)
            return b;
        else
            return GCD(b, a % b);
         /*

        @ GCD - finding great common divisor by Euclidean algorithm
        @ a - integer num
        @ n - integer num
        @ return - returning great common divisor
     */
    }
}
