import java.util.*;

public class pattern_1_b {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here;
        int n = scn.nextInt();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r>=c) {
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
2. You've to create a pattern of * and separated by tab as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 100

Sample Input
5

Sample Output
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*

*/




