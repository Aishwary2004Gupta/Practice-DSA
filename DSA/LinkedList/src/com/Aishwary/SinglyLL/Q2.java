package com.Aishwary.SinglyLL;

import static com.Aishwary.SinglyLL.Linked_List.merge;

public class Q2 {
        public static void main(String[] args) {
            Linked_List first = new Linked_List();
            Linked_List second = new Linked_List();

            first.insertLast(1);
            first.insertLast(2);
            first.insertLast(4);

            second.insertLast(1);
            second.insertLast(3);
            second.insertLast(4);

            Linked_List ans = merge(first, second);
            ans.display();

            ans.bubbleSort();
            ans.display();
        }
    }
