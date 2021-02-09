import java.util.*;
public class pattern_13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int x=scn.nextInt();
        
        for(int n=0; n<x; n++){
           int ncr=1;
            for(int r=0; r<=n; r++){
                System.out.print(ncr+"	");
                ncr=ncr * (n-r) / (r+1);
                // ncr = (ncr * (n - r)) / (r + 1); 
            }           
        System.out.println();  
        }
  }
}

/*

Question
1. You are given a number n.
2. You've to create a pattern as shown in output format
                                                                
Input Format
A number n

Constraints
1 <= n <= 10

Sample Input
5

Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1

*/