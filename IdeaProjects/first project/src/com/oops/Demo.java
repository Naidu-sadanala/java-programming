package com.oops;
public class Demo {
    private Demo2 head;
    int size;
    public void nums(int nai){
        Demo2 demo = new Demo2(nai);
        demo.sadanala=head;
        System.out.println(demo.sadanala);
        head=demo;
        size += 1;

    }
    public void display() {
        Demo2 temp = head;
        while (temp != null){
            System.out.println(temp.nai + " -> ");
            System.out.println(temp.sadanala);
            temp = temp.sadanala;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Demo first = new Demo();
        first.nums(1);
        first.nums(3);
        first.nums(5);
        first.display();
    }
    private class Demo2 {
        private Demo2 sadanala;
        private int nai;
        // private Demo2 sadanala;
        public Demo2(int nai){
            this.nai=nai;
        }
        public Demo2(int nai, Demo2 sadanala){
            this.nai=nai;
            this.sadanala=sadanala;
        }
    }
}
