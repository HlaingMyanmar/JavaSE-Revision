package com.sspd.Inhertiance_1_Single;

public class App {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3,4,20);


        System.out.println("After Default ...........");
        System.out.println(mb); // to String default

        System.out.println("After Chaging..........");

        mb.speedUp(20);
        mb.applyBrake(1);

        System.out.println(mb);


    }
}
