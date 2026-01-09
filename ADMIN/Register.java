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

        JLabel bg = new JLabel();
        bg.setBounds(0, 0, 1512, 982);
        bg.setIcon(new ImageIcon("PEKTURS/REGISTER PAGE .png"));
        bg.setLayout(null);

        JButton btnBack = new JButton();
        btnBack.setForeground(Color.BLACK);
        btnBack.setBounds(431,826,92,19);
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

        String username_Placeholder = "Enter Fullname";

        JTextField fullname = new JTextField(username_Placeholder);                                              
        fullname.setBounds(174, 246, 412, 65);
        fullname.setBackground(new Color(0xF5F6FA));
        fullname.setBorder(null);
        fullname.setFont(new Font("sanchez", Font.PLAIN, 20));
        fullname.setForeground(Color.GRAY);

        fullname.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(fullname.getText().equals(username_Placeholder)){
                    fullname.setText("");
                    fullname.setForeground(Color.BLACK);
                    }
                }
        
            public void focusLost(FocusEvent e) { 
            if (fullname.getText().isEmpty()){
                fullname.setText(username_Placeholder);
                fullname.setForeground(Color.gray);
                    }
                }
        });

        String email_Placeholder = "Enter Email"; //Email =============================================
        
        JTextField mail = new JTextField(email_Placeholder); 
        mail.setBounds(174, 340, 412, 65);
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

        String id_Placeholder = "Enter Student ID"; // student ID ================================
        
        JTextField Stduent_ID = new JTextField(id_Placeholder); 
        Stduent_ID.setBounds(174, 434, 412, 65);
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
        password.setBounds(174, 528, 412, 65);                                                               
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
        confimrPass.setBounds(176, 623, 412, 63);
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
        clearButton.setBounds(149, 727, 210, 68);
        clearButton.setOpaque(false);
        clearButton.setContentAreaFilled(false);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullname.setText(username_Placeholder);
                fullname.setForeground(Color.GRAY);
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
        CreateButton.setBounds(387, 727, 210, 68);
        CreateButton.setOpaque(false);
        CreateButton.setContentAreaFilled(false);
        CreateButton.setBorderPainted(false);
        CreateButton.setFocusPainted(false);
        CreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                  if (
                        fullname.getText().trim().isEmpty()         ||
                        fullname.getText().equals(username_Placeholder)         ||

                        mail.getText().trim().isEmpty()             ||
                        mail.getText().equals(email_Placeholder)                ||

                        Stduent_ID.getText().trim().isEmpty()               ||
                        Stduent_ID.getText().equals(id_Placeholder)                     ||

                        new String(password.getPassword()).equals(password_Placeholder)||
                        password.getPassword().length == 0              ||

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
        bg.add(btnBack);
        bg.add(fullname);
        bg.add(mail);
        bg.add(Stduent_ID);
        bg.add(password);
        bg.add(confimrPass);
        bg.add(clearButton);
        bg.add(CreateButton);

        this.setVisible(true);

    }
}