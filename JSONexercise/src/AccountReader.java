import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountReader {
    public static void main(String[] args) {
        try {
            //Create a Gson object
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("account.json"));
            Account acntInfo = gson.fromJson(reader, Account.class);
            System.out.println("**********Car Details**********");
            System.out.printf("Balance: %s%nHolder's Name: %s%nAccount Number: %d%n", acntInfo.getBalance(), acntInfo.getAcntName(), acntInfo.getAcntNumber());
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}
