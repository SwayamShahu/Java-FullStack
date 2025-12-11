public class Main {
    public static void main(String[] args){
        WalletP w1 = new WalletP();
        w1.addMoney(5000);
        w1.pay(2000); //3000
        w1.pay(5000); //Fail
        w1.checkBalance(); //3000 Amount left
//        w1.seeTransaction();
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.pay(5000);
//        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.addMoney(5000);
        w1.pay(5000);
//        w1.seeTransaction();

//        w1.fetchTransaction(2,10);

        w1.searchByType("pay");
    }
}