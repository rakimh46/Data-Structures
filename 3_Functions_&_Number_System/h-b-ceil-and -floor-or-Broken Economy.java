import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ele = scn.nextInt();

        cf(arr, ele);
    }
    public static int cf(int[] arr, int data) {
        
        int ceil=Integer.MAX_VALUE;
        int floor=Integer.MIN_VALUE;
        
        for(int val:arr){
            if(val>data){
                // larger : ceil
                if(val<ceil){
                    //minimum among larger
                    ceil=val;
                }
            }else if(val<data){
                // smaller : floor
                if(val>floor){
                    //maximum among larger
                    floor=val;
                }
            }else{
                //val==data
                ceil=floor=data;
                break;
            }
        }
        System.out.println(ceil+"\n"+floor);
        return 0;
    }



}