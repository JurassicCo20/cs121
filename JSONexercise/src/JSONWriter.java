import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter {
    public static void main(String[] args) {
        try{
            Account acnt = new Account("$500", "Jane", 1094);
            Gson gson = new Gson();
            String jsonString = gson.toJson(acnt);

            System.out.println(jsonString);
            FileWriter filewriter = new FileWriter("account.json");
            filewriter.write(jsonString);
            filewriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
