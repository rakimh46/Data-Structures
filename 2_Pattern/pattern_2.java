import java.util.*;

public class pattern_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int star = n;
        for (int i = n; i>=1; i--) {
            for (int st = star; st >= 1; st--) {
                System.out.print("*	");
            }
            System.out.println();
            star--;
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
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*

*/



