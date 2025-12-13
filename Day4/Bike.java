package Day4;

public class Bike extends Vehicle{

    private boolean handle = true;
    private boolean helment;

    public Bike(int noOfWheels) {
        super(noOfWheels);
    }


    public Bike(int noOfWheels, int speed, String fuelType, String engineType, String name,boolean handle , boolean helment) {
        super(noOfWheels, speed, fuelType,engineType, name);
        this.handle = handle;
        this.helment = helment;
    }

    @Override
    public void start(){
        System.out.println("Bike Start !!!!!");
    }

}
