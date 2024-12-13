package weekTen.abstractClasses;

public abstract class BankAccount {
    protected String accountHolderName;

    protected String accountType;
    protected double balance;
    private int customerID;
    int confirmationNumber;
    private int initialDeposit;


    public String getName() {
        return accountHolderName;
    }

    public void setName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void BankAccount(int customerID){
        this.customerID = customerID;
    }

    public BankAccount(String accountHolderName, String accountType, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    @Override
    public String toString(){
        return String.format("Account Holder: %s\n Account Type: %s\n Balance: %.2f\n", accountHolderName, accountType, balance);
    }

    public abstract int earnCard(int balance);
}
