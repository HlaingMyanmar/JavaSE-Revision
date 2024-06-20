package com.sspd.Inhertiance_1_Single;

public class MountainBike extends Bicycle {


    public int seatHeight;

    MountainBike (int seatHeight,int gear,int speed){

        super(gear,speed);
        this.seatHeight = seatHeight;


    }

    @Override
    public String toString() {

        return "Speed : "+super.getSpeed()+"\nGear : "+super.getGear() + "\nSeatHeight : "+this.seatHeight;


    }
}
