package Questions;
// https://www.hackerrank.com/challenges/game-of-two-stacks/problem
//Stack
//Recursion

import javax.naming.CannotProceedException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TwoStack {
    static int twoStack(int x, int[] a, int[] b){ //taking input from the user for (maxSum limit, array A, array B)
        return twoStack(x,a,b,0,0) - 1; //initially
        // -1 because the program will also count for the element were the x has been exceeded (need to subtract it)

    }

    public static int twoStack(int x, int[] a, int[] b, int sum, int count){
        if (sum > x){ // x = sum limit
            return count;
        }

        // condition (what if one of the stack/ array becomes empty)
        if (a.length == 0 || b.length == 0){
            return count;
        }

        //recursion calls      //will remove the 0 index value and then forward from index 1
        int ans1 = twoStack(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
                                                                          //whatever element has be removed
        int ans2 = twoStack(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        // returning the one which give me the maximum count
        return Math.max(ans1, ans2);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //taking input from the user
        int t = s.nextInt(); //number of text cases
        for (int i = 0; i < t; i++) { // running the loop t times
            int n = s.nextInt(); //size of a
            int m = s.nextInt(); //size of b
            int x = s.nextInt(); //max sum

            int[] a = new int[n]; // array a
            int[] b = new int[m]; //array b

            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println(twoStack(x, a, b));
        }
    }
}
