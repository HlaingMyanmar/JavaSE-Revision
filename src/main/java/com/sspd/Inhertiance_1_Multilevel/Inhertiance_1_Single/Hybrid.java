package com.sspd.Inhertiance_1_Multilevel.Inhertiance_1_Single;

public class Hybrid extends  MountainBike{


    Hybrid(int seatHeight, int gear, int speed) {

        super(seatHeight, gear, speed);


    }

    @Override
    public String toString() {

        return "Speed : "+super.getSpeed()+"\nGear : "+super.getGear() + "\nSeatHeight : "+super.seatHeight;
    }
}
