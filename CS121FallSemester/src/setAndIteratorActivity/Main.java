package setAndIteratorActivity;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccountSet bnk1 = new BankAccountSet();
        Scanner scnr = new Scanner(System.in);
        System.out.printf("\n%s BANK ACCOUNT MANAGEMENT SYSTEM %s\n", "-".repeat(10), "-".repeat(10));
        System.out.println("Option 1/'Op1': Add a bank Account ID.\nOption 2/'Op2': View all bank account IDs.\nOption 3/'Op3': exit the system.");
        String option = scnr.nextLine();
        while (true) {
            switch (option) {
                case "Op1":
                    bnk1.addAccounts();
                    break;
                case "Op2":
                    bnk1.displayAccount();
                    break;
                case "Op3":
                    System.out.println("Thank you for using THE BANK SYSTEM. Now exiting...");
                    return;
                default:
                    System.out.println("Invalid entry, please try again!");
            }
            System.out.println("Option 1/'Op1': Add a bank Account ID.\nOption 2/'Op2': View all bank account IDs.\nOption 3/'Op3': exit the system.");
            option = scnr.nextLine();
        }
    }
}
