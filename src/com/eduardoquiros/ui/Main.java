package com.eduardoquiros.ui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        desplegarLogin();
    }

    private static void desplegarLogin() {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new LoginForm().getLoginPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        desplegarLogin();
    }
    
    private static void obtenerDayos(){
    
    }


}
