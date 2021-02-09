import java.util.*;

public class pattern_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // write ur code here
        int star = (n / 2) + 1;
        int space = 1;

        for (int r = 0; r < n; r++) {

            //print star
            for (int st = 1; st <= star; st++) {
                System.out.print("*	");
            }
            //print space
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }

            //print star
            for (int st = 1; st <= star; st++) {
                System.out.print("*	");
            }

            System.out.println();

            if (r < n / 2) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }
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
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

*/