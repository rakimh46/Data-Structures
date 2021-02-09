import java.util.*;
public class pattern_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if(c==1 || c==n){
                    System.out.print("*	");
                }else if (r > n/2 && (r == c || r + c == n + 1)) {
                    System.out.print("*	");
                } else {
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
2. You've to write code to print the pattern given in output format below.

Input Format
A number n

Constraints
1 <= n <= 10
 Also, n is odd.

Sample Input
5

Sample Output
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	

*/