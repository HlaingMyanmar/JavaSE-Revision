package com.sspd.Method;

public class Ex_2 {

    public static void main(String[] args) {

        System.out.println(new Ex_2().getSum());

        System.out.println(getSum(4,5));

    }

    int getSum(){

        int x = 8+9;

        return x;
    }

    static int getSum(int x, int y){// with Parameter

        return  x+y;

    }
}
