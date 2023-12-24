package com.Aishwary;
/*
LeetCode problems:
        - Number of Dice Rolls With Target Sum
        - Letter Combinations of a Phone Number

 */
//Q. All the ways in which target can be made and sum of the rolled numbers on the dice

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        diceROLL("", 4);
        System.out.println(diceROLLArray("", 4));
//        diceROLLFaces("", 6, 12);
    }

    static void diceROLL(String p, int target) {
        if (target == 0) { //unprocessed is empty
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceROLL(p + i, target - i);
        }
    }

    //returning a ArrayList
    static ArrayList<String> diceROLLArray(String p, int target) {
        if (target == 0) { //unprocessed is empty
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceROLLArray(p + i, target - i));
        }
        return ans;
    }

    //Dice with n number of faces
    static void diceROLLFaces(String p, int target, int faces) {
        if (target == 0) { //unprocessed is empty
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= faces && i <= target; i++) {
            diceROLLFaces(p + i, target - i, faces);
        }
    }


    //returning a ArrayList faces
    static ArrayList<String> diceROLLArrayFaces(String p, int target, int faces) {
        if (target == 0) { //unprocessed is empty
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= faces && i <= target; i++) {
            ans.addAll(diceROLLArrayFaces(p + i, target - i, faces));
        }
        return ans;
    }
}
