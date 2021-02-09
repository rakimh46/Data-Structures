import java.util.*;

public class pattern_10_b {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        int n = scn.nextInt();
        
        n--;
        // using equation of line 
        for(int r=0; r<=n;r++){
            for(int c=0;c<=n;c++){
                if(r + c == n / 2){
                    System.out.print("*	");
                }else if(r + c == (n + n / 2)){
                    System.out.print("*	");
                }else if(c-r==n/2){
                    System.out.print("*	");
                }else if(r-c==n/2){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }

    }

}

/*

Question
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 100
 Also, n is odd.

Sample Input
5

Sample Output
		*	
	*		*	
*				*	
	*		*	
		*	

*/