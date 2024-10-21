package com.Aishwary;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLishExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>(5);

//        list.add(71);
//        list.add(19);
//        list.add(11);
//
//        System.out.println(list.contains(12));
//        System.out.println(list);
//        list.set(0,99); //Change
//        list.remove(2);
//        System.out.println(list);

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] will not work here
        }
        System.out.println(list);
    }
}
