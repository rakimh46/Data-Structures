import java.util.*;

public class pattern_4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();

        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }
            for (int st = 1; st <= star; st++) {
                System.out.print("*	");
            }
            System.out.println();
            star--;
            space++;
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