package com.sspd.Method;

public class Ex_2 {

    public static void main(String[] args) {

        System.out.println(new Ex_2().getSum());

        System.out.println(getSum(4,5));

        System.out.println(getSum(4.2,12.2));
        System.out.println(getSum("Hlaing","Htun"));

    }

    int getSum(){

        int x = 8+9;

        return x;
    }

    // Method Overloading -> Parameter

    static int getSum(int x, int y){// with Parameter

        return  x+y;

    }
    static double getSum(double x, double y){

        return  x+y;
    }

    static String getSum(String st1, String st2){

        return st1+st2;
    }
}
