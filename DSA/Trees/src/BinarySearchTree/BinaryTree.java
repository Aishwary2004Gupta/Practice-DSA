package BinarySearchTree;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
//        tree.display();
        tree.betterDisplay();
   }
   private static class Node{
        int value;
        Node left;
        Node right;

       //When creating a new node (need toh initialise the value)
       public Node(int value) { //constructor of value
           this.value = value;
       }
   }
   private Node root;

    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner, root); //this will be the last function call (after coming out from this)
                                 //tree will be over
    }

    private void populate(Scanner scanner, Node root) {
        //left side
        System.out.println("Do you want to insert left of " + root.value);
        boolean left = scanner.nextBoolean(); //as inputs, it will only take true or false
        if (left) { //true
            System.out.println("Enter the value on the left of " + root.value);
            int value = scanner.nextInt();
            root.left = new Node(value); //the element that is being insert on the left is a new value
            populate(scanner, root.left); // recursive call
        }
        //right side
        System.out.println("Do you want to insert right of " + root.value);
        boolean right = scanner.nextBoolean();
        if (right) { //true
            System.out.println("Enter the value on the right of " + root.value);
            int value = scanner.nextInt();
            root.right = new Node(value); //the element that is being insert on the left is a new value
            populate(scanner, root.right);
        }
        //when entered false the function will come out of the last function call
    }
    //Displaying
    public void display(){
        display(root, ""); // "" = indentation = empty space between elements
    }

    private void display(Node root, String s) {
        if (root == null){
            return;
        }
        System.out.println(s + root.value);
        display(root.left, s + "\t");
        display(root.right, s + "\t");
    }

    //Making the display function look better
    public void betterDisplay(){
        betterDisplay(root, 0);
    }

    private void betterDisplay(Node root, int level) {
        if (root == null){
            return;
        }
        betterDisplay(root.right, level + 1); //first printing the right most element (as it will be on the top)

        if (level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + root.value);
        }
        else {
            System.out.println(root.value);
        }
        //right is done so do the same thing for left
        betterDisplay(root.left, level + 1);
    }

}