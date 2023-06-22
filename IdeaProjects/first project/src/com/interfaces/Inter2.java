package com.interfaces;

public class Inter2 implements Inter,Inter3 {
    @Override
    public void job() {
        System.out.println("i wnat to do job");
    }

    public void intern() {
        System.out.println("i wnat to do intern");
    }

    public void quit() {
        System.out.println("i wnat to quit job");
    }
    public void games(){
        System.out.println("i wnat to play games");
    }
    public void others(){
        System.out.println("i want to do some other things ");
    }
    public static void main(String[] args){
        Inter2 inter = new Inter2();
        inter.intern();
        inter.job();
        inter.others();
    }

}
