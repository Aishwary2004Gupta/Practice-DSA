package Queues;

public class DynamicQueue extends CircularQueue{
    CircularQueue queue = new DynamicQueue();
    public DynamicQueue(){
        super(); //CircularQueue (parent class)
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) { //if we want to insert elements more then the size of the queue without any error
        if (this.isFull()){ //this - calls the class which is directly above it
            int[] temp = new int[data.length * 2]; //if its full double the size

            for (int i = 0; i < data.length; i++) { //starting from front (at front i will be 0)
                                                    //when i value is greater than the value of data it will terminate
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);

    }
}
