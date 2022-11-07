//static
public class PublicStatic {
    static int x = 10;
    static int y;

    static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + x);
        System.out.println("z = " + x);
    }

    static {
        System.out.println("Running static initiallization block.");
        y = x + 5;
    }

    public static void main(String args[]) {
        func(7);
    }
}
