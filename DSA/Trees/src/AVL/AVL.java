package AVL;
//Same as the code for BST just adding a new method rotate to make the tree balanced if its not balanced (self-balancing tree)

class AVL {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {

    }

    public int height(){
        return height(root);
    }

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null; // it will be empty when
    }

    //inserting in a BinaryTree.BST (Binary Search Tree)
    public void insert(int value){
        //in the end root is called so
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if (node == null){ //this is called when there isn't an element already present in the tree
            // so create the value
            node = new Node(value);
            //then return that value
            return node;
        }

        //making no changes in the tree (just checking if the new element will be placed on the right or left)
        if (value < node.value){ //smaller = left
            node.left = insert(value, node.left); // the already added node would not change
            // it will only insert where there is no already placed node
        }

        if (value > node.value){ //greater = right
            node.right = insert(value, node.right);
        }
        //height will change every time any node is inserted so
        node.height = Math.max(height(node.left), height(node.right) + 1); //formula to get the max height
        // +1 (as checking from the node below the one that we want max height for)

        //last call
        return rotate(node); //fixing the structure of the tree then returning the node itself
    }

    //will run if the tree is not balanced
    private Node rotate(Node node) { //rotate
        //4 cases
        if (height(node.left) - height(node.right) > 1) { //left side is heavier than the right side
            //left heavy - Case 1 and 2
            if (height(node.left.left) - height(node.left.right) > 0) {//positive
                //left left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {//negative
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            //right heavy - Case 3 and 4
            if (height(node.right.right) - height(node.right.left) > 0) {//positive
                //right right case
                return leftRotate(node);
            }
            if (height(node.right.right) - height(node.right.left) < 0) {//negative
                //right left case
                node.left = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node; //normally if no need to rotate
    }

    private Node rightRotate(Node p) { //p is the parent node
        Node c = p.left;
        Node t = p.left.right; // or c.right (the same thing)
        c.right = p;
        p.left = t;

        //update the height
        p.height = Math.max(height(p.left), height(p.right) + 1); //new height
        c.height = Math.max(height(c.left), height(c.right) + 1); //new height

        //now the new parent node is c
        return c; //returning the node

    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = c.right.left; //or p.left (same thing)
        p.left = c;
        c.right = t;

        //update the height
        p.height = Math.max(height(p.left), height(p.right) + 1); //new height
        c.height = Math.max(height(c.left), height(c.right) + 1); //new height

        //now the new parent node is p
        return p; //returning the node
    }

    //want to return multiple items
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]); //so that the user do not have to right insert function in the command line (main) again and again
        }
    }

    //To solve the problem of efficiency (if the elements given "are" in sorted order)
    public void populateBalanced(int[] nums){
        populateBalanced(nums, 0, nums.length); //(nums, start, end)
    }

    private void populateBalanced(int[] nums, int start, int end) { //only in the case of sorted arrays(elements)
        if (start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        //now just insert the mid element
        this.insert(nums[mid]);
        //now do the same thing for left and right
        populateBalanced(nums, start, mid); //left
        populateBalanced(nums, mid + 1, end); //right
    }

    //checking if the TREE is balanced or not
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null){ // node is a leaf node (at the bottom (with no child))
            return true; //true because (Null is already <= 1 (satisfies the condition))
        }
//check for the root (final height from the root node should be less then equal to 1) and as well as for the subtrees
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root Node: ");
    }

    public void display(Node node, String details){ //will display the node and also the info about that node
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue()); //Firstly the root node will be displayed
        //left
        display(node.left, "Left child of " + node.getValue() + " : ");
        //right
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    //3 different types of Traversals
    // Pre-Order
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //In-Order
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    //Post-Order
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");

    }

}
