package Day6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    String currentData;
    String path;
    public WriteFile(String path){
        this.path = path;
    }
    public WriteFile(String path, String data){
        try{
            this.path = path;
            FileWriter fw = new FileWriter(path);
            fw.write(data);
            this.currentData = data;
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void changeData(String data){
        try{
            FileWriter fw = new FileWriter(path);
            fw.write(data);
            this.currentData = data;
            fw.close();
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }


    public String writeData(String data){
        String oldData = this.currentData;
        this.currentData = data;
        try{
            FileWriter fw = new FileWriter(path);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return oldData;
    }

    public void seeData(){
        System.out.println("File contain is: " + this.currentData);
    }

    public void appendData(String data){
        try{
            FileWriter fw = new FileWriter(path, true);
            fw.append(data);
            this.currentData = this.currentData + data;
            System.out.println("Content added.");
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
