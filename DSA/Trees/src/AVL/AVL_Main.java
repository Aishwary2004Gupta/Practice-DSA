package AVL;

import AVL.AVL;

public class AVL_Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        //inserting the elements in ascending order (which will make the tree unbalanced)

        for (int i = 0; i < 1000; i++) { //if we had used BST the height would be 1000 (0(N))
            tree.insert(i);
        }
        System.out.println(tree.height()); //height is 3 (O(log(N)))
    }
}
