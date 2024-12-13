import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class AccountReaderArrayList {
    public static void main(String[] args) {
        try {
            //Create a Gson object
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("accounts.json"));


            Type acntArrayList = new TypeToken<ArrayList<Account>>(){}.getType();
            //Account acntInfo = gson.fromJson(reader, Account.class);
            ArrayList<Account> acntList = gson.fromJson(reader, acntArrayList);

            System.out.println("**********Car Details**********");
            for(Account acntInfo: acntList) {
                System.out.printf("Balance: %s%nHolder's Name: %s%nAccount Number: %d%n", acntInfo.getBalance(), acntInfo.getAcntName(), acntInfo.getAcntNumber());
                System.out.println("--------------------\n\n");
            }
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}
