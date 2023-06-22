package com.oops;

public class DLL {
    Node head;
    Node tail;
    int size;
    public Node get(int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    // insertion of a element in a linked list
    //
    public void Insert(int index, int val){
        Node in = get(index);
        if(in == null){
            System.out.println("does not exists");
            return;
        }
        Node node = new Node(val);
        node.next=in.next;
        in.next=node;
        node.prev=in;
        if(node.next!= null) {
            node.next.prev = node;
        }
        size++;
    }
    // deletion of elements in a linked list
    //
    public void delete(int index){
        Node del = get(index);
        if(del==null){
            return;
        }
        del.next=del.next.next;
        if(del.next!=null) {
            del.next.next.prev = del;
        }
        size--;
    }
    // displaying of linked list
    //
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        if (tail == null) {
            InsertFirst(val);
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;
    }
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public static void main(String[] args) {
        DLL first = new DLL();
        first.InsertLast(15);
        first.InsertLast(25);
        first.InsertLast(35);
        first.InsertLast(45);
        first.InsertLast(55);
        first.Insert(2,7);
        first.Insert(6,7);
        first.delete(2);
        first.display();
        System.out.println(" ");
        System.out.println(first.size);
    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
