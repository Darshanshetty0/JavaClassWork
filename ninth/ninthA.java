package ninth;

import javax.swing.JFrame;//Swing Components Class included
import javax.swing.JButton;
import java.awt.event.ActionListener; //EventHandler interface & class
import java.awt.event.ActionEvent;

class SwingEvent1 implements ActionListener {
    // JComponents declared
    JButton b1;

    SwingEvent1() {
        JFrame jf = new JFrame("Arithmetic Calculator");
        jf.setVisible(true); // making the frame visible
        jf.setSize(300, 300); // 300 width and 300 height
        jf.setLayout(null); // using no layout managers
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JComponents created
        b1 = new JButton("Register");
        // adding components created in JFrame jf.add(l1);
        jf.add(b1);
        // x axis, y axis, width, height
        b1.setBounds(50, 150, 200, 20);
        // Step:2-Registering the component with the Listener
        b1.addActionListener(this);// (this->instanceOfListenerclass)
    }

    // Step:3-Overridding the actionPerformed() method
    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        System.out.println(s1);
        if (s1.equals("Register")) {
            b1.setText("Registered!");
        }
    }
}

public class ninthA {
    public static void main(String[] args) {
        new SwingEvent1();
    }
}