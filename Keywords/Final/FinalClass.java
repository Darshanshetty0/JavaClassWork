package Keywords.Final;

final class Parent {
    void display() {
        System.out.println("This is Parent Class");
    }
}

// class Child extends Parent { // Not Possible
// void display() {
// System.out.println("This is Child Class");
// }
// }

public class FinalClass {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();
        // Child c1 = new Child();
        // c1.display();
    }
}