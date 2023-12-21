package com.Aishwary.SinglyLL;

public class MergeSortLL {

    //Q MergeSort

    public Linked_List sortList(Linked_List head){
        if (head != null || head.next != null){
            return head;
        }
        Linked_List mid = getMid(head);
        Linked_List left = sortList(head);
        Linked_List right = sortList(mid);

        return merge(left, right);
    }

    // Merging two sorted linked list

    Linked_List merge(Linked_List first, Linked_List second){
        Linked_List.Node f = first.head;
        Linked_List.Node s = second.head;

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

    //Middle

    public Linked_List getMid (Linked_List head) {
        Linked_List fast = head;
        Linked_List slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

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


//    ListNode getMid(ListNode head){
//        ListNode midPrev = null;
//        while (head != null && head.next != null){
//            midPrev = (midPrev == null) ? head : midPrev.next;
//            head = head.next.next;
//        }
//        ListNode mid = midPrev.next;
//        midPrev.next = null;
//        return mid.next;
//    }
}


