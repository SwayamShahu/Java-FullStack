package Day6;

import java.io.FileWriter;

public class WriteFile {
    public WriteFile(String path, String data){
        try{
            FileWriter fw = new FileWriter(path);
            fw.write(data);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void changeData(String filePath, String data){
        try{
            FileWriter fw = new FileWriter(filePath);
            fw.write(data);
            fw.close();
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
