class Wallet{
    private String ownerName;
    private double balance;

    Wallet(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void addMoney(double amount){
        System.out.println("Adding Amount: "+amount);
        this.balance = this.balance + amount;
        System.out.println("Money Added");
    }

    public void payMoney(double amount){
        System.out.println("Paying amount: "+amount);
        if(this.balance >= amount){
            this.balance = this.balance - amount;
            System.out.println("Payment Done");
        }else{
            System.out.println("Fail!!");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ balance);
    }
}

public class WalletProblem {
    public static void main(String[] args) {
        Wallet p1 = new Wallet("Swayam", 5500);
        p1.getBalance();

        p1.setBalance(10500);

        p1.addMoney(500);

        p1.checkBalance();

        p1.payMoney(150000);

        p1.payMoney(500);

        p1.checkBalance();
    }
}
