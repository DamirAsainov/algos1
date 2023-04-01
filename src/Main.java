import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input problem");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                Problem1 pr1 = new Problem1();
                System.out.println("Input len of array");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                System.out.println("Input array by space");
                for(int i = 0; i < n; i++){
                    arr[i] = scanner.nextInt();
                }
                System.out.println("min - " + pr1.minimumNum(arr, n));
                break;
            case 2:
                Problem2 pr2 = new Problem2();
                System.out.println("Input len of array");
                n = scanner.nextInt();
                arr = new int[n];
                System.out.println("Input array by space");
                for(int i = 0; i < n; i++){
                    arr[i] = scanner.nextInt();
                }
                System.out.println("min - " + pr2.average(arr, n));
                break;
        }
    }
}