package ADMIN;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Available_Books extends javax.swing.JPanel{
    private MainFrame frame;
    public Available_Books(MainFrame frame){
        this.frame = frame;
        panel();
    }
    public void panel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1512, 982));

        JLabel background = new JLabel();
        background.setBounds(0,0,1512,982);
        background.setIcon(new ImageIcon("PEKTURS/Book Management (Available)1.png"));
        background.setLayout(null);

        

        JButton back_to_book_management = new JButton();
        back_to_book_management.setBounds(118, 384, 210, 27);
        back_to_book_management.setOpaque(false);
        back_to_book_management.setContentAreaFilled(false);
        back_to_book_management.setBorderPainted(false);
        back_to_book_management.setFocusPainted(false);

        back_to_book_management.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("switching to Book Managemnent");
                frame.setContentPane(new BookManagement(frame));
                frame.revalidate();
                frame.pack();
            }
        });
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
        background.add(back_to_book_management);
        frame.add(background);
        this.add(background);

    }
    
}
