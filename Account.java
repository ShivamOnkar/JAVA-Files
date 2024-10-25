 import java.util.Random;
 class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(){
        Random r = new Random();
        String Ac_no = "ACC" + (10000 + r.nextInt(90000));
        accountNumber = Ac_no;
        accountHolderName = "Unnamed Account";
        balance = 500.0;
    }
    Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber =accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = (balance<0) ? 0.0 : balance;
    }
    void deposite(double amount){
        if(amount>=0){
            balance = balance + amount;
        }
        else{
            balance = balance + Math.abs(amount);
        }
    }
    void withdraw(double amount){
        if(amount < balance && amount >= 0){
            balance = balance - amount;

        }
        else if(amount< balance){
            balance = balance - Math.abs(amount);
        }
        else if(amount>balance){
            System.out.println("Insufficient Balance");
        }
    }
    void displayInfo(){
        System.out.println("Account Number - "+accountNumber);
        System.out.println("Account Holder Name - "+accountHolderName);
        System.out.println("Account balance - "+balance);

    }

}
 class Demo_1{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.deposite(1000.0);
        account1.withdraw(200.0);
        account1.displayInfo();

        Account account2 = new Account("ACC67890","John Deo",1500.0 );
        account2.deposite(500.0);
        account2.withdraw(250.0);
        account2.displayInfo();
    }
 }
