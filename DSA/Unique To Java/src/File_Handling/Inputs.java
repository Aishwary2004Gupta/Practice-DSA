package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader; //converts byte stream to character Stream

//try-catch block automatically closes
//The try-with-resources statement ensures that each resource is closed at the end of the statement.

public class Inputs {
    public static void main(String[] args) {

                                     // InputStreamReader
    /*
        try (InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter any integer: ");
            int integer = isr.read();

            while(isr.ready()){ // Tells whether this stream is ready to be read
                System.out.println((char) integer); //converting byte stream to character Stream
                integer = isr.read();
            }
            System.out.println();
        } catch (IOException e) { //if there is any problem there will an exception thrown
            throw new RuntimeException(e);

//            System.out.println(e.getMessage());
        }
    */

                                          // FileReader

        /*
        try (FileReader fr = new FileReader("notes.txt")) { //opening a file
            int integer = fr.read(); //cannot use char (because read return int)

            while(fr.ready()){
                System.out.println((char) integer);
                integer = fr.read();
            }
            System.out.println();

        } catch (IOException e) { //if there isn't any file with that specific name this will run
            System.out.println(e.getMessage());
        }
        */

                                    // BufferedReader
                            // read text from a character stream.
        // byte to char stream then reading the char file

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ // cannot directly use System.in as ⬆️
            System.out.println("You wrote: " + br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    // reading the file from a character stream
        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
