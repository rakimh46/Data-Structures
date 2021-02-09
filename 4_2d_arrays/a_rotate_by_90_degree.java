import java.io.*;
import java.util.*;

public class a_rotate_by_90_degree {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        transpose(arr);
        reverse(arr);
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void transpose(int[][] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public static void reverse(int[][] arr){
        int n=arr.length;
        for(int r=0; r<n; r++){
            int lo=0,hi=n-1;
            while(lo<hi){
                int temp=arr[r][lo];
                arr[r][lo]=arr[r][hi];
                arr[r][hi]=temp;
                lo++;
                hi--;
            }
        }
        
    }
}