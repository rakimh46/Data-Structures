import java.util.*;

public class 7-find-element-in-binary-array {

    public static void main(String[] args) {

        // write your code here.
        int arr[]={8,46,24,32,49,67,70,78,90};
        int ele=7;
        boolean found=false;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            if(arr[mid]==ele){
                System.out.print(mid);
                found=true;
                break;
            }else if(ele>arr[mid]){
                lo=mid+1;
            }else if(ele<arr[mid]){
                hi=mid-1;
            }
        }
        
        if(found==false){
            System.out.print(-1);
        }

    }
}