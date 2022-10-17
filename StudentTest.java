class Person {
    String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Student1 extends Person {
    String dept;
    int id;

    public Student1(String name, String address, String dept, int id) {
        super(name, address);
        this.dept = dept;
        this.id = id;
    }

    public void DisplayDetails() {
        System.out.println("\n\nStudent Particulars:");
        System.out.println(super.name + " " + super.address + " " + dept + " ");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Alex ", "Bengaluru ", "CSE ", 001);
        s1.DisplayDetails();
    }
}