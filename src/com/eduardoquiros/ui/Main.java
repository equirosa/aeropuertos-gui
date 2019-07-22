package com.eduardoquiros.ui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.setContentPane(new HelloWorld().getRootPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
