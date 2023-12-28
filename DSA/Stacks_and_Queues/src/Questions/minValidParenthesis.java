package Questions;
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
import java.util.Stack;

public class minValidParenthesis {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(') { //if its equal to closing bracket
                if (!stack.isEmpty() && stack.peek() == ')'){ //check
                    stack.pop(); //remove if ( ) found //that means its correct(valid)
                }
                else {
                    // add the item in the stack
                    stack.push(c);
                }
            } // not equal to closing bracket
                else {
                    // add the item in the stack
                    stack.push(c);
            }
        }
        //return the length of the stack (as that will be equal to the brackets needed to be added to make it valid)
        return stack.size();
    }
}
