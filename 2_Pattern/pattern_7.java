import java.util.*;

public class pattern_7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        
        for(int r=0; r<n;r++){
            for(int c=0; c<=r;c++){
                if(r==c){
                    System.out.println("*	");
                }else{
                    System.out.print("	");
                }
            
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
Output Format
pat71
Constraints
1 <= n <= 100
Sample Input
5
Sample Output
*	
	*	
		*	
			*	
				*	


*/