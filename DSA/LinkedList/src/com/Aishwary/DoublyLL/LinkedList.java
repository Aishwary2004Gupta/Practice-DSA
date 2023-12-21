package com.Aishwary.DoublyLL;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    //Insert at first position

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null){  //head may be null if inserting for the very first time
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head; //here node is a temp variable (taking to note change the structure of the LL)
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node; //at the end of the while loop this will point to the last node
            node = node.next; //after printing move the value ahead
        }
        System.out.println("End");

//        System.out.println("Print in Reverse");
//        while (last != null) { // if not empty  //here last represents first node
//            System.out.print(last.value + " -> "); //first print then ⬇️
//            last = last.prev; //move backwards
//        }
//        System.out.println("End/ Start");
    }

    //Insert in last without using tail

    public void insertLast (int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return; //no need to move forward
        }

        while (last.next != null){ //last.next will give error if head was null (problem solved in above line)
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null; //if the value is not found which is meant to be deleted
    }

    //Insert after the node which will be provided
    public void insertAfter(int afterVal, int val){
        Node temp = find(afterVal);

        if (temp == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;

        if(node.next != null) {
            node.next.prev = node;
        }
    }



    class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
