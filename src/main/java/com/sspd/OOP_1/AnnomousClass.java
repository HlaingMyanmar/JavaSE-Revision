package com.sspd.OOP_1;

public class AnnomousClass {

    public static void main(String[] args) {


        Test t = new Test();
        t.getTest();;



        Test t2 = new Test(){


            void getTest(){

                System.out.println("I am another style Annoumus Class");

            }



        };

        t2.getTest();


    }
}

class Test{

    void getTest(){
        System.out.println("I am Test Class");
    }

}



