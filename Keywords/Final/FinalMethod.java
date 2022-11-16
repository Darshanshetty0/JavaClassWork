package Keywords.Final;

class Parent {
    final void display() {
        System.out.println("This is Parent Class");
    }
}

class Child extends Parent {
    // void display() { // Not Possible to define again display()
    // System.out.println("This is Child Class");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();
        Child c1 = new Child();
        c1.display();
    }
}
