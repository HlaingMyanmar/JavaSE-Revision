package com.sspd.dowhileLoop;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

        int pass = 99;

        int result;
        String name ;


        do {  // indefinite Loop

            name = JOptionPane.showInputDialog("Insert Your Name?");

            result = Integer.parseInt(JOptionPane.showInputDialog("Insert Your Password"));

            if(!(result == pass && name.equals("Hlaing"))){

                JOptionPane.showMessageDialog(null, "Try Again?");

            }

        } while (result != pass || !(name.equals("Hlaing")));

        JOptionPane.showMessageDialog(null, "Correct");

    }
}
