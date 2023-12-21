package com.Aishwary.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(15);
        list.insert(19);
        list.insert(13);
        list.insert(21);
        list.insert(17);
        list.display();

        list.delete(21);
        list.display();


    }
}
