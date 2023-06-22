package com.oops;

public class inheritance {
    public static void main(String[] args) {
        Sadanala obj = new Sadanala(5, 10, 77);
        System.out.println(obj.nn);
        //greting();
        inheritance obj2= new inheritance();
        obj2.greeting();
        //here we created object for non static greeting method
    }
    // inside static function we cannot call non static function without creating an object
    void greeting(){
        System.out.println("non static method");
    }
    static void greting(int n){
         System.out.println("hello");
    }
}
class Main{
    int nn = 0;
    Main(int n){
        this.nn = n;
        System.out.println("main class");
    }
}
class Naidu extends Main{
    double mm =0.0f;
    Naidu(int nn,double mm){
        super(nn);
        this.mm = mm;
        System.out.println("class Naidu");
    }
}
class Sadanala extends Naidu{
    int gg =0;
    Sadanala(int nn, double mm,int gg){
        super(nn,mm);
        this.gg = gg+1;
        System.out.println("class sadanala");
    }

}
