import java.util.*;

public class pattern_19 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n=scn.nextInt();
        
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r==1){
                    //group A
                    if( (c>=1 && c<=(n/2)+1) || ( c == n )){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(r>1 && r<(n/2)+1){
                    //group B
                    if( c==(n/2)+1  || c == n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(r==(n/2)+1){
                    //group C
                    System.out.print("*\t");
                }else if(r>n/2 && r<n){
                    //group D
                    if( c==1  || c == (n/2)+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else{
                    //group E
                    if( c==1  || (c >= (n/2)+1)){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
        }
        System.out.println();
       }
    }
}



/*

Question
1. You are given a number n.
2. You've to write code to print the pattern given in output format below
                                            
Input Format
A number n

Constraints
1 <= n <= 10
 Also, n is odd.

Sample Input
3

Sample Output
*	*	*	
*	*	*	
*	*	*	

Sample Input
5

Sample Output

*  *  *     *
      *     *
*  *  *  *  *
*     *
*     *  *  * 

*/