import java.util.*;

public class pattern_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row=1,nsp=n/2,nst=1;
        while(row<=n){

            for(int i=1; i<=nsp; i++){
                if(row==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            
            for(int i=1; i<=nst;i++){
                System.out.print("*\t");
            }
            System.out.println();
            
            if(row<=n/2){
                nst++;
            }else{
                nst--;
            }        
            row++;
        }
    }    
}

/*

Question
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Input Format
A number n

Constraints
1 <= n <= 10
 Also, n is odd.

Sample Input
5

Sample Output
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	

*/