import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;
    private int transactionId = counter;
    private double amount;
    private String type;
    private double balanceAfter;
    private String note;
    private LocalDateTime createdAt;


    // Constructor 1
    Transaction(double amount, String type, double balance){
        this.amount = amount;
        this.type = type;
        this.balanceAfter = balance;
        this.transactionId = counter++;
        this.createdAt = LocalDateTime.now();
    }

    // Constructor 2
    Transaction(double amount, String type, double balance, String note){
        this.amount = amount;
        this.type = type;
        this.balanceAfter = balance;
        this.note = note;
        this.transactionId = counter++;
        this.createdAt = LocalDateTime.now();
    }

    public String getRecord(){
        String record = transactionId + " | " + amount + " | " + type + " | " + balanceAfter + " | " + note + " | " + createdAt;
        return record;
    }

    public String getType(){
        return type;
    }


}
