/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * PalindromeCreatorUI.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.palindrome;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCreatorUI {
    private JButton button1;
    private JPanel panel1;
    private JTextField input;
    private JTextField textField2;

    public PalindromeCreatorUI() {
        button1.addActionListener(e -> {
            Palindrome palindrome = new Palindrome();
            textField2.setText(palindrome.create(input.getText()));
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PalindromeCreatorUI");
        frame.setContentPane(new PalindromeCreatorUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
