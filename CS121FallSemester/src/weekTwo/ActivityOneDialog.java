package weekTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ActivityOneDialog {
    public static void main(String[] args) {
        double P, r, A;
        int n, t;

        P = Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount: "));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "))/100;
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times compound: "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of years: "));
        A = P * Math.pow((1 + r/n), n*t);
        JOptionPane.showMessageDialog(null,String.format("The balance" +  "Of the account after %d years you will have $ %.2f",t,A));
    }
}
