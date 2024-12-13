package weekTwelve.fileIO;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite{
    public static void main(String[] args) throws FileNotFoundException{
        File outputFile = new File("TestingFileWrite.txt");
        PrintWriter output = new PrintWriter(outputFile);
        Scanner scnr = new Scanner(System.in);

        output.printf("%-20s %-20s %-17s %-20s %-20s", "<User Name>", "<Password>", "<Score>", "<Player Character>", "<Winning Percentage>");

        String name, passWord, playerCharacter;
        int score;
        double winningPercent;

        for(int i = 0; i < 2; i++){
            name = JOptionPane.showInputDialog(String.format("Enter user %d's user name:", (i + 1)));
            passWord = JOptionPane.showInputDialog(String.format("Enter user %d's password:", (i + 1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's Character:", (i + 1)));
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score:", (i + 1))));
            winningPercent = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage:", (i + 1))));

            output.printf("%n%-20s %-20s %6d %23s %15.2f", name, passWord, score, playerCharacter, winningPercent);
        }
        scnr.close();
        output.close();
    }
}
