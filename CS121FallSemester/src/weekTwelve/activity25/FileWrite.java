package weekTwelve.activity25;
import javax.naming.Name;
import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException{
        File outputFile = new File("UserInformation.txt");
        PrintWriter output = new PrintWriter(outputFile);
    }
}
