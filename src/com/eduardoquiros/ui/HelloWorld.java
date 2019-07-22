package com.eduardoquiros.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel rootPanel;
    private JLabel helloLabel;
    private JButton helloButton;

    public HelloWorld() {
        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helloLabel.setText("Hello World");
            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }
}
