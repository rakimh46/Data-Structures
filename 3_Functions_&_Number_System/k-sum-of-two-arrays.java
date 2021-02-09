import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        
        int arr1[] = new int[n1];
        
        for(int idx = 0 ; idx < n1 ;idx++){
            arr1[idx] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        
        int arr2[] = new int[n2];
        
        for(int idx = 0 ; idx < n2 ;idx++){
            arr2[idx] = scn.nextInt();
        }
        
        int res[] = sum(arr1,arr2);
        
        for(int val : res){
            System.out.println(val);
        }
    }
    
    
    public static int[] sum(int arr1[],int arr2[]){
        int n1 =arr1.length, n2 =arr2.length, n3  = Math.max(n1,n2);
        int res[] = new int[n3];
        int i=n1-1, j=n2-1, k=n3-1;
        int carry=0;
        while(i>=0 || j>=0){
            int v1= (i>=0) ? arr1[i] : 0;
            int v2= (j>=0) ? arr2[j] : 0;
            
            int sum = v1+v2+carry;
            
            int digit =sum%10;
            carry = sum/10;
            
            res[k] =digit;
            
            i--;
            j--;
            k--;
            
        }
        if(carry == 0){
            return res;
        }else{
            int nres[]= new int[res.length+1];
            nres[0]=carry;
            
            for(int idx =1; idx<nres.length; idx++){
                nres[idx]= res[idx-1];
            }
            return nres;
        }
    }

}