package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class inBuildExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); //is a interface not class
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.remove());  //No such element exception
//        System.out.println(queue.poll()); //if the queue is empty do not give exception by return null
                                          // the only difference between poll and remove


    }
}