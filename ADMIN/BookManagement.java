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
        background.setIcon(new ImageIcon("PEKTURS/Book Management (ADMIN)1-4.png"));
        background.setLayout(null);

       background.setLayout(null);

   
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

        JButton availableBook = new JButton();
        availableBook.setBounds(145, 437, 170, 24);
        availableBook.setOpaque(false);
        availableBook.setContentAreaFilled(false);
        availableBook.setBorderPainted(false);
        availableBook.setFocusPainted(false);

        availableBook.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to Avaialble Books");
                frame.setContentPane(new Available_Books(frame));
                frame.revalidate();
                frame.pack();
            }
        });

        JButton borrowed = new JButton();
        borrowed.setBounds(132, 475, 170, 24);
        borrowed.setOpaque(false);
        borrowed.setContentAreaFilled(false);
        borrowed.setBorderPainted(false);
        borrowed.setFocusPainted(false);

        borrowed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to borrowed Books");
                frame.setContentPane(new Borrowed_Books(frame));
                frame.revalidate();
                frame.pack();
            }
        });

        JButton pending = new JButton();
        pending.setBounds(145, 437, 170, 24);
        pending.setOpaque(false);
        pending.setContentAreaFilled(false);
        pending.setBorderPainted(false);
        pending.setFocusPainted(false);

        pending.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to pending Books");
                frame.setContentPane(new Pending_Books(frame));
                frame.revalidate();
                frame.pack();
            }
        });
        
        background.add(availableBook);
        background.add(Back_to_dashboard);
        background.add(borrowed);
        background.add(pending);
        frame.add(background);
        this.add(background);

    }
}