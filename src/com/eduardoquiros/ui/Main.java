package com.eduardoquiros.ui;

import com.eduardoquiros.tl.ControladorLogin;

import javax.swing.*;
import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    static ControladorLogin gestorLogin = new ControladorLogin();
    static JFrame panelLogin = new JFrame("Login");
    
    public static void main(String[] args) {
        if(gestorLogin.isNotLoggedIn()) {
            desplegarLogin();
        }
        int opcion = -1;
        while(opcion==0){
        
        }
    }

    private static void desplegarLogin() { //Despliega la ventana de login.
        panelLogin.setContentPane(new LoginForm().getLoginPanel());
        panelLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelLogin.pack();
        panelLogin.setVisible(true);
    }
    
    public static void ejecutarLogin(String[] loginData) {
//        gestorLogin.ejecutarLogin(loginData);
        for(String data : loginData){
            out.println(data);
        }
    }
}
