//4A

package Inheritance_and_Interfaces;

class Person {
    String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Student extends Person {
    String dept;
    int id;

    public Student(String name, String address, String dept, int id) {
        super(name, address);
        this.dept = dept;
        this.id = id;
    }
}

class InternEmployee extends Student {
    String company;

    public InternEmployee(String name, String address, String dept, int id, String company) {
        super(name, address, dept, id);
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("\n\n InternEmployee Particulars:");
        System.out.println("Name : " + name + "\nAddress : " + address + "\nDept : " + dept + "\nID: " + id
                + "\nCompany : " + company);
    }
}

public class InternEmployeeDetails {
    public static void main(String[] args) {
        InternEmployee e1 = new InternEmployee("Alex", "Bengaluru", "CSE", 001, "Think&Ink");
        e1.displayDetails();
    }
}