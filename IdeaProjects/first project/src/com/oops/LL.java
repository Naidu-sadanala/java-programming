package com.oops;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {

        this.size = 0;
    }
    public Node finding(int value){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if(temp.value == value){
                return temp;
            }
            temp=temp.next;
        }
        return  null;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertion(int index,int value){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;

    }
    public Node get(int index){
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void deletion(int index){
        if(index==0){
            head=head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return;
        }if(index==size) {
           // System.out.println(size);
            Node last = get(size-1);
            tail=last;
            tail.next=null;
            size--;
            return;
        }
        Node prev = get(index);
        prev.next = prev.next.next;
        size--;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        //System.out.println(node);
        node.next = head;
        //System.out.println(node.next);
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        //System.out.println(node);

        //System.out.println(" ");
        tail.next=node;
        //System.out.println(tail.next);
        tail=node;
        size++;
    }
    public static void main(String[] args) {
       LL first = new LL();
        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(5);
        first.insertion(1,10);
        first.display();
        first.deletion(1);
        first.display();
        System.out.println(first.finding(77 ));

   }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}

