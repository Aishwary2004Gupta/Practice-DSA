package com.Aishwary.SinglyLL;

public class Q1 {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicates();
        list.display();
    }
}
