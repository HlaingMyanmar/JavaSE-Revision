package com.sspd.Composition_Single;

public class App {

    public static void main(String[] args) {

        Bicycle b = new Bicycle(10,20);

        MountainBike mb = new MountainBike(3,b );

        System.out.println(mb);

        System.out.println(".........................................");

        MountainBike mb1 = new MountainBike(4,new Bicycle(20,30));

        System.out.println(mb1);

        System.out.println(".........................................");

        b.speedUp(30);

        System.out.println(mb);



    }
}
