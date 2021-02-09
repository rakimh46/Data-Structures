import java.util.*;

public class pattern_11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int var=1;
        for(int r=0; r<n; r++){
            for(int c=0; c<=r;c++){
                System.out.print(var+"	");
            var++;
                
            }
            System.out.println();
        }

    }
}


/*

Question
1. You are given a number n.
2. You've to create a pattern as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 44

Sample Input
5

Sample Output
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15

*/