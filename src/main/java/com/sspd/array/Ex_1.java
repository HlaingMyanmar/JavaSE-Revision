package com.sspd.array;

public class Ex_1 {

    public static void main(String[] args) {

        int [] i = new int[3];
        i[0]= 2;
        i[1]=3;
        i[2]=4;

        for(int h:i){

            System.out.println(h);

        }

        int[] x = {2,3,34,5,1};

        System.out.println("Two ..................");
        int [][] number = {


                {3,4,7},// 0
                {5,7}, // 1
                {6,8} //2

        };

      //  System.out.println(number[1][1]);// row //column

        for(int y = 0;y<=number.length-1;y++){

           for(int yy = 0;yy<=1;yy++){

               System.out.println("Row : "+y+" Column :  "+number[y][yy]);
           }

        }





    }




}
