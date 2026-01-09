package ADMIN;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BookManagement extends javax.swing.JPanel {

    private MainFrame frame;

    public BookManagement(MainFrame frame) {
        this.frame = frame;
        panel();

    }
    public void panel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1512, 982));

        JLabel background = new JLabel();
        background.setBounds(0, 0, 1512, 982);
        background.setIcon(new ImageIcon("PEKTURS/Book Management.png"));
        background.setLayout(null);

       background.setLayout(null);

    JLabel text = new JLabel("Book management 'to, 'wag magulo");
    text.setBounds(400, 491, 1000, 100);
    text.setFont(new Font("Arial", Font.BOLD, 50));
    text.setForeground(Color.BLACK);



    JButton Back_to_dashboard = new JButton();
        Back_to_dashboard.setBounds(40, 284, 343, 68);
        Back_to_dashboard.setOpaque(false);
        Back_to_dashboard.setContentAreaFilled(false);
        Back_to_dashboard.setBorderPainted(false);
        Back_to_dashboard.setFocusPainted(false);

        Back_to_dashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to DashBoard");
                frame.setContentPane(new Dashboard(frame));
                frame.revalidate();
                frame.pack();
            }
        });




        background.add(Back_to_dashboard);
        background.add(text); 
        frame.add(background);
        this.add(background);

    }
}