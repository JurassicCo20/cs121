package weekNine;

public class PremiumAccount extends BankAccount{
    private double creditLimit;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public PremiumAccount(String accountHolderName, String accountType, double balance, double creditLimit){
        super(accountHolderName,accountType,balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString(){
        return String.format("Account Holder: %s\n Account Type: %s\n Balance: %.2f\n Credit Limit: %.2f (Premium Account)\n", accountHolderName, accountType, balance, creditLimit);
    }
}
