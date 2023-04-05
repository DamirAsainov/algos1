public class Problem1 {
    public int minimumNum(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        else{
            int min = minimumNum(arr,n - 1);
            if (min <= arr[n - 1])
                return min;
            else
                return arr[n-1];
        }
        /*
        @ minimumNum - finding minimum num in array
        @ arr - an array with int elements
        @ n - length of array
        @ return - returning min int in array
     */

    }
}
