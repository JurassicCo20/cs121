package weekTwo.labTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        int length, width;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = Integer.parseInt(scn.nextLine());
        System.out.println("Enter the width: ");
        width = Integer.parseInt(scn.nextLine());
        int area = length * width;
        System.out.printf("Area: %d", area);


        length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length: "));
        width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width: "));
        area = length * width;
        String message = String.format("Area: %d", area);
        JOptionPane.showMessageDialog(null,message);
    }
}
