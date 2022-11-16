package Inheritance_and_Interfaces;

interface i1 {
    double getPerimeter();
}

class Rectangle implements i1 {
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle implements i1 {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getPerimeter() {
        return 2 * (3.14 * radius);
    }
}

public class PerimeterMain {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("Perimeter: " + r1.getPerimeter());
        Circle c1 = new Circle(15);
        System.out.println("Circle: " + c1.getPerimeter());
    }
}