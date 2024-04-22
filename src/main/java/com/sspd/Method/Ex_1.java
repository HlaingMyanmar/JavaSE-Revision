package com.sspd.Method;

public class Ex_1 {

    public static void main(String[] args) {  // Main method

        getInfo();  // static to static

        new Ex_1().getPrint();  // static to non-static


    }

    static void  getInfo(){


        System.out.println("We are Developer");
    }

    void getPrint(){

        System.out.println("I am Hlaing Htun");
    }


}
