import java.io.*;
import java.util.*;

public class d_reverse_an_array {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] arr) {
        // write your code here
        // int arr=new int[a.length];
       int lo=0, hi=arr.length-1;
       while(lo<hi){
           int temp=arr[lo];
           arr[lo]=arr[hi];
           arr[hi]=temp;
           lo++;
           hi--;
       }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}

/*

Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
0 <= n < 10^4
-10^9 <= a[i] <= 10^9
Sample Input
5
1
2
3
4
5
Sample Output
5 4 3 2 1

*/