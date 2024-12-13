import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileWrite {
    public class FileRead {
        public static void main(String[] args) throws FileNotFoundException {
            File newPlantsFile = new File("plants.txt");
            PrintWriter newOutput = new PrintWriter(newPlantsFile);
            String plants;
            String numberOfPlants;
            String plantHeight;

            newOutput.printf("%s %s %s\n", "plants", "numberOfPlants", "plantHeight");
            for(int i = 1; i <= 3; i++){
                plants = JOptionPane.showInputDialog(String.format("Enter name of plant #%d", i));
                numberOfPlants = JOptionPane.showInputDialog(("Enter the number of this type of plant: "));
                plantHeight = JOptionPane.showInputDialog(("Enter the height of the plant: "));
                newOutput.printf("%s %s %s\n", plants, numberOfPlants, plantHeight);
            }
            newOutput.close();
        }
    }
}
