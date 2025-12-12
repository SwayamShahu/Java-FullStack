import java.time.LocalDateTime;
import java.util.ArrayList;

public  class WalletP{
    private String Name ;
    private double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public void checkBalance(){
        addTransaction("CheckBalance", Double.NaN, balance);
        System.out.println("Current Balance: "+balance);
    }

    public boolean addMoney(double amount){
        balance += amount;
        addTransaction("Credit", amount, balance);
        return true;
    }

    public boolean pay(double amount){
        if(balance >= amount){
            balance -= amount;
            addTransaction("Debit", amount, balance);
            return true;
        }
        System.out.println("Insufficient Balance");
        return false;
    }

    public void addTransaction(String type, double amount, double balance){
//        transactions.add(LocalDateTime.now() +"|" + type + ": "+amount);
        transactions.add(new Transaction(amount, type, balance));
    }

    public void addTransaction(String type, double amount, double balance, String note){
//        transactions.add(LocalDateTime.now() +"|" + type + ": "+amount);
        transactions.add(new Transaction(amount, type, balance, note));
    }

    public void seeTransaction(){
        System.out.println("Transaction of Account: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).getRecord());
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
            System.out.println(transactions.get(i).getRecord());
        }
        System.out.println("------Page End!!------");
    }

    public void searchByType(String type){
        System.out.println("Transaction involving: " + type);
        for (int i = 0; i < transactions.size(); i++) {
//            if(transactions.get(i).getType().toLowerCase().contains(type.toLowerCase())){
//                System.out.println(transactions.get(i).getRecord());
//            }
            if (transactions.get(i).getType().toLowerCase().equals(type.toLowerCase())){
                System.out.println(transactions.get(i).getRecord());
            }
        }
    }
}