package com.Aishwary.SinglyLL;

public class Linked_List {

    Node head; //reference variable that points to the first node of LL
    Node tail; //points to the last node = which points to NULL
    int size;
    Linked_List next; //just not important
    boolean value;

    public Linked_List() {
        this.size = 0;
    }

//    Inserting in a linked List (nodes)

    //2.
    public void insertLast(int val){
        if (tail == null){ //means list is empty
            insertFirst(val); //call this first;
            return; //dont go below
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //3. Insert ata a particular index
    public void insert(int val, int index){ //have made a constructor for the same
        if (index == 0){
            insertFirst(val); //call
            return;
        }
        if (index == size){
            insertLast(val); //call
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) { //if you like to start the index from 1 (index - 1)
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //1.
    public void insertFirst(int val){
        Node node = new Node(val); //making a new node
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

//    deleting in a linked list

    //2. deleting last node

    public int deleteLast(){
        if (size <= 1){ //if there is only one node
            return deleteFirst();
        }
        Node secondLast = get(size - 2); //want to delete the last node and make the secondLast node, last
        int val = tail.value;//storing the value

        tail = secondLast; //after storing
        tail.next = null;

        return val;
    }



    //3.

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1); //just the previous node
        int value = prev.next.value;

        //breaking the chain
        prev.next = prev.next.next;

        return value;

    }

    //4. Finding the node for the value which need to be deleted
    public Node find(int value){
        Node node = head; //start from head
        while (node != null){ //using while because we don't know at which index(node) the value will be found
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null; //if the value is not found which is meant to be deleted
    }

    //as we cannot directly point the node to the previous node in singly linked list
    public Node get(int index){ //returning Node type //returns reference pointer to that node(index)
        Node node = head; //start from head
        for (int i = 0; i < index; i++) {
            node = node.next; //going till the end of LL
        }
        return node; //which has been deleted (last)

    }

    //1.
    public int deleteFirst(){ //returning val
        int val = head.value; //storing the value
        head = head.next; //moving head ahead one place
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }


//    Display the linked list
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> "); //print
            temp = temp.next; //then move to next
        }
        System.out.println("END");
    }

    public class Node{
        int value;
        Node next;

        public Node(int nums) { //constructor
            this.value = nums;
        }

        public Node(int nums, Node next) {
            this.value = nums;
            this.next = next;
        }

    }



//    *****************************************************QUESTIONS***************************************************
    //Q1 remove duplicates

    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if (node.value == node.next.value){
                //skip and move forward
                node.next = node.next.next;
                size--;  //size will be decreased
            }
            else{
                node = node.next; //point to the new(non-duplicate) node
            }
        }
        tail = node;
        tail.next = null;
    }

//******************************************************************************************************************************

    //Q2 Merging two sorted linked list

    public static Linked_List merge(Linked_List first, Linked_List second){
        Node f = first.head;
        Node s = second.head;

        Linked_List ans = new Linked_List();


        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

//******************************************************************************************************************************

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft

    public boolean cycle(Linked_List head) {
        Linked_List fast = head;
        Linked_List slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

//******************************************************************************************************************************

    // find length of the cycle
    public int lengthCycle(Linked_List head) {
        Linked_List fast = head;
        Linked_List slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                Linked_List temp = slow;
                int length = 0;
                do {                    //dont move fast pointer, move slow pointer
                    temp = temp.next;   //when again the slow reaches fast count the distance
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

//******************************************************************************************************************************

    //Find the starting point of the cycle  (using the length of cycle)

    public Linked_List detectCycle(Linked_List head) {
        Linked_List fast = head;
        Linked_List slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                slow = head;

                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

//******************************************************************************************************************************

    //Find if the number is a Happy Number (keep squaring and adding them until the number becomes 1)
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow); //move ahead once
            fast = findSquare(findSquare(fast)); // move ahead twice


        }while (slow != fast);
        if (slow == 1){ //condition for "Happy Number"
            return true;
        }
        return false;
    }

    public int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
//***************************************************************************************************************************

    //Bubble Sort
    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    public void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }

        if (col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value){
                //swap
                if (first == head){
                    head = second; //case 1
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }
        else {
            bubbleSort(row-1, 0);
        }
    }

//*********************************************************************************************************************888

    //reversing a Linked List using recursion

    public void reverse (Node node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next); //keep doing it will the if condition is not satisfied

        tail.next = node;
        tail = node;
        tail.next = null;
    }

//    ****Without using tail****
    public Linked_List reverseList(Linked_List head) {
        if (head == null) {
            return head;
        }
        Linked_List prev = null;
        Linked_List present = head;
        Linked_List next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

//******************************************************************************************************************************
    //inplace reversal of linked list (WITHOUT recursion)

    public void inplaceReversal(){
        if (size < 2){
            return;
        }

        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){ //null pointer exception
                next = next.next;
            }
        }
        head = previous;
    }
//**********************************************************************************************************************

    //Linked list Palindrome

    public Linked_List getMid (Linked_List head) {
        Linked_List fast = head;
        Linked_List slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome (Linked_List head){
        Linked_List mid = getMid(head);
        Linked_List headSecond = reverseList(mid);
        Linked_List reReverseHead = headSecond;

        // compare the two halves
        while (head != null && headSecond != null){
            if (head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reReverseHead);

        if (head == null || headSecond == null){ //has traversed through the whole LL (is a palindrome)
            return true;
        }
        return false;
    }
//******************************************************************************************************************************
    public Linked_List rotateList(Linked_List head, int k){

        if (head == null || head.next == null || k <= 0){
            return head;
        }

        Linked_List last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length; //using if the value of k is bigger than the actual length of the Linked list
        int skip = length - rotations; // skip = newHead of the sub list

        Linked_List newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}

