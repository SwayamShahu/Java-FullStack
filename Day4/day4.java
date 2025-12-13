package Day4;

import java.util.Scanner;

public class day4 {
    static void createCar(){
        Scanner sc = new Scanner(System.in);
        //int noOfWheels, int speed, String fuelType, String engineType, String name,int doors , int noOfSeats
        System.out.print("Enter number of wheels: ");
        int noOfWheels = sc.nextInt();
        System.out.println();

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.print("Enter fuelType: ");
        String fuelType = sc.nextLine();
        System.out.println();

        System.out.print("Enter engineType: ");
        String engineType = sc.nextLine();
        System.out.println();

        System.out.print("Enter name of the car: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Enter doors: ");
        int doors = sc.nextInt();
        System.out.println();

        System.out.print("Enter noOfSeats: ");
        int noOfSeats = sc.nextInt();
        System.out.println();

        Car C = new Car(noOfWheels,speed,fuelType,engineType,name,doors,noOfSeats);

        System.out.println("Car Created !!!!!");
    }

    static void createBike(){
//        int noOfWheels, int speed, String fuelType, String engineType, String name,boolean handle , boolean helment
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of wheels: ");
        int noOfWheels = sc.nextInt();
        System.out.println();

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.print("Enter fuelType: ");
        String fuelType = sc.nextLine();
        System.out.println();

        System.out.print("Enter engineType: ");
        String engineType = sc.nextLine();
        System.out.println();

        System.out.print("Enter name of the bike: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Enter Handle (true or false): ");
        boolean handle;
        String handleInput = sc.next();
        if (handleInput.toLowerCase().equals("true")){
            handle = true;
        }else{
            handle = false;
        }
        System.out.println();

        System.out.print("Enter Helment (true or false): ");
        boolean helment;
        String helmentInput = sc.next();
        if (helmentInput.toLowerCase().equals("true")){
            helment = true;
        }else{
            helment = false;
        }
        System.out.println();

        Bike b = new Bike(noOfWheels,speed,fuelType,engineType,name,handle,helment);


        System.out.println("Bike Created !!!!!");
    }

    static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Welcome to Vehicle Development System");
        System.out.println("Enter 1: Car");
        System.out.println("Enter 2: Bike");
        System.out.println("Enter 3: Exit from System");
        System.out.println("------------------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number Now: ");
        int num = sc.nextInt();
        System.out.println("------------------------------------");
        switch (num){
            case 1:
                System.out.println("------------------------------------");
                createCar();
                System.out.println("------------------------------------");
                break;
            case 2:
                System.out.println("------------------------------------");
                createBike();
                System.out.println("------------------------------------");
                break;
            case 3:
                break;
        }
    }
}
