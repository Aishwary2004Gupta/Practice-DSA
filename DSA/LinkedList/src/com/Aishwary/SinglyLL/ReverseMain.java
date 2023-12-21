package com.Aishwary.SinglyLL;

public class ReverseMain {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();
//        list.reverse();
        list.inplaceReversal();
        list.display();

    }
}
