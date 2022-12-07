package ninth;

import javax.swing.JFrame;//Swing Components Class included
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener; //EventHandler interface & class
import java.awt.event.ActionEvent;

//Step:1-Implementing the ActionListener interface in the class
class ninthCa implements ActionListener {
    JLabel l1; // JComponents declared
    JButton b1, b2;

    ninthCa() {
        JFrame jf = new JFrame("Button Based Selection");
        jf.setVisible(true); // making the frame visible
        jf.setSize(300, 300); // 300 width and 300 height
        jf.setLayout(null); // using no layout managers
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("Alpha"); // JComponents created
        b2 = new JButton("Beta");
        l1 = new JLabel();
        l1.setForeground(Color.GREEN);
        jf.add(b1); // adding components created in JFrame
        jf.add(b2);
        jf.add(l1);
        b1.setBounds(50, 80, 100, 20); // x axis, y axis, width, height
        b2.setBounds(150, 80, 100, 20);
        l1.setBounds(70, 120, 100, 20);
        // Step:2-Registering the component with the Listener
        b1.addActionListener(this);// (this->instanceOfListenerclass)
        b2.addActionListener(this);
    }

    // Step:3-Overridding the actionPerformed() method
    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        System.out.println(s1);
        if (s1.equals("Alpha")) {
            l1.setText("Alpha is Selected");
        }
        if (s1.equals("Beta")) {
            l1.setText("Beta is Selected");

        }

    }
}

public class ninthC {
    public static void main(String[] args) {
        new ninthCa();
    }
}
