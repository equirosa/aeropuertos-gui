package com.eduardoquiros.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JPanel loginPanel;
    private JLabel nombreLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel labelPrueba;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPrueba.setText("Usuario="+textField1.getText()+" Contrasenna= "+passwordField1.getText());
            }
        });
    }

    public JPanel getLoginPanel(){
        return loginPanel;
    }
}
