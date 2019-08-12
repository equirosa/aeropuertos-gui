package com.eduardoquiros.ui;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
//    static Controlador gestor = new Controlador();
    static JFrame panelLogin = new JFrame("Login");
    
    public static void main(String[] args) {
        desplegarLogin();
    }

    private static void desplegarLogin() { //Despliega la ventana de login.
        panelLogin.setContentPane(new LoginForm().getLoginPanel());
        panelLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelLogin.pack();
        panelLogin.setVisible(true);
    }
    
    public static void ejecutarLogin() {
//       panelLogin.ejecutarLogin();
    }
}
