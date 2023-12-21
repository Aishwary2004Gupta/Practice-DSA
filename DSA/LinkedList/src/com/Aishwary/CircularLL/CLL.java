package com.Aishwary.CircularLL;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert (int val){
        Node node = new Node(val);
        if (head == null){ //empty list
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head; //starting
        if (head != null){
            do { //as there is no null after the last node thats why we need to use do
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);  //till node is not equal to head again
        }
        System.out.println("AgainHead");
    }

    //Deleting a particular value
    public void delete(int val){
        Node node = head; //start
        if (node == null){
            return;
        }
        if (node.val == val){ //moving forward //if the head val is the one which needed to be deleted
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head); //end  // will keep doing this until this happens
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
