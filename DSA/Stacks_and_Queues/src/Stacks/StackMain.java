package Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5); //no more than 5 items
//        DynamicStack stack = new DynamicStack(5); //no restriction of size
                       //OR
        CustomStack stack = new DynamicStack(5); //which method will be called depend on the child class
        // parent class         //child class

        //this will show error
//        DynamicStack stack = new CustomStack(5); //error because here the object id of type parent class
                                                     //therefore, cannot call the constructor of child class

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);




        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        System.out.println(stack.peek()); //Cannot peek from an empty stack!!
    }
}
