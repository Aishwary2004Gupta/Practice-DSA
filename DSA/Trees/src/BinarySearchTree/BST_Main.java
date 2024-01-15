package BinarySearchTree;

public class BST_Main {
    public static void main(String[] args) {
        BST tree = new BST();

//        int[] nums = {15, 10, 5, 8, 20, 14};
//        tree.populate(nums); // calling the insert function inside the populate function
//        tree.display();

        int[] nums = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10};
        tree.populateBalanced(nums); //if the elements are in sorted order (this will make sure to make in a balanced tree)
        tree.display();

//        tree.preOrder();
//        tree.inOrder();
//        tree.postOrder();

        System.out.println(tree.balanced()); //tells if the tree is balanced or not
    }
    //NOTE* : Problem (when the nums(elements) are in sorted order)
    //       -> the time complexity becomes O(N) -> not efficient (no use of BST)

    //       : Solution (using the populateBalanced function)
//             -> this will make the complexity O(N log N) which is better than O(N)
//                                              -> as for loop is running n times and for ding any operation it takes O(log N)

}

