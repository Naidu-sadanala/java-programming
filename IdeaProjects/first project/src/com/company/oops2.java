package com.company;

public class oops2 {
    public static void main(String[] args) {
        oops kunal = new oops(1000,95.2f,"kunal");
        System.out.println(kunal.population);
        oops runal = new oops(1000,95.2f,"runal");
        System.out.println(runal.population);
        System.out.println(kunal.population);

    }
}
class oops{
    int salary = 0;
    float marks = 0.0f;
    String name;
    static long population=0;
    public oops(int salary,float marks, String name){
        this.salary=salary;
        this.marks=marks;
        this.name=name;
        this.population +=1;
    }

}
