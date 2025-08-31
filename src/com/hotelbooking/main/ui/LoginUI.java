package com.hotelbooking.main.ui;

import javax.swing.*;
import java.awt.*;
import com.hotelbooking.main.uicomponents.RoundedTextFieldUtil;
import net.miginfocom.swing.MigLayout;

public class LoginUI extends JFrame{
    public LoginUI () {
        this.setSize(new Dimension(1024,576));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Hotel Booking");
        this.setLayout(new MigLayout("fill,insets 5","[40%][60%]","grow"));

        JPanel register = new JPanel();
        JPanel login = new JPanel();

        login.setBackground(new Color(0xFFFFFF));
        login.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF),2,true));
        login.setLayout(new MigLayout(
                "fillx, insets 10,wrap 1",   // single column, fill horizontally, padding 20
                "[grow]",               // one column that grows/fills horizontally
                "25%[][][][][]"                            // rows will adjust automatically
        ));
        register.setBackground(new Color(0xFFFFFF));

        //Login Component Declaration
        JLabel welcomeBack = new JLabel();
        JLabel loginLabel = new JLabel();
        JTextField usernameField = new JTextField("Username");
        JPasswordField passwordField = new JPasswordField("Password");
        JButton forgotPassword = new JButton("Forgot Password?");

        //welcomeBack Text
        welcomeBack.setText("Welcome Back");
        welcomeBack.setFont(new Font("Apple LiGothic", Font.BOLD, 24));
        welcomeBack.setOpaque(false);
        welcomeBack.setForeground(Color.black);
        welcomeBack.setHorizontalAlignment(JLabel.CENTER);
        welcomeBack.setVerticalAlignment(JLabel.BOTTOM);

        //login text
        loginLabel.setText("   Login");
        loginLabel.setFont(new Font("Sans",Font.BOLD,10));
        loginLabel.setForeground(Color.gray);

        //usernameField
        usernameField.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));
        usernameField.setPreferredSize(new Dimension(200,30 ));
        usernameField.setOpaque(true);
        usernameField.setBackground(Color.LIGHT_GRAY);

        //passwordField
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY,2,true));
        passwordField.setPreferredSize(new Dimension(200,30 ));
        passwordField.setBackground(Color.LIGHT_GRAY);

        //forgot password
        forgotPassword.setAlignmentX(JButton.RIGHT_ALIGNMENT);
        forgotPassword.setPreferredSize(new Dimension(200,50));
        forgotPassword.setBackground(new Color(0, 0, 0, 0));
        forgotPassword.setFont((new Font("San",Font.PLAIN,12)));
        forgotPassword.setForeground(new Color(0x002AFF));
        forgotPassword.setFocusable(false);
        forgotPassword.setFocusPainted(false);
        forgotPassword.setContentAreaFilled(false);
        forgotPassword.setEnabled(false);
//        forgotPassword.setBorder(null);
        forgotPassword.setPreferredSize(new Dimension(30,10));


        //Adding login components
        login.add(welcomeBack,"align left, gapbottom 20");
        login.add(loginLabel);
        login.add(usernameField,"growx, h 40!");
        login.add(passwordField,"growx, h 40!");
        login.add(forgotPassword);

        //setVisible to login components
        welcomeBack.setVisible(true);
        loginLabel.setVisible(true);
        usernameField.setVisible(true);
        passwordField.setVisible(true);
        forgotPassword.setVisible(true);





        this.add(login,"grow");
        this.add(register,"grow");

        this.setVisible(true);

    }
}
