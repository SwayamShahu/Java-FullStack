package Day5;

import java.util.Scanner;

public class ExceptionApp1 {

    public static void checkMarks(int marks) throws InvalidMarks{
        if(marks < 35){
            throw new InvalidMarks("Marks should be grater than 35 !!!");
        }
        System.out.println("Valid Marks.....");
    }

    static int divide(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter 2st Number: ");
        int b = sc.nextInt();
        System.out.println();
        int c = -1;
        try {
            c = a/b;
            System.out.println("On dividing: " + c);
        }catch (Exception e){
            System.out.println(e);
        }
        return c;
    }


    static void main(String[] args) {
//        int[] arr = new int[10];
//        try{
////            int a = 10;
////            int b = 0;
////            int c = a/b;
//            String str = null;
//            System.out.println(str.length());
//
//
//        } catch (Exception e) {
////            System.out.println("Arithmetic Exception Occurs: Dividing by Zero !!");
//            System.out.print("Exception Occur: ");
//            System.out.println(e);
//        }

//        try {
//            int a = 10;
//            int b = 0;
//            System.out.println(a/b);
//            System.out.println("Try End !!!");
//
//        }catch (NullPointerException e){
//            System.out.println(e);
//        } catch (ArithmeticException e){
//            System.out.println(e);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("Finally block running here !!!!!!!");
//        }

//       divide();
//        checkMarks(32);
//        System.out.println("Hey");
        try{
            checkMarks(32);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Hey");
    }
}
