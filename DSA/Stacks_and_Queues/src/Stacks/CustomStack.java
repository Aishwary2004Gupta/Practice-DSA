package Stacks;
//Making our own stack

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10; //final keyword prevent overriding/ inheritance

    int ptr = -1;

    public CustomStack(){ //if no size is given it will take default size which is 10
        this(DEFAULT_SIZE); //this keyword can be used for two different purposes
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
                                //OR
        return data[ptr--];
    }

    public int peek() throws StackException { //keyword "throw" Vs "throws"
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
