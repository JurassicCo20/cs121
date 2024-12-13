import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileAppends {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("plants.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            String plants = JOptionPane.showInputDialog("Enter plant name: ");
            String numberOfPlants = JOptionPane.showInputDialog("Enter the number of plants: ");
            String plantHeight = JOptionPane.showInputDialog("Enter plant height: ");

            output.printf("%s %s %s\n", plants, numberOfPlants, plantHeight);
            fileWriter.close();
            output.close();
        }
        catch(FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}
