import java.util.*;

public class pattern_12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int a=0;
        int b=1;
        for(int r=0; r<n; r++){
            for(int c=0;c<=r;c++){
                System.out.print(a+"	");
                int temp=a+b;
                a=b;
                b=temp;
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
1 <= n <= 5

Sample Input
5

Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377

*/