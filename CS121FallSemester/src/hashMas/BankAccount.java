package hashMas;
import java.util.HashMap;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    String accountType;
    HashMap<String, String> transactionHistory = new HashMap<String, String>();

    public void addTransaction(String transID, String details){
        transactionHistory.put(transID, details);
    }
    public void removeReservation(String transID){
        transactionHistory.remove(transID);
    }
    public void getReservation(String transID){
        System.out.print(transactionHistory.get(transID));
    }
    public void displayAllReservations(){
        String newIdeas = transactionHistory.values().toString();
        System.out.println(newIdeas);
    }
}
