import java.util.Scanner;

public class scannerclassinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Emp ID");
        int id = sc.nextInt();

        System.out.println("Enter Emp Name");
        String name = sc.next();

        System.out.println("Enter Emp Salary");
        float sal = sc.nextFloat();

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + sal);

        sc.close();
    }
}
