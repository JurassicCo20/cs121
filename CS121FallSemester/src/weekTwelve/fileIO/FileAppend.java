package weekTwelve.fileIO;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("TestingFileWrite.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            String name = JOptionPane.showInputDialog("Enter the user's name:");
            String passWord = JOptionPane.showInputDialog("Enter the user's password:");
            String playerCharacter = JOptionPane.showInputDialog("Enter the user's Character:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the user's score:"));
            double winningPercent = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percentage:"));

            System.out.printf("%-20s %-20s %-17s %-20s %-20s", name, passWord, score, playerCharacter, winningPercent);
        }catch(FileNotFoundException e){
            System.err.println("**** Your File wasn't found. Fix That!! *****");
        }
    }
}
