import java.util.Scanner;

public class Questions {
    public void studentsMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int  marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }

    public void week(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int  day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void countAllDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num == 0){
            System.out.println("Number of digits: 1");
            return;
        }
        if (num < 0){
            num = num * -1;
        }
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }


        System.out.println("Number of digits: " + count);
    }

    public void reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean flag = false;
        int num = sc.nextInt();
        if (num < 0){
            num = num * -1;
            flag = true;
        }

        int newNumber = 0;

        while (num > 0){
            newNumber = newNumber * 10 + (num % 10);
            num = num / 10;
        }
        if (flag){
            newNumber = newNumber * -1;
        }
        System.out.println("Reverse Number is: " + newNumber);
    }

    public void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0){
            num = num * -1;
        }
        int givenNumber = num;
        int newNumber = 0;

        while (num > 0){
            newNumber = newNumber * 10 + (num % 10);
            num = num / 10;
        }

        if (newNumber == givenNumber){
            System.out.println("Number is  a Palindrome");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }

}
