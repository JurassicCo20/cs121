package setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BankAccountSet {
    Set<String> accounts = new HashSet<>();

    public void addAccounts(){
        Scanner scnr = new Scanner(System.in);
        String account = "";
        System.out.printf("\n%s ID STATION %s\n", "-".repeat(10), "-".repeat(10));
        System.out.println("Enter bank account IDs to add (enter '0' to quit):");
        while(true){
            account = scnr.nextLine();
            if(account.equals("0")){
                return;
            }
            else{
                accounts.add(account);
            }
        }
    }

    public void displayAccount(){
        Iterator<String> gin = accounts.iterator();
        System.out.printf("\n%s BANK ACCOUNT ID'S %s\n", "-".repeat(10), "-".repeat(10));
        while(gin.hasNext()){
            String name = gin.next();
            System.out.println(name);
        }
    }
}
