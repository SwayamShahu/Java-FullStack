package Day4;

public class Car extends Vehicle{
    int doors;
    int noOfSeats;

    public Car(int noOfWheels, int speed, String fuelType, String engineType, String name,int doors , int noOfSeats) {
        super(noOfWheels, speed, fuelType,engineType, name);
        this.doors = doors;
        this.noOfSeats = noOfSeats;
    }
}
