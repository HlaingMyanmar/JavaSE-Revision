package com.sspd.OOP_1;

public class Ex_2_InnerClass {

    public static void main(String[] args) {

        Outer o1 = new Outer();

        Outer.Inner in = new Outer().new Inner();
        in.show();

        new Outer().new Inner().show(); // Invoke

        Outer.Inner2 in1 = new Outer.Inner2();
        in1.show();

        new Outer.Inner2().show(); // Invoke


    }
}


class Outer {

    class Inner {

        public void show()
        {
            System.out.println("Inside a nested class");
        }
    }

    static class Inner2{

        public void show()
        {
            System.out.println("Inside a nested class2");
        }

    }
}
