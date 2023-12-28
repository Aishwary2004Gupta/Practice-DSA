package Questions;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){ //peek() -> just look at the elements do not pop it
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        //need to do this for all the elements inside the stack
        int i = heights.length;
        while (!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) { //is the smallest element
            area = arr[popped] * i;
        }
        else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}
