package com.sspd.Interface;

public interface One {

    void getMethod1();

}

interface  Two {

    void getMethod2();


}

class App implements One,Two{


    @Override
    public void getMethod1() {

    }

    @Override
    public void getMethod2() {

    }
}
