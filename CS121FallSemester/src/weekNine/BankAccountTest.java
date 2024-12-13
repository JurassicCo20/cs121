package weekNine;

public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank of America!");
        RegularAccount bnk1 = new RegularAccount("Janice", "Savings", 1000.15, 21);
        bnk1.setName("Brian");
        System.out.println("BRIAN'S BANKING INFO:");
        System.out.println(bnk1);

        PremiumAccount bnk2 = new PremiumAccount("Janice", "Savings", 2104.15, 3010.30);
        bnk2.setAccountType("Checking");
        System.out.println("JANICE'S BANKING INFO:");
        System.out.println(bnk2);
    }
}
