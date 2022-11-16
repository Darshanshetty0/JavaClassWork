package Exception_Handling;

public class Predefined_Exception_Eg {
    public static void main(String argv[]) {
        int a = 10, b = 5, c = 5, x, y;
        try {
            x = a / (b - c);
            System.out.println("x=" + x);

        } catch (Exception e) {
            System.out.println("DIVISION BY ZERO\n" + e);
        }
        y = a / (b + c);
        System.out.println("y=" + y);
    }
}
