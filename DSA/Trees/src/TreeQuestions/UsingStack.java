package TreeQuestions;
import java.util.Stack;

public class UsingStack {

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    //DFS using stack rather than recursion
    //have no additional benefits rather using recursion is better as its easier and have good time/space complexity

    void dfsStack(Node node){
        if (node == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node); // initially (starting) with root node

        while (!stack.isEmpty()){
            Node removed = stack.pop(); //removing from the stack
            System.out.println(removed.value + " "); // the node that will be removed will be printed

            if (removed.right != null){
                stack.push(removed.right); //push right first (as want to remove left first)
            }

            if (removed.left != null){
                stack.push(removed.left);
            }
            System.out.println();
        }
    }
}
