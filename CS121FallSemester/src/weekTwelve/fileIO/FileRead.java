package weekTwelve.fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException{
        File fileOutput = new File("TestingFileWrite.txt");
        try{
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s", header);
            while(console.hasNextLine()){
                String name = console.next();
                String passWord = console.next();
                int score = Integer.parseInt(console.next());
                String playerCharacter = console.next();
                double winningPercent = Double.parseDouble(console.next());
                System.out.printf("%-20s %-20s %-17s %-20s %-20s", name, passWord, score, playerCharacter, winningPercent);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
