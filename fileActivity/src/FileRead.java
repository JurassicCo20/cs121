import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException{
        File plantsFile = new File("plants.txt");
        try {
            Scanner input = new Scanner(plantsFile);

            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            input.close();
        }

        catch(FileNotFoundException c){
            c.printStackTrace();
            System.err.println("File could not be found.");
        }
    }
}
