package beans;

public class Car {
    private String color;
    private String carNumber;

    public Car() {
    }

    private String seats;
    private Engine engine;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String seats, String carNumber, String color) {
        this.seats = seats;
        this.carNumber = carNumber;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", seats='" + seats + '\'' +
                ", engine=" + engine.toString() +
                '}';
    }
}
