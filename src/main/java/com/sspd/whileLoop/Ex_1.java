package com.sspd.whileLoop;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

        int pass = 99;

        int result = 0;

        String name = null;

        while(result!=pass || !(name.equals("Hlaing"))){  //// indefinite Loop

             JOptionPane.showMessageDialog(null,"Try Again?");

             name = JOptionPane.showInputDialog("Insert Your Name?");

             result = Integer.parseInt(JOptionPane.showInputDialog("Insert Your Password"));

        }

        JOptionPane.showMessageDialog(null,"Correct");


    }
}
