package weekTen.abstractClasses;
import weekTen.interfaces.UserInteractable;

import java.util.Random;

public class PremiumAccount extends BankAccount implements UserInteractable {
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

    @Override
    public int earnCard(int balance) {
        Random random = new Random();
        int testInt = random.nextInt(1000);
        return testInt - balance;
    }

    @Override
    public void register(){
        System.out.println("You have registered your account! Please log in.");
        System.out.println("Approved Login\n Please view your bank details!\n");
    }
}
