import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        try {
            String url = "jdbc:mysql://localhost/db1";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");

            int input, i;

            do {
                System.out.println("--------------\n");
                System.out.println("1: Display\n");
                System.out.println("2: Insert\n");
                System.out.println("3: Update\n");
                System.out.println("4: Delete\n");
                System.out.println("5: Exit\n");
                System.out.println("--------------\n");

                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("----------Display---------");

                        Statement stmt1 = conn.createStatement();

                        String query1 = "SELECT * from t1";
                        ResultSet rs = stmt1.executeQuery(query1);

                        System.out.println("Display Query executed!");

                        while (rs.next()) {
                            // System.out.println("Username: " + rs.getString("Name"));
                            System.out.println("\nID: " + rs.getInt(1) + "\nName" + rs.getString(2));
                        }

                        break;

                    case 2:
                        System.out.println("------------Insert-----------");
                        String query2 = "insert into t1 values(?,?)";
                        PreparedStatement stmt2 = conn.prepareStatement(query2);
                        stmt2.setInt(1, 003);
                        stmt2.setString(2, "Alex");
                        i = stmt2.executeUpdate();
                        System.out.println(i + " records inserted ");
                        break;

                    case 3:
                        System.out.println("-----------Update------------");
                        String query4 = "update t1 set name=? where id=?";
                        PreparedStatement stmt3 = conn.prepareStatement(query4);
                        stmt3.setString(1, "James");
                        stmt3.setInt(2, 1);
                        stmt3.executeUpdate();
                        i = stmt3.executeUpdate();
                        System.out.println(i + "records updated");
                        break;

                    case 4:
                        System.out.println("---------------Delete-------------");
                        String query3 = "delete from t1 where id = ?";
                        PreparedStatement stmt4 = conn.prepareStatement(query3);
                        System.out.println(" Enter the ID to be deleted    : ");
                        stmt4.setInt(1, sc.nextInt());
                        i = stmt4.executeUpdate();
                        if (i != -1)
                            System.out.println(i + "Record Deleted!");
                        else
                            System.out.println(" Record not Deleted!");
                        break;

                    case 5:
                        System.out.println("-------------Exit-------------");
                        break;

                    default:
                        System.out.println("Enter valid option (1-5)");

                        sc.close();
                }
            } while (input != 5);
            conn.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
