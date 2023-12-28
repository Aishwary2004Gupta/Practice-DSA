package File_Handling;

import java.io.*;

public class Outputs {
    public static void main(String[] args) {
        OutputStream os = System.out;
//        os.write(😅); //not possible (range is extended)

        /*
                                 // OutputStreamWriter

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello everyone ");
            osw.write('W');
            osw.write('\n'); //10 also means a new line
            osw.write(100);
            osw.write(10);
            char[] arr = "Good Morning".toCharArray();
            osw.write(arr);

//            os.write(😅);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

                                            // FileWriter
                                    //write in a file (or is not empty will overwrite on it)

        try(FileWriter fw = new FileWriter("notes.txt")){
            fw.write("Hello everyone "); // overwrite
            // but if we want to append just use ,true


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

   // but if we want to append just use ,true
        try(FileWriter fw = new FileWriter("notes.txt",true)){
            fw.write("this should be appended"); // overwrite



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // overwrite in the file from a character stream
//        try (BufferedWriter br = new BufferedWriter(new FileWriter("notes.txt"))){
//            br.write("ok"); //overwrites
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
