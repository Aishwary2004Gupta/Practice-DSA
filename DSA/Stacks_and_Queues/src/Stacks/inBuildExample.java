package Stacks;

import java.util.Stack;

public class inBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //class // Stack extends vector
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());  //Empty stack exception


    }
}