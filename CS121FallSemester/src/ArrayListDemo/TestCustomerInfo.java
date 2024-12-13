package ArrayListDemo;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        boolean quit = true;
        SystemManagement newConsumable = new SystemManagement();
        Scanner scn = new Scanner(System.in);
        System.out.println("WELCOME TO THE DINERY!\n");
        for (int i = 1; i < 4; i++) {
                    System.out.println("Please add Cheese #" + i);
                    String nextCheese = scn.next();
                    if(nextCheese.equals("q")){
                        quit = false;
                        break;
                    }
                    newConsumable.addCheese(nextCheese);
                    System.out.println("Please add Drink #" + i);
                    String nextDrink = scn.next();
                    if(nextDrink.equals("q")){
                        quit = false;
                        break;
                    }
                    newConsumable.addDrink(nextDrink);
                    System.out.println("Please add Cookie #" + i);
                    String nextCookie = scn.next();
                    if(nextCookie.equals("q")){
                        quit = false;
                        break;
                    }
                    newConsumable.addCookie(nextCookie);
        }
        System.out.println("CHEESE ON DISPLAY:");
        newConsumable.displayCheeseFoodsTwo();
        System.out.println("DRINKS ON DISPLAY:");
        newConsumable.displayDrinkFoodsTwo();
        System.out.println("COOKIES ON DISPLAY:");
        newConsumable.displayCookieFoodsTwo();
    }
}
