import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int ele=scn.nextInt();
        
        cf(arr,ele);
    }
    public static int cf(int[] arr,int ele){
        
        int lo=0,hi=arr.length-1;
        int ceil=Integer.MAX_VALUE,floor=Integer.MIN_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==ele){
                ceil=ele;
                floor=ele;
                break;
            }
            else if(ele<arr[mid]){
                ceil=arr[mid];
                hi=mid-1;
            }else{
                floor=arr[mid];
                lo=mid+1;
            }
        }
    System.out.println(ceil+"\n"+floor);
     return 0;         
    }

}