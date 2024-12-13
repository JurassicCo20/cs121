package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName = "X";
        String password = "X";
        String name;
        String pw;

        name = JOptionPane.showInputDialog("Please enter a username: ");
        pw = JOptionPane.showInputDialog("Please enter a password: ");


        if (name.equals(userName) && pw.equals(password)){
            System.out.println("Welcome to CS121.");
        }
        else if (name.equals(userName)){
            System.out.println("Your password was incorrect.");
        }
        else if (name.equals(password)){
            System.out.println("Your username was incorrect.");
        }
        else{
            System.out.println("Neither was correct");
        }
    }
}
