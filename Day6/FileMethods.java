package Day6;

import java.io.File;

public class FileMethods {
     /* Operation in files
     1. Open files
     2. Read from files
     3. Write to files
     4. Add files
     5. Close files
      */

    /* Files Types
     Text file -> .csv .json ,txt | Human Readable
     Binary file -> .dat .sh .exe | Machine Readable
    */

    /* Path
     Absolute Path -> Path from desktop file
     Relative Path -> Path from current directory
    */

    static void main(String[] args) {
        try{
            File file = new File("myfile.txt");
            System.out.println("File created !!!");
            if(file.createNewFile()){
                System.out.println("Path of file: " + file.getAbsolutePath() );
            }else{
                System.out.println("File already exist and it path is: " + file.getAbsolutePath() );
            }
            WriteFile wf = new WriteFile(file.getAbsolutePath(), "Hello World");
            wf.changeData("Hey, My Name is Swayam");
//            System.out.println(file.canRead());
//            System.out.println(file.length());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
