package com.sspd.switchcase;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

        String [] monthName = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int [] month = {1,2,3,4,5,6,7,8,9,10,11,12};

        String result = JOptionPane.showInputDialog("Enter Month Name");

        int result2 = 0;

        for(int i = 0;i<=monthName.length-1;i++){

           if(result.equals(monthName[i])){

               JOptionPane.showMessageDialog(null,month[i]+" month");
               result2 = month[i];
           }

        }

//        switch (result2){
//
//            case 1 :JOptionPane.showMessageDialog(null,monthName[0]);break;
//            case 2 :JOptionPane.showMessageDialog(null,monthName[1]);break;
//            case 3 :JOptionPane.showMessageDialog(null,monthName[2]);break;
//            case 4 :JOptionPane.showMessageDialog(null,monthName[3]);break;
//            case 5 :JOptionPane.showMessageDialog(null,monthName[4]);break;
//            case 6 :JOptionPane.showMessageDialog(null,monthName[5]);break;
//            case 7 :JOptionPane.showMessageDialog(null,monthName[6]);break;
//            case 8 :JOptionPane.showMessageDialog(null,monthName[7]);break;
//            case 9 :JOptionPane.showMessageDialog(null,monthName[8]);break;
//            case 10 :JOptionPane.showMessageDialog(null,monthName[9]);break;
//            case 11 :JOptionPane.showMessageDialog(null,monthName[10]);break;
//            case 12 :JOptionPane.showMessageDialog(null,monthName[11]);break;
//            default:JOptionPane.showMessageDialog(null,"There is not Found!");
//        }

        var v = switch (result2){

            case 1-> monthName[0];
            case 2-> monthName[1];
            case 3-> monthName[2];
            case 4-> monthName[3];
            case 5-> monthName[4];
            case 6-> monthName[5];
            case 7-> monthName[6];
            case 8-> monthName[7];
            case 9-> monthName[8];
            case 10-> monthName[9];
            case 11-> monthName[10];
            case 12-> monthName[11];


            default -> "There is not Found";
        };

        JOptionPane.showMessageDialog(null,v);

    }
}
