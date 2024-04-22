package com.sspd.array;

public class Ex_2 {

    public static void main(String[] args) {

        int[] x = {2,3,34,5,1};

        x[2] = 99;

        System.out.println(x[2]);

        for(int i=0;i<=x.length-1;i++){

            x[i]= 0;
            System.out.println(x[i]);

        }


        int [][] n = {

                {4},
                {2, 3, 4},
                {9,4,22},
                {44,33,55},
                {88,90,76},
                {0,2,34}

        };

    for (int i =0;i<=n.length-1;i++){

        for(int y = 0;y<=2;y++){

            n[3][y]=0;

            System.out.println("Row : "+i+" Column :  "+n[i][y]);
        }

    }

    }
}
