package com.Aishwary.Maze;
//Printing the number of paths to reach to a point in a maze (count)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathArray("",3,3));
        System.out.println(pathArrayDiagonal("",2,3));
    }
    static int count(int row, int col){
        if (row == 1 || col == 1){
            return 1;  //recursion stops
        }
        int left = count(row - 1, col); //going down
        int right = count(row, col - 1); //going right

        int ans = left + right;
        return ans;
    }

    //printing the path
    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            path(p + 'D', r-1, c); //down
        }
        if (c > 1){
            path(p + 'R', r, c-1); //right
        }
    }

    //printing the path in an ArrayList
    static ArrayList<String> pathArray(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathArray(p + 'D', r-1, c)); //down
        }
        if (c > 1){
            list.addAll(pathArray(p + 'R', r, c-1)); //right
        }
        return list;
    }

    //Can also go diagonal
    static ArrayList<String> pathArrayDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(pathArrayDiagonal(p + 'D', r-1, c-1)); //diagonal
        }
        if (r > 1){
            list.addAll(pathArrayDiagonal(p + 'V', r-1, c)); //vertical down
        }
        if (c > 1){
            list.addAll(pathArrayDiagonal(p + 'H', r, c-1)); //horizontal
        }
        return list;
    }
}