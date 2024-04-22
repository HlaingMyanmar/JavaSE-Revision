package com.sspd.ifstatement;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Your Name ?");
        String pass = JOptionPane.showInputDialog("Enter Your Password ?");

        if(name.equals("HlaingHtun") && pass.equals("99")){

            JOptionPane.showMessageDialog(null,"Correct");

        }
        else

            JOptionPane.showMessageDialog(null,"Try Again");
    }
}
