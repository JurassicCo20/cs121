package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        String element;

        System.out.println("Please enter an element: fire, water, earth, or air!");
        element = scn.nextLine();
        switch(element){
            case "Fire":
                System.out.println("Fire creates smoke!");
                break;
            case "Water":
                System.out.println("Water creates ice!");
                break;
            case "Earth":
                System.out.println("Earth creates rocks!");
                break;
            case "Air":
                System.out.println("Air creates clouds!");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
