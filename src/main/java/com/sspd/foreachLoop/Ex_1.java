package com.sspd.foreachLoop;

import java.util.LinkedList;
import java.util.List;

public class Ex_1 {

    public static void main(String[] args) {


        int [] i = {4,1,6,3,8}; // Start Zero

//        for(int j = 0;j<=4;j++){
//            System.out.println(i[j]);
//        }


        for(int in:i){

            System.out.println(in);

        }

        System.out.println("List ............");

        List<Integer> numberList = new LinkedList<>(); // start List Zero

        numberList.add(34);
        numberList.add(23);
        numberList.add(12);
        numberList.add(33);

//        for(int x = 0;x<=3;x++){
//
//            System.out.println(numberList.get(x));
//
//        }

        for(int y :numberList){

            System.out.println(y);

        }

        while(numberList<numberList.size()){

        }


    }
}
