import java.util.Scanner;

public class SwitchExample {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        String element;

        System.out.println("Please enter an element: fire, water, earth, or air!");
        element = scn.nextLine();
        System.out.println();

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
        }
        console.close();
    }
}