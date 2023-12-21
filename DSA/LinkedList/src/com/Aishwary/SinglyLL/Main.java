package com.Aishwary.SinglyLL;

public class Main {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(11);

        list.insertLast(50);

        list.insert(100, 2); //starting index is 0
        list.display();

//        list.deleteFirst();
        System.out.println(list.deleteFirst()); //show which element have you deleted
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();


    }
}