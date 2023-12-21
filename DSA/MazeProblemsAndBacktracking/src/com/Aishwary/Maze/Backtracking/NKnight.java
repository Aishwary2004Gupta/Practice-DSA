package com.Aishwary.Maze.Backtracking;

public class NKnight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 6);

    }
    static void knights(boolean[][] board, int row, int col, int knights){
        if (knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length){ //out of bound
            return; //just skip it
        }

        if (col == board.length){ //if col comes to end
            knights(board, row+1, 0, knights); //try for next line(row)
            return;
        }

        //otherwise can check
        if (isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col+1, knights-1); //one knight placed (k-1)knights left
            board[row][col] = false; //backtracking
        }
        knights(board, row, col+1, knights); //if not safe move ahead
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //1
        if (isValid(board, row - 2, col - 1)){ //check if not out of bound
            if (board[row - 2][col - 1]){ // if not, check if a knight is already available in that position or not
                return false;
            }
        }
        //2
        if (isValid(board, row - 2, col + 1)){ //check if not out of bound
            if (board[row - 2][col + 1]){ // if not, check if a knight is already available in that position or not
                return false;
            }
        }
        //3
        if (isValid(board, row - 1, col + 2)){ //check if not out of bound
            if (board[row - 1][col + 2]){ // if not, check if a knight is already available in that position or not
                return false;
            }
        }
        //4
        if (isValid(board, row - 1, col - 2)){ //check if not out of bound
            if (board[row - 1][col - 2]){ // if not, check if a knight is already available in that position or not
                return false;
            }
        }

        return true; //if nothing return false return true
    }

    // to not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col){ //just to check that the provided info is valid or not (by the user)
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){ //for every row in my board
            for (boolean element : row){ //for element in my row
                if (element){ //element = true (can be placed)
                    System.out.print("K ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
