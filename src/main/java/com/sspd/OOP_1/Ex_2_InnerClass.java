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

        Outer.Inner3 in3 = new Outer().new Inner3();

        in3.show3();


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

    class Inner3{


        void show3(){

            class Print{


                void getPrint(){

                    System.out.println("This is Method Local Inner Class");
                }

            }

            Print p = new Print();
            p.getPrint();

        }
    }



}
