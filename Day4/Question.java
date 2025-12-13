package Day4;

import java.util.Scanner;

public class Question {
    public void removeLeadingZero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
//        int i;
//        for(i = 0; i < str.length(); i++){
//            if (str.charAt(i) != '0'){
//               break;
//            }
//        }
//        System.out.println(str.substring(i));

        System.out.println(str.replaceFirst("^0+",""));
    }
}
