package com.sspd.OOP_1;

public class Car {

    static final String NAME="Car";
    static String type ;


    static String getName(){


        return NAME;

    }



}

class App {
    public static void main(String[] args) {



        Car c1 = new Car();
        c1.getName();

        Car.getName();

    }




}
