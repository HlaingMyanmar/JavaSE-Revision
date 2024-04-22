package com.sspd.ifstatement;

import javax.swing.*;

public class Ex_2 {

    public static void main(String[] args) {

        // Ternary operator  //Short Hand If...Else

        //variable = (condition) ? expressionTrue :  expressionFalse;

        String name = JOptionPane.showInputDialog("Enter Your Name ?");
        String pass = JOptionPane.showInputDialog("Enter Your Password ?");

        String result  = (name.equals("Hlaing") && pass.equals("99"))?"Correct":"Try Again";

        JOptionPane.showMessageDialog(null,result);



    }
}
