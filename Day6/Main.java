package Day6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        boolean start = true;
        File file = new File("ConsoleAppFile.txt");

        try {
            if (file.createNewFile()){
                System.out.println("New file created.");

            }else{
                System.out.println("Already file created !!");
            }
        }catch (IOException e){
            System.out.println(e);
        }
        WriteFile wf = new WriteFile(file.getAbsolutePath());
        Scanner sc = new Scanner(System.in);
        int choice;
        String data;
        while (start){
            System.out.println("Enter: 1. Change Data");
            System.out.println("Enter: 2. Read Current Data");
            System.out.println("Enter: 3. Append data");
            System.out.println("Enter: 4. Exit");
            System.out.print("Enter Now: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter data to be added in the file: ");
                    data = sc.nextLine();
                    wf.writeData(data);
                    break;
                case 2:
                    wf.seeData();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter data to be added in the file: ");
                    data = sc.nextLine();
                    wf.appendData(data);
                    break;
                case 4:
                    start = false;
                    break;
                default:
                    System.out.println("You Enter wrong option.");
                    break;
            }
        }
    }
}
