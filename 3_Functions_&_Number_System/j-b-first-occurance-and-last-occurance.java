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
        int x = scn.nextInt();

        System.out.println(firstidx(arr, x));
        System.out.println(lastidx(arr, x));
    }
    
    
    public static int firstidx(int[] arr, int x) {
        int lo=0,hi=arr.length-1,fi=-1;
        
        while(lo <=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]==x){
                fi=mid;
                hi=mid-1;
            }else if(x>arr[mid]){
                //larger
                lo=mid+1;
            }else if(x<arr[mid]){
                //smaller
                hi=mid-1;
            }
            
        }
        return fi;
    }
    
    public static int lastidx(int[] arr, int x) {
        int lo=0,hi=arr.length-1,li=-1;
        
        while(lo <=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]==x){
                li=mid;
                lo=mid+1;
            }else if(x>arr[mid]){
                //larger
                lo=mid+1;
            }else if(x<arr[mid]){
                //smaller
                hi=mid-1;
            }
            
        }
        return li;
    }

}