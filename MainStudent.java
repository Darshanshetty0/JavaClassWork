<<<<<<< HEAD
//multiple inheritance
=======
>>>>>>> fbd98ecb0c4fc2c5cd8d47a222d954ee253bd1ef
class Student {
    String name, dept;
    int id;
    double marks;

    Student() {
        name = "Alex";
        id = 1;
        dept = "CSE";
        marks = 60;
    }

    Student(String n, int i, String d, double m) {
        name = n;
        id = i;
        dept = d;
        marks = m;
    }

    Student(Student st) {
        name = st.name;
        id = st.id;
        dept = st.dept;
        marks = st.marks;
    }

    void display() {
        System.out.println("Name: " + name + "\nId: " + id + "\nDept:" + dept + "\nMarks: " + marks + "\n\n\n");
    }
}

public class MainStudent {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("James", 2, "CSE", 70);
        s2.display();
        Student s3 = new Student(s2);
        s3.display();

    }
}
