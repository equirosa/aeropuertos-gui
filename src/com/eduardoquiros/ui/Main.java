package com.eduardoquiros.ui;

import com.eduardoquiros.tl.ControladorAdmin;
import com.eduardoquiros.tl.ControladorLogin;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    static ControladorLogin gestorLogin = new ControladorLogin();
    static ControladorAdmin gestorAdmin = new ControladorAdmin();
    static JFrame panelLogin = new JFrame("Login");
    static JFrame panelNoAdmin = new JFrame("No hay administradores.");
    static JFrame dialogoNoAdmins = new JFrame("No existen administradores registrados");
    
    public static void main(String[] args) {
        if (gestorAdmin.noAdmins()) {
            inicializarAdmin();
        }else {
            if (gestorLogin.isNotLoggedIn()) {
                desplegarLogin();
            }
        }
        int opcion = -1;
        while(opcion==0){
        
        }
    }
    
    private static void inicializarAdmin() {
        dialogoNoAdmins.setContentPane(new SinAdmins().getContentPane());
        dialogoNoAdmins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogoNoAdmins.pack();
        dialogoNoAdmins.setVisible(true);
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
    
    public static void iniciarRegistroAdmin(){
    
    }
}
