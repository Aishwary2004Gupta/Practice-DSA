package Queues;

public class CircularQueue { //There is no need of shifting the elements
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert (int item){
        if (isFull()){
            return false;
        }
        data[end++] = item; //add the item in the end then move the end pointer forward
        end = end % data.length; //when the value of end (index) is same as the size(that means end of the queue)
                                 // after if there is space the next value will be inserted at the index 0
        size++; //after inserting
        return true;
    }

    public int remove () throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++]; //removing from the front and moving it forward
        front = front % data.length;
        size--; //after removing
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front]; //return the front element which has been removed;
    }

    public void display(){ //print all the elements between front and end
                            //until its not equal to end;

//        if (isFull()){ //This will not work thats why we need to use Dynamic Queue (doubling the size of the queue)
//            System.out.println("Queue is full");
//            return;
//        }

        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int i = front; //front = 0
        do {
            System.out.print(data[i] + "-> ");
            i++;
            i %= data.length; //if i(index value) become equal or greater than the size of the queue
        }while (i != end);
        System.out.println("END");
    }
}
