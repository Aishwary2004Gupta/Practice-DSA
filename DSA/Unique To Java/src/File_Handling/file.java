package File_Handling;

import java.io.*;

public class file {
    public static void main(String[] args) {
        //creating a new file
        try {
            File fo = new File("new_file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //writing in the file
        try {
            FileWriter fw = new FileWriter("new_file.txt");
            fw.write("जीवन की कहानी , अधुरी है बिन पानी"); // can write in any language
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //reading the file
        try (BufferedReader br = new BufferedReader(new FileReader("new_file.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //create and delete a file
        try {
            File fo = new File("random.txt");
            fo.createNewFile();

            if(fo.delete()){ // delete
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
