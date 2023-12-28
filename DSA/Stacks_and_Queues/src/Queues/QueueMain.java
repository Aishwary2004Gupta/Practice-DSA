package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        /**
        CustomQueue queue = new CustomQueue(5);
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);

        queue.display();
//        System.out.println(queue.remove()); //prints the element which is removed (1st)
        System.out.println(queue.front());

        queue.display();

         **/

        CircularQueue queue = new DynamicQueue(5);
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.display();


    }
}
