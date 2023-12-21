package com.Aishwary.SinglyLL;

class Palindrome {

    public class Node{
        int value;
        Linked_List.Node next;

        public Node(int nums) { //constructor
            this.value = nums;
        }

        public Node(int nums, Linked_List.Node next) {
            this.value = nums;
            this.next = next;
        }
    }

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

        if (head == null || headSecond == null){ 
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);

        list.display();
        list.isPalindrome(list);
    }
}