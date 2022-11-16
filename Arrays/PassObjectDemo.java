package Arrays;

class Student {
    String degree;

    public Student(String str1) {
        degree = str1;
    }

    public String getDegree() {
        return degree;
    }

    public void set(String str2) {
        degree = str2;
    }
}

public class PassObjectDemo {
    public static void main(String[] args) {
        // Create a Student object.
        Student s1 = new Student("UG");
        // Display the object's contents.
        System.out.println("Degree : " + s1.getDegree());
        // Pass the object to the ChangeStudent method.
        changeStudent(s1);
        // Display the object's contents again.
        System.out.println("Degree : " + s1.getDegree());
    }

    public static void changeStudent(Student s1) {
        s1.set("PG");
    }
}