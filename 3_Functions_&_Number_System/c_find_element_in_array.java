import java.io.*;
import java.util.*;

public class c_find_element_in_array{

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        System.out.println(element(arr, d));

    }
    
    // 1nd method

    public static int element(int arr[], int d) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    /* 2nd method

    public static void element(int arr[], int d) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                found = true;
                System.out.println(i);
                break;
            }
        }
        if (found == false) {
            System.out.println(-1);
        }
    }
    */

}

/*

Question
1.You are given a number n, representing the size of array a.
2.You are given n numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing index at which d is found in array a and -1 if not found
Constraints
1 <= n <= 10^7
-10^9 <= n1, n2 
.. n elements <= 10^9
-10^9 <= d <= 10^9
Sample Input
6
15
30
40
4
11
9
40
Sample Output
2

*/