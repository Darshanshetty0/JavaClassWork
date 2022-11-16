package Event_handling;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PressMe implements ActionListener {

    JButton b1;

    PressMe() {
        JFrame jf = new JFrame("Calculator");
        jf.setVisible(true);
        jf.setSize(300, 300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components are being made

        b1 = new JButton("Press Me");

        // Using the Components

        jf.add(b1);

        // Set x axis, y axis, width, height

        b1.setBounds(80, 100, 100, 20);

        // Step:2-Registering the component with the Listener
        b1.addActionListener(this);// (this->instanceOfListenerclass)

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        System.out.println(s1);

        if (s1.equals("Press Me")) {
            b1.setText("Pressed");
        }
        if (s1.equals("Pressed")) {
            b1.setText("Press Me");
        }
    }

    public static void main(String[] args) {
        new PressMe();
    }
}
