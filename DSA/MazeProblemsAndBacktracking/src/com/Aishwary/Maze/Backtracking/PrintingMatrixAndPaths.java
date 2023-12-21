package com.Aishwary.Maze.Backtracking;
//Take a step variable
//Update the path array
//print in base condition
//Backtracking

import java.util.Arrays;

public class PrintingMatrixAndPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        AllPathsPrint("", board, 0, 0, path, 1);

    }
    static void AllPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){ //path array and step
        if (r == maze.length - 1 && c == maze[0].length - 1){ //0 = length of col
            path[r][c] = step;
            for (int[] arr : path) { //for arr integer in path
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p); //printing the path as well
            System.out.println(); //new line
            return;
        }
        if (!maze[r][c]){ // if maze[r][c] == false // if not true //if there is an obstacle
            return; //don't go inside that block
        }

        //considering this block in my path == set false
        maze[r][c] = false; //* imp
        path[r][c] = step; //*imp

        if (r < maze.length - 1){ //with every function call step in increasing
            AllPathsPrint(p + 'D', maze, r+1, c, path, step+1); //down
        }
        if (c < maze[0].length - 1){
            AllPathsPrint(p + 'R', maze, r, c+1, path, step+1); //right
        }
        if (r > 0){
            AllPathsPrint(p + 'U', maze, r-1, c, path, step+1); //Up
        }
        if (c > 0){
            AllPathsPrint(p + 'L', maze, r, c-1, path, step+1); //Left
        }

        //this is the line where the function gets over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true; //reverting
        path[r][c] = 0; //backtracking
    }
}
