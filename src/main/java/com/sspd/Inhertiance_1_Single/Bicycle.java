package com.sspd.Inhertiance_1_Single;

public class Bicycle {


    private int gear;
    private int speed;

    Bicycle(int gear,int speed){

        this.gear = gear;
        this.speed  = speed;

    }

    public int getGear(){

        return  gear;

    }
    public int getSpeed(){
        return  speed;
    }

    public  void  setGear(int gear){

        this.gear=gear;

    }

    public  void  setSpeed(int speed){

        this.speed = speed;

    }

    public  void speedUp(int increment){

        this.speed+= increment;

    }

    public void applyBrake(int decreasement){

        this.gear-=decreasement;
    }







}
