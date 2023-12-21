package com.Aishwary.DoublyLL;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
//        list.display();

        list.insertLast(50);
//        list.display();

        list.insertAfter(50,15);
        list.display();
    }
}
