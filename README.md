# Assignment1 Documentation
## Main.java file
**It's the entry-point  class that connect CLI with modules of solved tasks.**
**Below will be described every function that used to solve problems.**

## Problem 1
**Description**: *Return the minimum value of an array*

**Explanation**: Base case: `n = 0`, then we return the first element of the array
Otherwise, we compare the `arr[n-1]` element with the recursive execution of the function to which `n=n-1` is passed and return lesser

**Solution**:
```java
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
```

## Problem 2
**Description**: *Return average value of array*

**Explanation**: Base case: `n = 0`, then we return `0`
Otherwise, the function calls itself recursively with `n - 1` as the new value of n and multiplies the previous average by `n - 1`.
 It then adds the value of the `n-1` element of the array to this product and divides the result by `n`.

**Solution**:
```java
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
```

## Problem 3
**Description**: *Check a number for a prime*

**Explanation**: If `n` is 1, the function returns `true` since 1 is not considered a prime number. Otherwise, the function loops from 2 to `n / 2` and checks if `n` is divisible by any integer in that range. If n is divisible by any integer in the range, the function returns `false`

**Solution**:
```java
public boolean isPrimeNum(int n){
        if(n == 1)
            return true;
        for(int i = 2; i < n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
        /*
        @ isPrimeNum - finding is it prime number
        @ n - integer number
        @ return - returning is it prime number (true or false)
     */
    }
```
## Problem 4
**Description**: *Return factorial number*

**Explanation**: Base condition: `n = 1` or `n = 0`, then we `return 1`. Otherwise: multiply the current number by the factorial of the number by one less

**Solution**:
```java
public int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
        /*
        @ factorial - finding n! or factorial of n
        @ n - integer number
        @ return - returning factorial of n

     */
    }
```

## Problem 5
**Description**: *Return the number on n-th position of fibonacci sequence*

**Explanation**: Two basic conditions: `n = 0` and `n = 1`, then we return the corresponding values.
Otherwise: the sum of two recursions with arguments `n-1` and `n-2`

**Solution**:
```java
public int fibonacciNum(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        /*
        @ fibonacciNum - finding n-th elements in Fibonacci sequence using recursion
        @ n - index of fibonacci sequence
        @ return - returning n-th element
     */
        }
```

## Problem 6
**Description**: *Return a in power n*

**Explanation**: If `n = 0` then `return 1`. 
Otherwise, the function calls itself recursively with `n - 1` as the new value of `n` and multiplies the previous result by `a`.

**Solution**:
```java
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
```

## Problem 7
**Description**: *Reverse an array*

**Explanation**: `arr.lenght - n` - start element
`n - 1` - end element
`arr.lenght - n` and `n - 1` are symmetrical.
Function swap elements with `arr.lenght - n` and `n - 1` indexs, than call itself with `n - 1`
Function calling itself until `arr.length - n >= n - 1`.

**Solution**:
```java
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
         /*
        @ reverse - finding reverse of int array
        @ arr - an array with int elements
        @ n - length of array
        @ return - returning reverse array
     */
     }
```

## Problem 8
**Description**: *Check is provided string is integer*

**Explanation**: 
Function check first element of `s` 
- if is digit ,then call itself recursively without first element
- else `return false`
Function calling itself until `s` is not empty.

**Solution**:
```java
public boolean isNumeric(String s){
        if(s.length() == 0)
           return true;
        else{
            char chr = s.charAt(0);
            if(Character.isDigit(chr))
                return isNumeric(s.substring(1));
            return false;
        }
        /*
        @ isNumeric - finding minimum num in array
        @ arr - an array with int elements
        @ n - length of array
        @ return - returning min int in array
     */
    }
```

## Problem 9
**Description**: *Return binomial coefficient of `n` and `k` params*

**Explanation**: Base cases: `k=n` or `k=0` we `return 1`;
Otherwise we return sum of functions recoursivly with (`n-1`, `k-1`) and (`n-1`, `k`) params;

**Solution**:
```java
public int binomialCoeff(int k, int n){
        if(k == 0 || k == n)
            return 1;
        else
            return binomialCoeff(k - 1, n - 1) + binomialCoeff(k, n - 1);
        /*
        @ binomialCoeff - finding binomial coefficient by using formula
        @ k - integer number
        @ n - integer number
        @ return - returning min int in array
     */
    }
```

## Problem 10
**Description**: *Return GCD of `a` and `b`*

**Explanation**: For this task I applied Euclidean algorithm
Base: `a % b = 0` we `return b`
Otherwise: function call itself with `(b, a % b)` arguments.

**Solution**:
```java
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
```
