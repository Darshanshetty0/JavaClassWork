package Selection_and_Iteration_Statements;

import java.util.*;

public class neonnumber {
    public static void main(String args[]) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        n = sc.nextInt();

        int square = n * n;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (n == sum) {
            System.out.println(n + " Is a Neon number.");
        } else {
            System.out.println(n + " Is not a Neon Number.");
            sc.close();
        }
    }
}
