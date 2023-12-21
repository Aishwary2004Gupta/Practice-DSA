package com.Aishwary.Maze.Backtracking;

//including all (Left, right, up, down)
//will give error
//problem = going back to where it started (endless error)
//solution = do not move back to the same path
//How to solve = All cells that are visited mark them as false, so that it does not go there
//             = While moving put as false
//             = While moving back, restore the maze as it was (for next recursion calls)
//                                 = turn false to true while moving back
//                                 = while returning the function call

//                                            ⬆️
//                         ************** BACKTRACKING ******************
//                             (What if I haven't taken this part)
//                         (Change the changes that was made previously)

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        AllPaths("", board, 0, 0);
    }
    static void AllPaths(String p, boolean[][] maze, int r, int c){ //boolean array
        if (r == maze.length - 1 && c == maze[0].length - 1){ //0 = length of col
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){ // if maze[r][c] == false // if not true //if there is a obstacle
            return;
        }

        //considering this block in my path == set false
        maze[r][c] = false; //* imp

        if (r < maze.length - 1){
            AllPaths(p + 'D', maze, r+1, c); //down
        }
        if (c < maze[0].length - 1){
            AllPaths(p + 'R', maze, r, c+1); //right
        }
        if (r > 0){
            AllPaths(p + 'U', maze, r-1, c); //Up
        }
        if (c > 0){
            AllPaths(p + 'L', maze, r, c-1); //Left
        }

        //this is the line where the function gets over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true; //reverting
    }
}
