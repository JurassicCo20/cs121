package hashMas;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bnk1 = new BankAccount();
        bnk1.addTransaction("T1001", "Deposit, $500, 01/01/2024");
        bnk1.addTransaction("T1002", "Withdrawal, $200, 01/02/2024");
        bnk1.addTransaction("T1003", "Deposit, $300, 01/03/2024");
        System.out.println("CURRENT HASH MAP ACCOUNTS:\n");
        bnk1.displayAllReservations();
        System.out.println("\nREMOVING FIRST ACCOUNT...\n");
        bnk1.getReservation("T1001");
        bnk1.removeReservation("T1001");
        System.out.println("\nUPDATED HASH MAP ACCOUNTS:\n");
        bnk1.displayAllReservations();
    }
}
