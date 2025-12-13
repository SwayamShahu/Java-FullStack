package Day4;

public class Vehicle {
    private int noOfWheels;
    private int speed;
    private String fuelType;
    private String engineType;
    private String name;

    public Vehicle(int noOfWheels) {
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Vehicle(int noOfWheels , String name) {
        this.noOfWheels = noOfWheels;
        this.speed = 80;
        this.fuelType = "Unknown";
        this.engineType="Unknown";
        this.name = name;
    }

    public Vehicle(int noOfWheels, int speed, String fuelType, String engineType, String name) {
        this.noOfWheels = noOfWheels;
        this.speed = speed;
        this.fuelType = fuelType;
        this.engineType = engineType;
        this.name = name;
    }

    public void start(){
        System.out.println(" Vehicle Started");
    }
}

