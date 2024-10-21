package SegmentTree;
import org.w3c.dom.Node;

class SegmentTree {

    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node (int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        //create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) { //start index and end index (1,1) (4,4)
        if (start == end){ // this will be the last thing to run while constructing the tree
            //leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start]; //leaf node will contain the element at that index
            return leaf;
        }

        //create a new node with the index you are currently at
        Node node = new Node(start, end);
        int mid = (start + end)/ 2;

        //updating left and right
        node.left = this.constructTree(arr, start, mid );
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node; //that contains the added data
    }

    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    //query
    public int query(int qsi, int qei){ //(query start index, query end index)
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei){
            //Case 1 (the node is completely inside the query)
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            //Case 2 (completely outside (do not consider it))
            return 0;
        } else {
            //Case 3 (Overlapping)
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei); //cannot change the query index
        }
    }

    //update
    public void update(int index, int value){ //these are known as the helper function //so that the user do not interact with the code rather just the inputs
        this.root.data = update(this.root, index, value); //internally this will call the below function
    }

    private int update(Node node, int index, int value){ //update the value on the for a given index
        //Case 1 (index lies in the interval)
        if (index >= node.startInterval && index <= node.endInterval){
            if (index == root.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } //Case 2 (not fully inside the intervals)
            else { // (partially inside)
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        //Case 3 (when completely outside)
        return node.data; //without changing anything return the old values
    }
}
