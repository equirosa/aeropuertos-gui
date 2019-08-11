package com.eduardoquiros.ui;

import javax.swing.*;
import java.awt.*;
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
	
	public Container getLoginPanel() {
		return loginPanel;
	}
	
	public String[] ejecutarLogin(){ //retorna la informacion de login ingresada por el usuario.
		String[] info = new String[2];
		info[0] = textField1.getText();
		info[1] = passwordField1.getText();
		return info;
	}
}
