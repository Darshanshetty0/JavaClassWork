//4B

package Inheritance_and_Interfaces;

interface One

{

    public static final double pi = 3.14;

}

interface Two {

    public static final double radius = 10.0;

}

interface Three {

    double area();

}

class Circle implements One, Two, Three {

    public double area() {

        return (pi * radius * radius);
    }
}

public class InterfaceDemo {
    public static void main(String args[]) {
        Circle c1 = new Circle();

        System.out.println("Circle Area is " + c1.area());
    }
}