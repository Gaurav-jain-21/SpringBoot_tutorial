package com.trimag;

public class Dev {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age=a;
    }
    public Dev(int age){
        this.age=age;
        System.out.println("this is age constructor");
    }
//    private Laptop laptop;
    public Dev(){
        System.out.println("Dev Constructor");
    }
    public void build(){
        System.out.println("working on awesome project");
//        laptop.compile();

    }
}
