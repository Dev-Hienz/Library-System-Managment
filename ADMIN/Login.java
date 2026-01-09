package ADMIN;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends javax.swing.JPanel {

    private MainFrame frame;
    

    public Login(MainFrame frame) {
        this.frame = frame;

        panel();
    }

    public void panel() {

        this.setLayout(null);
        this.setPreferredSize(new Dimension(1512, 982));
        
        JLabel bg = new JLabel();
        bg.setBounds(0, 0, 1512, 982);
        bg.setIcon(new ImageIcon("PEKTURS/LOGIN PAGE(tempo).png"));
        bg.setLayout(null);
        
        String text_placeholder = "Enter your Email/Username";

        JTextField username = new JTextField(text_placeholder);
        username.setBounds(160, 435, 412, 56);
        username.setBackground(new Color(0xd9d9d9));
        username.setBorder(null);
        username.setFont(new Font("sanchez", Font.PLAIN, 20));
        username.setForeground(Color.GRAY);
     
        username.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
            if (username.getText().equals(text_placeholder)) {
                username.setText("");
                username.setForeground(Color.BLACK);
                    }
                }
            @Override
            public void focusLost(FocusEvent e) {
            if (username.getText().isEmpty()) {
            username.setText(text_placeholder);
            username.setForeground(Color.GRAY);
            }
            }
        });
// ================= PASSWORD FIELD =================

            String pass_Placeholder = "Enter your password";


            JPasswordField password = new JPasswordField(pass_Placeholder);
            password.setBounds(160, 539, 370, 65);
            password.setBackground(new Color(0xd9d9d9));
            password.setBorder(null);
            password.setFont(new Font("Sanchez", Font.PLAIN, 20));
            password.setForeground(Color.GRAY);
            password.setEchoChar((char) 0); // show placeholder

            ImageIcon eyeOpen = new ImageIcon(
                new ImageIcon("PEKTURS/eye (2).png")
                    .getImage()
                    .getScaledInstance(30, 30, Image.SCALE_SMOOTH)
            );

            ImageIcon eyeClosed = new ImageIcon(
                new ImageIcon("PEKTURS/hidden.png")
                    .getImage()
                    .getScaledInstance(30, 30, Image.SCALE_SMOOTH)
            );


                // Show / Hide Checkbox (Eye)
            JCheckBox showPassword = new JCheckBox();
            showPassword.setBounds(530, 557, 35, 30);
            showPassword.setIcon(eyeClosed);
            showPassword.setSelectedIcon(eyeOpen);
            showPassword.setBorder(null);
            showPassword.setContentAreaFilled(false);
            showPassword.setOpaque(false);
            showPassword.setFocusPainted(false);

            showPassword.addActionListener(e -> {
                String text = new String(password.getPassword());

                    if (!text.equals(pass_Placeholder)) {
                    if (showPassword.isSelected()) {
                            password.setEchoChar((char) 0); 
                    } else {
                        password.setEchoChar('•');     
                    }
                    }
                });


           
            password.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                String currentText = new String(password.getPassword());

                if (currentText.equals(pass_Placeholder)) {
                    password.setText("");
                    password.setForeground(Color.BLACK);

                    // Hide password unless checkbox is selected
                    if (!showPassword.isSelected()) {
                    password.setEchoChar('•');
                    
                    }
                }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (password.getPassword().length == 0) {
                    password.setText(pass_Placeholder);
                    password.setForeground(Color.GRAY);
                    password.setEchoChar((char) 0); 
                }
                }
            });

        JButton clearButton = new JButton();
        clearButton.setBounds(138, 655, 210, 68);
        clearButton.setOpaque(false);
        clearButton.setContentAreaFilled(false);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username.setText(text_placeholder);
                password.setText(pass_Placeholder);
                password.setEchoChar((char) (0));
                username.setForeground(Color.GRAY);
                password.setForeground(Color.GRAY);

            }
        });

        JButton loginButton = new JButton();
        loginButton.setBounds(375, 655, 210, 68);
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Go to Dashboard");

                // CONNECT TO DB`


                if (username.getText().trim().isEmpty() ||
                username.getText().equals(text_placeholder)  ||
                new String(password.getPassword()).equals(pass_Placeholder)||
                            password.getPassword().length == 0){
                    JOptionPane.showMessageDialog(frame, "Please enter both email and password.", "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                    
                } else if (username.getText().equals("Earnest") || password.getText().equals("admin123")) {
                    JOptionPane.showMessageDialog(frame, "Welcome, " + username.getText(), null,
                            JOptionPane.ERROR_MESSAGE);
                    frame.setContentPane(new Dashboard(frame));
                    frame.revalidate();

                    return;
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid email or password.", "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
        });

        JButton registernow = new JButton();
        registernow.setBounds(390, 774, 106, 19);
        registernow.setOpaque(false);
        registernow.setContentAreaFilled(false);
        registernow.setBorderPainted(false);

        registernow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Go to SignUp Page");
                frame.setContentPane(new Register(frame));
                frame.revalidate();
            }
        });

        bg.add(showPassword);
        bg.add(username);
        bg.add(password);
        bg.add(clearButton);
        bg.add(loginButton);
        bg.add(registernow);
        bg.setLayout(null);
        this.add(bg);

    }
}
