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

        String username = "Enter Fullname";
        JTextField fullname = new JTextField(username);                                              
        fullname.setBounds(174, 246, 412, 65);
        fullname.setBackground(new Color(0xF5F6FA));
        fullname.setBorder(null);
        fullname.setFont(new Font("sanchez", Font.PLAIN, 20));
        fullname.setForeground(Color.GRAY);
        fullname.setFocusable(false);
        fullname.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fullname.setFocusable(true);
                fullname.requestFocusInWindow();
                fullname.setText("");
                fullname.setForeground(Color.BLACK);
            }
        });
        fullname.addFocusListener(new FocusAdapter() { 
            public void focusLost(FocusEvent e) {
                if (fullname.getText().isEmpty()) {
                    fullname.setText(username);
                    fullname.setForeground(Color.GRAY);
                    fullname.setFocusable(false); 
                }
            }
        });

        String email = "Enter Email"; //Email =============================================
        JTextField mail = new JTextField(email); 
        mail.setBounds(174, 340, 412, 65);
        mail.setBackground(new Color(0xF5F6FA));
        mail.setBorder(null);
        mail.setFont(new Font("sanchez", Font.PLAIN, 20));
        mail.setForeground(Color.GRAY);
        mail.setFocusable(false);
        mail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mail.setFocusable(true);
                mail.requestFocusInWindow();
                mail.setText("");
                mail.setForeground(Color.BLACK);
            }
        });
        mail.addFocusListener(new FocusAdapter() { 
            public void focusLost(FocusEvent e) {
                if (mail.getText().isEmpty()) {
                    mail.setText(email);
                    mail.setForeground(Color.GRAY);
                    mail.setFocusable(false); 
                }
            }
        });

        String id = "Enter Student ID"; // student ID ================================
        JTextField si = new JTextField(id); 
        si.setBounds(174, 434, 412, 65);
        si.setBackground(new Color(0xF5F6FA));
        si.setBorder(null);
        si.setFont(new Font("sanchez", Font.PLAIN, 20));
        si.setForeground(Color.GRAY);
        si.setFocusable(false);
        si.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                si.setFocusable(true);
                si.requestFocusInWindow();
                si.setText("");
                si.setForeground(Color.BLACK);
            }
        });
        si.addFocusListener(new FocusAdapter() { 
            public void focusLost(FocusEvent e) {
                if (si.getText().isEmpty()) {
                    si.setText(id);
                    si.setForeground(Color.GRAY);
                    si.setFocusable(false); 
                }
            }
        });

        String password = "Enter Password"; // Password field ================================
        JPasswordField pass = new JPasswordField(password); 
        pass.setBounds(174, 528, 412, 65);                                                               
        pass.setBackground(new Color(0xF5F6FA));
        pass.setBorder(null);
        pass.setFont(new Font("sanchez", Font.PLAIN, 20));
        pass.setForeground(Color.GRAY); 
        pass.setEchoChar((char) 0);

        pass.setFocusable(false);

        pass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pass.setFocusable(true);
                pass.requestFocusInWindow();

                pass.setText("");
                pass.setForeground(Color.BLACK);
                pass.setEchoChar('•');

            }
        });

        pass.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (pass.getPassword().length == 0) {
                    pass.setText(password);
                    pass.setForeground(Color.GRAY);
                    pass.setEchoChar((char) (0));
                    pass.setFocusable(false); 
                }
            }
        });

        
        String cpass = "Enter Confirm Password"; //Conform password =========                                              
        JPasswordField cpass_input = new JPasswordField(cpass);   
        cpass_input.setBounds(176, 623, 412, 63);
        cpass_input.setBackground(new Color(0xF5F6FA));
        cpass_input.setBorder(null);
        cpass_input.setFont(new Font("sanchez", Font.PLAIN, 20));
        cpass_input.setForeground(Color.GRAY);
        cpass_input.setEchoChar((char) 0);

        cpass_input.setFocusable(false);
        

        cpass_input.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cpass_input.setFocusable(true);
                cpass_input.requestFocusInWindow();

                cpass_input.setText("");
                cpass_input.setForeground(Color.BLACK);
                cpass_input.setEchoChar('•');
            }
        });

        cpass_input.addFocusListener(new FocusAdapter() { 
            public void focusLost(FocusEvent e) {
                if (cpass_input.getPassword().length == 0) {
                    cpass_input.setText(cpass);
                    cpass_input.setForeground(Color.GRAY);
                    cpass_input.setEchoChar((char)(0));
                    cpass_input.setFocusable(false); 
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
                fullname.setText(username);
                fullname.setForeground(Color.GRAY);
                mail.setText(email);
                mail.setForeground(Color.GRAY);
                si.setText(id);
                si.setForeground(Color.GRAY);
                pass.setText(password);
                pass.setEchoChar((char) (0));
                pass.setForeground(Color.GRAY);
                cpass_input.setText(cpass);
                cpass_input.setEchoChar((char)(0));
                cpass_input.setForeground(Color.GRAY);
               
                

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
                        fullname.getText().equals(username)         ||

                        mail.getText().trim().isEmpty()             ||
                        mail.getText().equals(email)                ||

                        si.getText().trim().isEmpty()               ||
                        si.getText().equals(id)                     ||

                        new String(pass.getPassword()).equals(password)||
                        pass.getPassword().length == 0              ||

                        new String (cpass_input.getPassword()).equals(cpass) ||
                        cpass_input.getPassword().length == 0) {

                            JOptionPane.showMessageDialog(frame,  
                            "Please fill out all required fields.",
                            "INPUT ERROR",
                            JOptionPane.ERROR_MESSAGE
                        );
                                return;
                            } 

                        String Password = new String(pass.getPassword());
                        String confirmPassword = new String(cpass_input.getPassword());
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
        bg.add(si);
        bg.add(pass);
        bg.add(cpass_input);
        bg.add(clearButton);
        bg.add(CreateButton);

        this.setVisible(true);

    }
}