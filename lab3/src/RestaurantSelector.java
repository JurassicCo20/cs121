import java.util.Scanner;

public class RestaurantSelector {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        String vegetarian, vegan, glutenFree;
        String joeBurgers = "Joe's Gourmet Burgers";
        String mainPizza = "Main Street Pizza Company";
        String cornerCafe = "Corner Cafe";
        String mamaItaly = "Mama's Fine Italian";
        String chefKitchen = "The Chef's Kitchen";

        System.out.print("Is anyone in your party vegetarian? ");
        vegetarian = scn.nextLine().toLowerCase();
        System.out.print("Is anyone in your party vegan? ");
        vegan = scn.nextLine().toLowerCase();
        System.out.print("Is anyone in your party gluten-free? ");
        glutenFree = scn.nextLine().toLowerCase();

        System.out.println();
        System.out.print("Here are your restaurant choices: ");
        System.out.printf("\n%s\n%s", cornerCafe, chefKitchen);

        if (glutenFree.equals("yes") && (vegetarian.equals("yes") || vegetarian.equals("no"))){
            System.out.printf("\n%s\n", mainPizza);
        }
        else if (glutenFree.equals("yes")){
            System.out.println();
        }
        else if (vegetarian.equals("yes") && glutenFree.equals("no")){
            System.out.printf("\n%s\n", mamaItaly);
        }
        else{
            System.out.printf("\n%s\n%s\n", mainPizza, mamaItaly);
        }

        if (vegan.equals("no") && glutenFree.equals("no") && vegetarian.equals("no")){
            System.out.printf("\n%s", joeBurgers);
        }
    }
}