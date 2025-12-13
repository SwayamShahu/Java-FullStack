package Day4;

public interface Payment {
    void pay();
    default void cardPayment(){

    }
}
