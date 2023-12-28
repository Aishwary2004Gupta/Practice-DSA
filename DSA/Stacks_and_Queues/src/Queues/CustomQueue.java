package Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0; //only a single pointer moving forward

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert (int item){
        if (isFull()){
            return false;
        }
        data[end++] =  item;
        return true;
    }
                //o(n)
    public int remove () throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0]; //removing the first item
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i]; //shifting the elements to the left
        }
        end--; //size of the queue will also be decreased
        return removed;
    }

    //want to display the removed item

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
