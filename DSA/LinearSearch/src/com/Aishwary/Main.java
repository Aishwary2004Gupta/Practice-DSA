public class Main {
    public static void main(String[] args) {
        int[] num = {23, 12, 45, 52, -32, 19};
        int target = 12;
        int ans = linearSearch(num, target); //-1 or 1 (returns the index at while the item(element) is present)
//        int ans = linearSearch2(num, target);
//        boolean ans = linearSearch3(num, target); //(returns true or false)
        System.out.println(ans);

    }
    //Search the target and return true or false

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;

            }

            //otherwise this line will execute if none of the above return statements have executed
            //hence no target it found return -1

        }
        return false;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Search the target and return itself

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;

            }

            //otherwise this line will execute if none of the above return statements have executed
            //hence no target it found return -1

        }
        return Integer.MAX_VALUE;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // search in the array, return the index if the item is found
// otherwise if the item is not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;

            }

            //otherwise this line will execute if none of the above return statements have executed
            //hence no target it found return -1

        }
        return -1;
    }
}