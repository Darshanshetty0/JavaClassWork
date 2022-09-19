import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("message");

        // input dialog returns a string
        int a = Integer.parseInt(str1);
        JOptionPane.showMessageDialog(null, "The Product is " + a * a);
    }
}
