                                 //Breadth First Search (BFS)

// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/description/

// 637. Average of Levels in Binary Tree  (Google question)
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

//Google Question
// (Find the node exactly on the right of the value given in the question)

package TreeQuestions;

    import javax.swing.tree.TreeNode;
    import java.util.*;

                                 public class Questions {
    public TreeNode findSuccessor(TreeNode root, int key){
        if (root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>(); //Use of extra space
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();

            TreeNode currentNode = queue.poll();
//            if (currentNode.left != null){
//                queue.offer(currentNode.left);
//            }
//            if (currentNode.right != null){
//                queue.offer(currentNode.right);
//            }
//            //if the current node that you have removed is equal to the key then stop there
//            if (currentNode.val = key){
//                break;
//            }
        }
        return queue.peek(); //return what ever is left in the queue(there will be only one value) as be had used break
                             //peek() return the element in the front
    }
    //Time and Space complexity is both O(n) (Space complexity may change on the basics of the question)
}


//Google / Amazon / Microsoft question
// 103. Binary Tree Zigzag Level Order Traversal -> using Deque (add and remove from both the sides )
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/


// 107. Binary Tree Level Order Traversal II
// Same as the Level order traversal just printing the level from bottom to top
// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

// 116. Populating Next Right Pointers in Each Node -> Good newly asked interview questions
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

// 199. Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/description/

// 993. Cousins in Binary Tree
// https://leetcode.com/problems/cousins-in-binary-tree/description/

// Google / Amazon / Apple Interview question
// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/description/


                                        // Depth first search (DFS)

// 543. Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree/description/

// 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

// 108. Convert Sorted Array to Binary Search Tree
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

//Facebook
// 114. Flatten Binary Tree to Linked List
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/description/

//Facebook
// 236. Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

//Facebook, microsoft, amazon
// 230. Kth Smallest Element in a BST
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

//Very good questions -> can be done is less time using Hashmaps
// 105. Construct Binary Tree from Preorder and Inorder Traversal
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

//Google/ amazon/ facebook interview question (Hard)
// 297. Serialize and Deserialize Binary Tree
// for future -> do it later

// 112. Path Sum
// https://leetcode.com/problems/path-sum/description/

// 129. Sum Root to Leaf Numbers
// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

// 124. Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/

 //class pathSum{

        //Good Question
// A Binary tree is given and also an array. Your task is to determine if that array is a part of that binary tree
// The array will have the elements starting from the root node to the leaf node is its present in the tree
    /*
        boolean findPath(Node node, int[] arr){
            if (node == null){
                return arr.length == 0; //the length should be 0 also
            }
            return helper(node, arr, 0);
        }
        boolean helper(Node node, int[] arr, int index) {
            if (node == null) {
                return false;
            }
            if (index >= arr.length || node.val != arr[index]) {
                return false;
            }

            if (node.left == null && node.right == null && index == arr.length - 1) { // leaf node
                return true;
            }
            //otherwise recursion calls
            return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
        }
    */

    //Question) Count every path sum
    // Given a binary tree and the sum. Find all the paths that makes will make it equal to the sum
    // the trick (hard part) -> the path can also be made with or without using/ going through the root node
    // return the count = number of paths

    /*
        int countPath(Node node, int sum){
            List<Integer> path = new ArrayList<>();
            return helper(node, sum, path);
        }
        int helper(Node node, int sum, List<Integer> path){
            if (node == null){
                return 0; //no path exists
            }

            path.add(node.val);
            int count = 0; //final answer
            int s = 0;

            // how many paths I can make
            ListIterator<Integer> itr = path.listIterator(path.size()); //allows us to traverse in both (forward and backward direction)
            while (itr.hasPrevious()){
                s += itr.previous();

                if (s == sum){
                    count++;
                }
            }

            count += helper(node.left, sum, path) + helper(node.right, sum, path); // left and right side will return 1

            //using backtracking (as its saves memory and space) -> no need to use a copy of the list rather make changes to the same list
            path.remove(path.size() - 1);
            return count;
        }
    */

    //same question as the above one just this time return all the paths rather just counting them
    //same every path in a list of lists

    //same logic as the above one but just return the list of lists

    /*
    List<List<Integer>> findPaths(Node node, int sum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path, paths);
        return paths;
    }
    int helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths){
        if (node == null){
            return 0; //no path exists
        }

        path.add(node.val);
        //Finding all the paths that are from root to leaf node

        if (node.val == sum && node.left == null && node.right == null){ //leaf node
            //adding the answer to paths
            paths.add(new ArrayList<>(path));
        }
        else {
            helper(node.left, sum - node.val, path, paths);
            helper(node.right, sum - node.val, path, paths);
        }

        //Backtracking
        paths.remove(path.size() - 1);
    }
    */
//}