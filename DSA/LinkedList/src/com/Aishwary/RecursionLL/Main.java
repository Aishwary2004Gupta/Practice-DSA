package com.Aishwary.RecursionLL;

public class Main {
    public static void main(String[] args) {
        Insert list = new Insert();

        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(7);

        list.insertRec(10, 2);
        list.display();
    }
}
