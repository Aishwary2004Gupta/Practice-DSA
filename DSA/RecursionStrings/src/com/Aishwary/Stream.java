package com.Aishwary;

public class Stream {
    public static void main(String[] args) {
//        skip("", "asdafawa");//initially processed is empty
//        System.out.println(skip("asdfaw"));
//        System.out.println(skipApple("asdapplefaw"));
        System.out.println(skipAppNotApple("abdapplekea"));

    }
    static void skip(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed); //final answer
            return;
        }
        char ch = unprocessed.charAt(0);

        if (ch == 'a'){
            //skip it
            skip(processed, unprocessed.substring(1)); //from index no. 1

        }else {
            //print it
            skip(processed + ch, unprocessed.substring(1) );

        }
    }


    //returning a string (returns the same answer like the above one)
    static String skip(String unprocessed){
        if (unprocessed.isEmpty()){
            return ""; //empty
        }
        char ch = unprocessed.charAt(0);

        if (ch == 'a'){ //or unprocessed.startsWith("a")
            //skip it
            return skip(unprocessed.substring(1)); //from index no. 1

        }else {
            //when ch != 'a'
            return ch + skip(unprocessed.substring(1));
            //current answer + whatever you are getting from recursion

        }
    }

    //Skip a string
    static String skipApple(String unprocessed){
        if (unprocessed.isEmpty()){
            return ""; //empty
        }

        if (unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5)); //skip the first 5 char

        }else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }

    //skip app if not apple
    static String skipAppNotApple(String unprocessed){
        if (unprocessed.isEmpty()){
            return ""; //empty
        }

        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(3));

        }else {
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
