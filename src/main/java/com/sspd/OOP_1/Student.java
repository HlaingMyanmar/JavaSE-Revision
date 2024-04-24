package com.sspd.OOP_1;

public class Student {



    private String name;
    private int age;
    private String phone;

    Student(String name,int age,String phone){  // Constructor

        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    Student(String name){

        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class App1{
    public static void main(String[] args) {

       Student st1 = new Student("NaingSiMin",23,"09787854544");
      // st1.setName("Hlaing");

        System.out.println(st1.getName());
        System.out.println(st1.getAge());

        Student st2 = new Student("Hlaing");
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
    }
}
