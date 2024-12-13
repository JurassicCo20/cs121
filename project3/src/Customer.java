import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private int pin;
    private ArrayList<Account> accountArrayList = new ArrayList<>();

    public Customer(String firstName, String lastName, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(Account account){
        accountArrayList.add(account);
    }
    public void removeAccount(Account account){
        accountArrayList.remove(account);
    }
    public Account getAccount(int accountNumber){
        Account foundAccount = null;
        for(Account account: accountArrayList){
            if(account.getAccountNumber() == accountNumber){
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }
    public ArrayList<Account> getAllAccounts(){
        return accountArrayList;
    }
    public int getCustomerPIN() {
        return pin;
    }
    @Override
    public String toString(){
        return String.format("Customer Name: %s,%s\n Customer Pin: %d\n", firstName,lastName, pin);
    }
}
