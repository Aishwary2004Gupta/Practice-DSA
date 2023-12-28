package com.Aishwary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board.length; col++){
                //initially (board is empty)
                board[row][col] = ' ';
            }
        }

        //taking inputs
        char player = 'X';
        boolean gameOver = false; // game is not over
        Scanner scanner = new Scanner(System.in);

        //until the game is not over
        while (!gameOver){
            printBoard(board); //printing the board after every move
            System.out.println("Player " + player + " enter: ");
            //get the coordinates;
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            //check if that coordinate is filled or not
            if (board[row][col] == ' '){
                //Place the element in the board
                board[row][col] = player; //element
                gameOver = haveWon(board, player);

                //if the game is over
                if (gameOver){
                    System.out.println("Player " + player + " Won!!");
                }
                //the play will switch
                else {
//                    if (player == 'X'){
//                        player = 'O';
//                    }else {
//                        player = 'X';
//                    } //same thing as the below one line

                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else {
                System.out.println("Invalid Position try again");
            }
        }
        //finally
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        // ways a player can win (vertical/ horizontal/ diagonal)

        //1. row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player &&  board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //2. col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player &&  board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        //3. diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            //printing a new line after a row is printed
            System.out.println();
        }
    }
}

