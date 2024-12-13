package weekNine;

public class BankAccountOld {
    protected String accountHolderName;

    protected String accountType;
    private double initialDeposit;
    protected double balance;
    private int customerID;
    private int age;
    int confirmationNumber = 10000;

    //constructors

    public BankAccountOld(int customerID){
        this.customerID = customerID;
        this.accountType = "Checking";
    }

    public BankAccountOld(String accountHolderName, String accountType, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    //methods

    public void regularAccount(){
        System.out.printf("Welcome to Bank of America, %s!\n", getAccountHolderName());
        System.out.printf("Name: %s\n", getAccountHolderName());
        setAge(15);
        System.out.printf("Age: %d\n",getAge());
        System.out.printf("Account Type: %s\n", getAccountType());
        setInitialDeposit(500.14);
        System.out.println("Initial Deposit: $" + getInitialDeposit());
    }

    public void premiumAccount(){
        System.out.println("Welcome to Bank of America!\n");
        System.out.printf("Account Type: %s\n", getAccountType());
        System.out.printf("Member ID: %d\n", getCustomerID());

    }

    //getters and setters

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
        confirmationNumber += 1;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }
}
