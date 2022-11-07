//interface
interface One {
    public static final double pi = 3.14;
}

interface Two {
    public static final double radius = 3.14;
}

interface Three {
    double area();
}

class Circle implements One, Two, Three {
    public double area() {
        return (pi * radius * radius);
    }
}

public class MultipleInterface {
    public static void main(String args[]) {
        Circle cl = new Circle();
        System.out.println("Circle Area is " + cl.area());
    }
}