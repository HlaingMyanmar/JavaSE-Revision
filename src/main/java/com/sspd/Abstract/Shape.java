package com.sspd.Abstract;

import com.sun.tools.javac.Main;

public  abstract class Shape {

    String color;

    Shape (String color){

        this.color = color;
    }

    void getPrint(){

        System.out.println("Color");

    }

    static  void getPrint2 (){

        System.out.println("Static Color");
    }

   abstract void getColor();




}

class  Deliver extends Shape{


    Deliver(String color) {

        super(color);

    }

    @Override
    void getColor() {

        System.out.println(super.color);

    }
}

class App{

    public static void main(String[] args) {

        Deliver d = new Deliver("Red");

        d.getColor();

        d.getPrint();

        Shape.getPrint2();
    }
}




