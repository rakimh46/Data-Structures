import java.util.*;

public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();

        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");

            }
            System.out.println("");
            space--;
            star++;
        }

    }
}