package weekTen.abstractClasses;

import weekTen.interfaces.UserInteractable;

import java.util.Random;

public class RegularAccount extends BankAccount implements UserInteractable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public RegularAccount(String accountHolderName, String accountType, double balance, int age){
        super(accountHolderName,accountType,balance);
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Account Holder: %s\n Age: %d\n Account Type: %s\n Balance: %.2f (Regular Accont)\n", accountHolderName, age, accountType, balance);
    }

    @Override
    public int earnCard(int balance) {
        Random random = new Random();
        int testInt = random.nextInt(1000) + 500;
        return testInt - balance;
    }

    @Override
    public void register(){
        System.out.println("You have registered your account! Please log in.");
        System.out.println("Approved Login\n Please view your bank details!\n");
    }
}
