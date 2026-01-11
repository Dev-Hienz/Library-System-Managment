package ADMIN;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register extends javax.swing.JPanel {

    private MainFrame frame;

    public Register(MainFrame frame) {
        this.frame = frame;

        panel();

    }
    public void panel(){

        this.setLayout(null);
        this.setPreferredSize(new Dimension(1512, 982));
    
        JLabel bg = new JLabel();
        bg.setBounds(0, 0, 1512, 982);
        bg.setIcon(new ImageIcon("PEKTURS\\REGISTER PAGE .png"));
        bg.setLayout(null);

        JLabel bg1 = new JLabel();
        bg1.setBounds(845, 150, 600, 600);
        bg1.setIcon(new ImageIcon("PEKTURS\\registration.gif"));
        bg1.setLayout(null);

        JButton btnBack = new JButton();
        btnBack.setForeground(Color.BLACK);
        btnBack.setBounds(412,823,84,17);
        btnBack.setOpaque(false);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new Login(frame));
                frame.revalidate();
            }
        });

        String firstname_Placeholder = "First name"; //fristname =========================================

        JTextField firstname = new JTextField(firstname_Placeholder);                                              
        firstname.setBounds(183, 283, 380, 50);
        firstname.setBackground(new Color(0xF5F6FA));
        firstname.setBorder(null);
        firstname.setFont(new Font("sanchez", Font.PLAIN, 20));
        firstname.setForeground(Color.GRAY);

        firstname.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstname.getText().equals(firstname_Placeholder)){
                    firstname.setText("");
                    firstname.setForeground(Color.BLACK);
                    }
                }
            public void focusLost(FocusEvent e) { 
            if (firstname.getText().isEmpty()){
                firstname.setText(firstname_Placeholder);
                firstname.setForeground(Color.gray);
                    }
                }
        });

        String lastname_Placeholder = "Last name"; //lastname============================================

        JTextField lastname = new JTextField(lastname_Placeholder);                                              
        lastname.setBounds(183, 354, 380, 50);
        lastname.setBackground(new Color(0xF5F6FA));
        lastname.setBorder(null);
        lastname.setFont(new Font("sanchez", Font.PLAIN, 20));
        lastname.setForeground(Color.GRAY);

        lastname.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(lastname.getText().equals(lastname_Placeholder)){
                    lastname.setText("");
                    lastname.setForeground(Color.BLACK);
                    }
                }
        
            public void focusLost(FocusEvent e) { 
            if (lastname.getText().isEmpty()){
                lastname.setText(lastname_Placeholder);
                lastname.setForeground(Color.gray);
                    }
                }
        });

        String email_Placeholder = "Enter Email"; //Email =============================================
        
        JTextField mail = new JTextField(email_Placeholder); 
        mail.setBounds(183, 424, 380, 50);
        mail.setBackground(new Color(0xF5F6FA));
        mail.setBorder(null);
        mail.setFont(new Font("sanchez", Font.PLAIN, 20));
        mail.setForeground(Color.GRAY);
        
        mail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(mail.getText().equals(email_Placeholder)){
                mail.setText("");
                mail.setForeground(Color.BLACK);
                }
            }
        
                public void focusLost(FocusEvent e) {
                if (mail.getText().isEmpty()) {
                    mail.setText(email_Placeholder);
                    mail.setForeground(Color.GRAY);
                }
            }
        });

        String id_Placeholder = "Enter Student ID No."; // student ID ================================
        
        JTextField Stduent_ID = new JTextField(id_Placeholder); 
        Stduent_ID.setBounds(183, 494, 380, 50);
        Stduent_ID.setBackground(new Color(0xF5F6FA));
        Stduent_ID.setBorder(null);
        Stduent_ID.setFont(new Font("sanchez", Font.PLAIN, 20));
        Stduent_ID.setForeground(Color.GRAY);
        
        Stduent_ID.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(Stduent_ID.getText().equals(id_Placeholder)){
                Stduent_ID.setText("");
                Stduent_ID.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (Stduent_ID.getText().isEmpty()) {
                    Stduent_ID.setText(id_Placeholder);
                    Stduent_ID.setForeground(Color.GRAY);
                }
            }
        });

        String password_Placeholder = "Enter Password"; // Password field ================================
        
        JPasswordField password = new JPasswordField(password_Placeholder); 
        password.setBounds(183, 564, 380, 50);                                                               
        password.setBackground(new Color(0xF5F6FA));
        password.setBorder(null);
        password.setFont(new Font("sanchez", Font.PLAIN, 20));
        password.setForeground(Color.GRAY); 
        password.setEchoChar((char) 0);

        password.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(password.getText().equals(password_Placeholder)){
                password.setText("");
                password.setForeground(Color.BLACK);
                password.setEchoChar('•');
                    }
                }
        
            public void focusLost(FocusEvent e) {
                if (password.getPassword().length == 0) {
                    password.setText(password_Placeholder);
                    password.setForeground(Color.GRAY);
                    password.setEchoChar((char) (0)); 
                }
            }
        });

        String ConfirmPass_Placehodler = "Enter Confirm Password"; //Conform password =========                                              
        JPasswordField confimrPass = new JPasswordField(ConfirmPass_Placehodler);   
        confimrPass.setBounds(183, 633, 380, 50);
        confimrPass.setBackground(new Color(0xF5F6FA));
        confimrPass.setBorder(null);
        confimrPass.setFont(new Font("sanchez", Font.PLAIN, 20));
        confimrPass.setForeground(Color.GRAY);
        confimrPass.setEchoChar((char) 0);

        confimrPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(confimrPass.getText().equals(ConfirmPass_Placehodler)){
                confimrPass.setText("");
                confimrPass.setForeground(Color.BLACK);
                confimrPass.setEchoChar('•');
                }
            }
            public void focusLost(FocusEvent e) {
                if (confimrPass.getPassword().length == 0) {
                    confimrPass.setText(ConfirmPass_Placehodler);
                    confimrPass.setForeground(Color.GRAY);
                    confimrPass.setEchoChar((char)(0));
                    
                }
            }
        });

        JButton clearButton = new JButton();
        clearButton.setBounds(168, 733, 193, 62);
        clearButton.setOpaque(false);
        clearButton.setContentAreaFilled(false);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstname.setText(firstname_Placeholder);
                firstname.setForeground(Color.GRAY);
                lastname.setText(lastname_Placeholder);
                lastname.setForeground(Color.GRAY);
                mail.setText(email_Placeholder);
                mail.setForeground(Color.GRAY);
                Stduent_ID.setText(id_Placeholder);
                Stduent_ID.setForeground(Color.GRAY);
                password.setText(password_Placeholder);
                password.setEchoChar((char) (0));
                password.setForeground(Color.GRAY);
                confimrPass.setText(ConfirmPass_Placehodler);
                confimrPass.setEchoChar((char)(0));
                confimrPass.setForeground(Color.GRAY);
            }
        });
       
        JButton CreateButton = new JButton();
        CreateButton.setBounds(385, 733, 193, 63);
        CreateButton.setOpaque(false);
        CreateButton.setContentAreaFilled(false);
        CreateButton.setBorderPainted(false);
        CreateButton.setFocusPainted(false);
        CreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                  if (
                        firstname.getText().trim().isEmpty()                     ||
                        firstname.getText().equals(firstname_Placeholder)         ||
                        lastname.getText().trim().isEmpty() ||
                        lastname.getText().equals(lastname_Placeholder)||
                        mail.getText().trim().isEmpty()                         ||
                        mail.getText().equals(email_Placeholder)                ||
                        Stduent_ID.getText().trim().isEmpty()                   ||
                        Stduent_ID.getText().equals(id_Placeholder)             ||

                        new String(password.getPassword()).equals(password_Placeholder)||
                        password.getPassword().length == 0                      ||

                        new String (confimrPass.getPassword()).equals(ConfirmPass_Placehodler) ||
                        confimrPass.getPassword().length == 0) {

                            JOptionPane.showMessageDialog(frame,  
                            "Please fill out all required fields.",
                            "INPUT ERROR",
                            JOptionPane.ERROR_MESSAGE
                        );
                                return;
                            } 

                        String Password = new String(password.getPassword());
                        String confirmPassword = new String(confimrPass.getPassword());
                        if(!Password.equals(confirmPassword)){
                                    JOptionPane.showMessageDialog(frame, 
                                        "Password do not match, Please Try again.", 
                                        "REGISTRATION ERROR", 
                                            JOptionPane.ERROR_MESSAGE);
                                    return;
                        }else{
                            JOptionPane.showMessageDialog(frame, 
                                "Acount created successfully!", 
                                "SUCESS", 
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                            frame.setContentPane(new Login(frame));
                            frame.revalidate();
                        }
                    }
        });
        add(bg);
        bg.add(bg1);
        bg.add(btnBack);
        bg.add(firstname);
        bg.add(lastname);
        bg.add(mail);
        bg.add(Stduent_ID);
        bg.add(password);
        bg.add(confimrPass);
        bg.add(clearButton);
        bg.add(CreateButton);
        this.setVisible(true);

    }
}