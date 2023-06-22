package com.company;

import java.util.Arrays;

public class opps1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student sankar = new Student();
        sankar.Greetings();
        Student kunal = new Student(15,"naidu",50f);
        Student ramana = new Student(56,"ramana",89);
       // kunal.rno=11;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(ramana.rno);
        Integer a = 45;
        //System.out.println(a);
        Float b = 10.5f;
        String name = "naidu";
        name = "sadanala";
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(){

    }
    Student(int rno,String peru,float mar){
       this.rno=rno;
       this.name=peru;
       this.marks=mar;
    }
    void Greetings(){
        System.out.println("hi ra mama");
    }
}
