//Advantages of using StringBuffer rather than using normal String
// -> mutable sequence of character (can make changes without the need of making a new object)

import java.text.DecimalFormat;
import java.util.Arrays;

class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("A cache of the last value returned by toString. Cleared whenever the StringBuffer is modified.");

        String str = sb.toString();
        System.out.println(str);


        String sentance = "Hi , What is y o ur na m e";
        System.out.println(sentance);


        // remove all the spaces in between
        System.out.println(sentance.replaceAll("\\s", ""));

        //rounding of
        DecimalFormat num = new DecimalFormat("000.00");
        System.out.println(num.format(11.1));

        //split
        String lang = "English   French German Hindi Greek";
        String[] name = lang.split(" "); // will split it from wherever it finds spaces
        System.out.println(Arrays.toString(name)); // to print array of string
    }
}