package com.sspd.Inhertiance_2_Multiple;

public interface One {

    void getOne();
}

interface  Two{

    void  getTwo();

}

class Three implements One,Two{


    @Override
    public void getOne() {

        System.out.println("One");

    }

    @Override
    public void getTwo() {

        System.out.println("Two");

    }
}

class Main extends Three{


    public static void main(String[] args) {

        Three t = new Three();
        t.getOne();
        t.getTwo();




    }


}
