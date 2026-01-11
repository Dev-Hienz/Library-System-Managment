package ADMIN;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        background.setIcon(new ImageIcon("PEKTURS/Dashboard.png"));
        background.setLayout(null);

        JButton Book_Management = new JButton();
        Book_Management.setBounds(118, 384, 210, 27);
        Book_Management.setOpaque(false);
        Book_Management.setContentAreaFilled(false);
        Book_Management.setBorderPainted(false);
        Book_Management.setFocusPainted(false);

        Book_Management.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to Book Management");
                frame.setContentPane(new BookManagement(frame));
                frame.revalidate();
                frame.pack();
            }
        });

        

        this.add(background);
        background.add(Book_Management);

    }
}

/*frame.setContentPane(new Dashboard(frame));
frame.revalidate();
frame.pack();   // 👈 MUST ADD THIS when switchingpanel*/