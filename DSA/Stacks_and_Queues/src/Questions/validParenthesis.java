package Questions;

import java.util.Stack;

public class validParenthesis {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        //traversing
        for (char c : s.toCharArray()) {  //character c in string.toCharArray (converts the string into new character)
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else { //need to remove
                if (c == '}'){ //while doing pop() it is possible that the string becomes empty
                    if (stack.isEmpty() || stack.pop() != '{'){ // need to (add/check the condition before popping it)
                        return false;
                    }
                }
                if (c == ']'){
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }

                }
                if ( c == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty(); // true
    }
}
