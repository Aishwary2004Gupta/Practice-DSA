package com.Aishwary.SinglyLL;

public class BubbleSortMain {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
