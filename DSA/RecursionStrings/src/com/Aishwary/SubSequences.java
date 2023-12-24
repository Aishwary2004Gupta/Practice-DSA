package com.Aishwary;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
//        subSeq("", "abc");
//        System.out.println(subSeqReturn("", "abc"));// prints an ArrayList
//        subSeqAscii("", "abc");
        System.out.println(subSeqAsciiReturn("", "abc"));

    }
    static void subSeq(String p, String up){ //p = processed, up = unprocessed
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        //make two recursion calls
        subSeq(p + ch, up.substring(1)); //add it
        subSeq(p, up.substring(1)); //rejecting it
    }

    //returning a ArrayList of string
    static ArrayList<String> subSeqReturn(String p, String up){ //p = processed, up = unprocessed
        if (up.isEmpty()){ //returning answer in the base condition
                            //but getting answers from below calls
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        //make two recursion calls
        ArrayList<String> left =  subSeqReturn(p + ch, up.substring(1)); //add it
        ArrayList<String> right = subSeqReturn(p, up.substring(1)); //rejecting it

        left.addAll(right); // left + right
        return left; //or right both are same
    }


    //printing the ASCII value also
    static void subSeqAscii(String p, String up){ //p = processed, up = unprocessed
        if (up.isEmpty()){
            System.out.println(p + " ");
            return;
        }
        char ch = up.charAt(0);

        //make two recursion calls
        subSeqAscii(p + ch, up.substring(1)); //add it
        subSeqAscii(p, up.substring(1)); //rejecting it
        subSeqAscii(p + (ch + 0), up.substring(1)); //Ascii value

    }


    //returning a ArrayList of string's Ascii value
    static ArrayList<String> subSeqAsciiReturn(String p, String up){ //p = processed, up = unprocessed
        if (up.isEmpty()){ //returning answer in the base condition
            //but getting answers from below calls
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        //make two recursion calls
        ArrayList<String> first =  subSeqAsciiReturn(p + ch, up.substring(1)); //add it
        ArrayList<String> second = subSeqAsciiReturn(p, up.substring(1)); //rejecting it
        ArrayList<String> third = subSeqAsciiReturn(p+(ch+0), up.substring(1)); //Ascii value


        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
