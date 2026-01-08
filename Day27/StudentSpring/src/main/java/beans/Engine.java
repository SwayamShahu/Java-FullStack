package beans;

public class Engine {
    private String maxSpeed;
    private String engineType;

    public Engine() {
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "maxSpeed='" + maxSpeed + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
