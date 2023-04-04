import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
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
                case 3:
                    Problem3 pr3 = new Problem3();
                    System.out.println("Input num");
                    n = scanner.nextInt();
                    if(pr3.isPrimeNum(n))
                        System.out.println("Prime");
                    else
                        System.out.println("Composite");
                    break;
                case 4:
                    Problem4 pr4 = new Problem4();
                    System.out.println("Input num");
                    n = scanner.nextInt();
                    System.out.println(pr4.factorial(n));
                    break;
                case 5:
                    Problem5 pr5 = new Problem5();
                    System.out.println("Input num");
                    n = scanner.nextInt();
                    System.out.println("Fibonacci Number - " + pr5.fibonacciNum(n));
                    break;
                case 6:
                    Problem6 pr6 = new Problem6();
                    System.out.println("Input num a");
                    int a = scanner.nextInt();
                    System.out.println("Input num n");
                    n = scanner.nextInt();
                    System.out.println(a + " power of " + n + " = " + pr6.pow(a, n));
                    break;
                case 7:
                    Problem7 pr7 = new Problem7();
                    System.out.println("Input len of array");
                    n = scanner.nextInt();
                    System.out.println("Input array by space");
                    arr = new int[n];
                    for(int i = 0; i < n; i++){
                        arr[i] = scanner.nextInt();
                    }
                    arr = pr7.reverse(n, arr);
                    for(int i = 0; i < n;i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Input string");
                    String s = scanner.next();
                    Problem8 pr8 = new Problem8();
                    if(pr8.isNumeric(s))
                        System.out.println("Yes");
                    else
                        System.out.println("No");

            }
        }

    }
}