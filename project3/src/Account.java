public class Account {
    public static int numberOfAccounts = 1000;
    private int balance = 0;
    private int accountNumber;
    public Account(int depositNumber){
        numberOfAccounts += 1;
        this.balance= depositNumber;
        this.accountNumber = numberOfAccounts;
    }
    public void depositAmount(int amount){
        balance += amount;
        System.out.printf("You have deposited: %d", amount);
        System.out.printf("Your balance is now: %d", balance);
    }
    public void withdrawAmount(int amount){
        if(amount > balance){
            System.out.print("You have insufficient funds.");
        }
        else{
            balance -= amount;
            System.out.printf("You have withdrawn: %d", amount);
            System.out.printf("Your balance is now: %d", balance);
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String toString(){
        return String.format("Account Number: %d\n" + "Balance: $%d\n", accountNumber, balance);
    }
}
