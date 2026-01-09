package ADMIN;

import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        setContentPane(new Login(this));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


    }
}
