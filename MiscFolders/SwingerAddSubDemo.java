package MiscFolders;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingerAddSubDemo implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2;

    SwingerAddSubDemo() {
        JFrame jf = new JFrame("Calculator");
        jf.setVisible(true);
        jf.setSize(300, 300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components are being made
        l1 = new JLabel("Addition/Subtraction on 2 Numbers");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("=");

        // Using the Components
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        jf.add(t1);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);

        // Set x axis, y axis, width, height
        l1.setBounds(50, 50, 200, 20);
        l2.setBounds(50, 80, 100, 20);
        t1.setBounds(150, 80, 100, 20);
        l3.setBounds(50, 130, 100, 20);
        t2.setBounds(150, 130, 100, 20);
        b1.setBounds(80, 180, 100, 20);
        b2.setBounds(80, 210, 100, 20);
        l4.setBounds(50, 240, 100, 20);

        // Step:2-Registering the component with the Listener
        b1.addActionListener(this);// (this->instanceOfListenerclass)
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        System.out.println(s1);

        if (s1.equals("+")) {
            String x = t1.getText();
            String y = t2.getText();
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            int sum = a + b;
            l4.setText("Result is: " + sum);
        }
        if (s1.equals("sub")) {
            String x = t1.getText();
            String y = t2.getText();
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            int sub = a - b;
            l4.setText("Result is: " + sub);
        }
    }

    public static void main(String[] args) {
        new SwingerAddSubDemo();
    }
}
