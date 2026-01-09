package ADMIN;

import java.awt.*;
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
        background.setLayout(null);

       background.setLayout(null);

    JLabel text = new JLabel("Book management 'to, 'wag magulo");
    text.setBounds(400, 491, 1000, 100);
    text.setFont(new Font("Arial", Font.BOLD, 50));
    text.setForeground(Color.BLACK);



        background.add(text); 
        frame.add(background);
        this.add(background);

    }
}