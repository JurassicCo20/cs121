package weekNine;

public class BankAccountTestOld {
    public static void main(String[] args) {
        BankAccountOld bnk1 = new BankAccountOld("Janice", "Savings", 1000.15);
        BankAccountOld bnk2 = new BankAccountOld(12345);
        int confirmationNumber = 10000;
        confirmationNumber += 1;
        System.out.println("Welcome to Bank of America!");
        bnk1.regularAccount();
        System.out.printf("Confirmation Number: %d\n", confirmationNumber);
        confirmationNumber += 1;
        bnk2.premiumAccount();
        System.out.printf("Confirmation Number: %d\n", confirmationNumber);
    }
}
