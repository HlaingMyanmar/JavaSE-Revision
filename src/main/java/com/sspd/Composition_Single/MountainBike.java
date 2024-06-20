package com.sspd.Composition_Single;

public class MountainBike {


    public int seatHeight;

    Bicycle bicycle ;


    MountainBike(int seatHeight, Bicycle bicycle){

        this.seatHeight = seatHeight;
        this.bicycle = bicycle;

    }

    @Override
    public String toString() {
        return "SeatHeight : "+seatHeight +"\nSpeed : "+bicycle.getSpeed() + "\nGear : "+bicycle.getGear();
    }

    void getSpeedUp(int increment){

        bicycle.speedUp(increment);

    }
}
