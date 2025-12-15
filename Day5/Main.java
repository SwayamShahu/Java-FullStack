package Day5;

import java.util.Scanner;

public class Main {
    static void checkIdPass(String userName, String password){
        if (userName.toLowerCase().equals("Roshan".toLowerCase()) && password.equals("123")){
            System.out.println("Login Successfully");
        }else{
            throw new InvallidLoginException("Invalid User name and password");
        }
    }
    static void main(String[] args) {
        int count = 0;
        while(count < 3){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter User Name: ");
            String userName = sc.nextLine();

            System.out.println("Enter password: ");
            String password = sc.nextLine();
            try {
                checkIdPass(userName, password);
                break;
            }catch (InvallidLoginException e){
                count++;
                System.out.println(e);
            }
        }
    }
}
