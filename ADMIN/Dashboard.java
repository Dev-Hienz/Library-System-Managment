package ADMIN;

import java.awt.Dimension;
import javax.swing.*;

public class Dashboard extends javax.swing.JPanel {

    private MainFrame frame;

    public Dashboard(MainFrame frame) {
        this.frame = frame;
        panel();
    }
    public void panel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1512, 982));

        JLabel background = new JLabel();
        background.setBounds(0,0, 1512, 982);
        background.setIcon(new ImageIcon("PEKTURS\\Admin_Dashboard.png"));
        background.setLayout(null);

        this.add(background);
    }
}

/*frame.setContentPane(new Dashboard(frame));
frame.revalidate();
frame.pack();   // 👈 MUST ADD THIS when switchingpanel*/