//3B

package Constructors_and_Methods;

class Shape {
    double dimension;

    Shape(double dimension) {
        this.dimension = dimension;
    }
}

class Circle extends Shape {
    double area, circum;

    Circle(double d) {
        super(d);
    }

    void area1() {
        // area=Math.PI*dimension*dimension;
        area = 3.14 * dimension * dimension;
        System.out.println("Area of the Circle " + area);
    }

    void circum1() {
        circum = 2 * 3.14 * dimension;
        System.out.println("Circumference of the Circle " + circum);
    }
}

class Square extends Shape {
    double area, lengthDiagonal;

    Square(double d) {
        super(d);
    }

    void area1() {
        // area=Math.PI*dimension*dimension;
        area = dimension * dimension;
        System.out.println("Area of the Square " + area);
    }

    void lengthDiagonal() {
        // lengthDiagonal1=Math.sqrt(2)*dimension;
        lengthDiagonal = 1.414 * dimension;
        System.out.println("Length of Diagonal " + lengthDiagonal);
    }
}

class Sphere extends Shape {
    double volume, surfaceArea;

    Sphere(double d) {
        super(d);
    }

    void volume1() {
        // volume=(4/3)*(3.14) *Math.pow(dimension,3);
        volume = (4 / 3) * (3.14) * dimension * dimension * dimension;
        System.out.println("Area of the Square " + volume);
    }

    void surfaceArea1() {
        // lengthDiagonal1=Math.sqrt(2)*dimension;
        surfaceArea = 4 * 3.14 * dimension * dimension;
        System.out.println("Length of Diagonal " + surfaceArea);
    }

}

public class Calculate {
    public static void main(String[] args) {
        Circle ob1 = new Circle(3);
        ob1.area1();
        ob1.circum1();
        Square ob2 = new Square(5);
        ob2.area1();
        ob2.lengthDiagonal();
        Sphere ob3 = new Sphere(7);
        ob3.volume1();
        ob3.surfaceArea1();
    }
}
