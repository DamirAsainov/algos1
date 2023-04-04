public class Problem7 {
     public int[] reverse(int n, int[] arr){
          if(arr.length - n >= n - 1)
               return arr;
          else{
               int temp = arr[arr.length - n]; // len - n = index of first num
               arr[arr.length - n] = arr[n - 1];
               arr[n - 1] = temp;
               //System.out.println(arr[arr.length - n] + " " + arr[n - 1]);
               return reverse(n - 1, arr);
          }
     }
}
