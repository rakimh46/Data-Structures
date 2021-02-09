import java.util.*;

public class pattern_5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1, nsp = n / 2, nst = 1;
        while (row <= n) {
            for (int i = 1; i <= nsp; i++) {
                System.out.print("	");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print("*	");
            }
            System.out.println();

            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            row++;
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
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	

*/