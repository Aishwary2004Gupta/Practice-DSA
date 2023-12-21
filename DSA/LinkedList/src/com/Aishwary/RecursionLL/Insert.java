package com.Aishwary.RecursionLL;

public class Insert {
    Node head;
    Node tail;
    int size;

    public Insert() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Insert.Node node = new Insert.Node(val); //making a new node
        node.next = head;
        head = node;
        size++;

        //before adding the node (head was null)
        if (tail == null){ //if the LL is empty
            tail = head; //this is the first item being added then tail and head will be pointing to the same single node
        }
        //can use it here also
        //size++;
    }

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);

    }
    private Node insertRec(int val, int index, Node node){
        if (index == 0){ //when the index is zero
            Node temp = new Node(val, node); //node = current node (make a new node)
            size++; //increase the size
            return temp;
        }
        node.next = insertRec(val, index-1, node.next); //(current node)
        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> "); //print
            temp = temp.next; //then move to next
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
