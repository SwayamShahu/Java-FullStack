import java.time.LocalDateTime;
import java.util.ArrayList;

public  class WalletP{
    private String Name ;
    private double balance;
    ArrayList<String> transactions = new ArrayList<>();
    public void checkBalance(){
        addTransaction("Check Balance");
        System.out.println("Current Balance: "+balance);
    }

    public boolean addMoney(double amount){
        balance += amount;
        addTransaction("Add Amount", amount);
        return true;
    }
    public boolean pay(double amount){
        if(balance >= amount){
            balance -= amount;
            addTransaction("Pay Amount",amount);
            return true;
        }
        System.out.println("Insufficint Balance");
        return false;
    }

    public void addTransaction(String operation, double amount){
        transactions.add(LocalDateTime.now() +"|" + operation + ": "+amount);
    }

    public void addTransaction(String operation){
        transactions.add(LocalDateTime.now() +"|" + operation);
    }

    public void seeTransaction(){
        System.out.println("Transaction of Account: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
        System.out.println("-----End-----");
    }

    public void fetchTransaction(int page,int limit){
        if (page < 1 || ((10*(page-1)+1) > transactions.size())){
            System.out.println("Invalid Page!!!");
            return;
        }
        System.out.println("------Page: " + page + "------");
        for (int i = (page-1)*limit; i<(page*limit) && i<transactions.size();i++){
            System.out.println(transactions.get(i));
        }
        System.out.println("------Page End!!------");
    }

    public void searchByType(String operation){
        System.out.println("Transaction involving: " + operation);
        for (int i = 0; i < transactions.size(); i++) {
            if(transactions.get(i).toLowerCase().contains(operation.toLowerCase())){
                System.out.println(transactions.get(i));
            }
        }
    }
}