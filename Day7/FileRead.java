package Day7;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
    static void main(String[] args) {
        try{
            /* File Reader
            FileReader fr = new FileReader("bufferText.txt");
            int ch;
            while((ch= fr.read()) != -1){
                System.out.print((char)ch);
            }
            */

            // Buffer Reader
            BufferedReader br = new BufferedReader(new FileReader("bufferText.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
