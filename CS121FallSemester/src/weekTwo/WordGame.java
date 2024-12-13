package weekTwo;
import javax.swing.JOptionPane;

public class WordGame {
    public static void main(String[] args) {
        String name;
        int age;
        double salary;
        String university;
        int swipes;
        String store;

        name = JOptionPane.showInputDialog("Enter in your name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter in your age: "));
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter in your salary: "));
        store = JOptionPane.showInputDialog("Enter a store you work(ed) at: ");

        university = JOptionPane.showInputDialog("Enter your university: ");
        swipes = Integer.parseInt(JOptionPane.showInputDialog("Enter how many meal swipes you have: "));

        String message = String.format("The person %s is from Mustang,OK.\nThey are %d years old and make $%.2f an hour at %s.\nBecause they work at %s they get %d meal swipes!", name, age, salary, university, store, swipes);
        JOptionPane.showMessageDialog(null, message);
    }
}
