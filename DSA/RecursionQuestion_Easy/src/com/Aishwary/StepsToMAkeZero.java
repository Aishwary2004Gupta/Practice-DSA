package com.Aishwary;

class StepsToMAkeZero {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) { //in how many chances will a number become 0
        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if (num == 0){
            return steps;
        }
        if (num%2 == 0){
            return helper(num/2, steps+1); //is even divide by 2
        } else {
            return helper(num-1, steps+1); //if odd - 1
        }
    }
}