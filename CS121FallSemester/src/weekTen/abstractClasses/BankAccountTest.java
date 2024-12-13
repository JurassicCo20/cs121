package weekTen.abstractClasses;

import weekTen.abstractClasses.PremiumAccount;
import weekTen.abstractClasses.RegularAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank of America!");
        RegularAccount bnk1 = new RegularAccount("Janice", "Savings", 535.15, 21);
        bnk1.register();
        if(bnk1.earnCard(bnk1.earnCard(bnk1.getInitialDeposit())) < 0){
            System.out.println("You have earned enough to get a new Master's card!");
        }
        else{
            System.out.println("You are $" + bnk1.earnCard(bnk1.getInitialDeposit()) + " from getting a new card!");
        }
        PremiumAccount bnk2 = new PremiumAccount("Brian", "Checking", 610.15, 3010.30);
        bnk2.register();
        if(bnk2.earnCard(bnk2.getInitialDeposit()) < 0){
            System.out.println("You have earned enough to get a new Master's card!\n");
        }
        else{
            System.out.println("You are $" + bnk2.earnCard(bnk2.getInitialDeposit()) + " from getting a new card!\n");
        }
    }
}
