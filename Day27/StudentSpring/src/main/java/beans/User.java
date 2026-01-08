package beans;

public class User {
    private Sim sim;
    private String userName;
    private String address;

    public User(){

    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String address, String userName) {
        this.address = address;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "sim=" + sim.toString() +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
