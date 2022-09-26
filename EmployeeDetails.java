class EmployeeDetail {
    int id;
    String name;
    int salary;

    void setId(int i) {
        id = i;
    }

    void setName(String n) {
        name = n;
    }

    void setSalary(int s) {
        salary = 5;
    }

    void getEmployDetails() {
        System.out.println(name + "'s salary is " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String args[]) {
        EmployeeDetail E = new EmployeeDetail();
        E.setId(65);
        E.setName("Darshan");
        E.setSalary(400000);
        E.getEmployDetails();
    }
}