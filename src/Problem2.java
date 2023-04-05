public class Problem2 {
    public double average(int[] arr, int n){
        if(n == 0){
            return 0;
        }
        else{
            return (average(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
        }
        /*
        @ average - finding average of numbers in array
        @ arr - an array with int elements
        @ n - length of array
        @ return - returning average num in array

     */
    }
}
