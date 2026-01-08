package ADMIN;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        setContentPane(new Login(this));
        setSize(1512, 982);
        setLocationRelativeTo(null);
        setVisible(true);


    }
}
