package Selection_and_Iteration_Statements;

// lab program 1
import java.util.Scanner;

class largestamong3 {
    public static void main(String[] args) {
        int a, b, c, largest, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number.");
        a = sc.nextInt();

        System.out.println("Enter the second number:");
        b = sc.nextInt();

        System.out.println("Enter the third number:");
        c = sc.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println("Entered numbers are equal.");
        } else {
            temp = a > b ? a : b;

            largest = c > temp ? c : temp;

            System.out.println("The largest number is: " + largest);
            sc.close();
        }

        if ((a >= 0) && (b >= 0) && (c >= 0)) {
            System.out.println("Entered numbers are all positive.");
        } else if ((a < 0) && (b < 0) && (c < 0)) {
            System.out.println("Entered numbers are all negative numbers.");
        } else {
            System.out.println("Entered numbers are mixed numbers.");
        }
    }
}
