import java.io.*;
import java.util.*;
public class b_span_of_array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        span(arr);
    }
    
    public static void span(int arr[]){
        //sapan of the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    
        /* firatmethod
        for (int i = 0; i < arr.length; i++) {
            // arr[i]=scn.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        */
        
        // 2nd method  
        for(int val : arr){
            max=Math.max(max,val);
            min=Math.min(min,val);
        }
        
        System.out.println(max - min);
    }
}


/*

Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min
Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9
Sample Input
6
15
30
40
4
11
9
Sample Output
36

*/