package ArrayListDemo;
import java.util.ArrayList;

public class SystemManagementTest {
    public static void main(String[] args){
        SystemManagement foodName = new SystemManagement();

        foodName.addCheese("Gouda");
        foodName.addCheese("Swiss");
        foodName.addCheese("American");
        foodName.addDrink("Lemonade");
        foodName.addDrink("Tea");
        foodName.addDrink("Water");
        foodName.addCookie("Biscotti");
        foodName.addCookie("Chocolate Chip");
        foodName.addCookie("Snickerdoodle");

        System.out.printf("Number of cheeses: %d\n", foodName.getSizeCheeseList());
        System.out.printf("Number of drinks: %d\n", foodName.getSizeDrinkList());
        System.out.printf("Number of cookies: %d\n", foodName.getSizeCookieList());
        System.out.println("CHEESE ON DISPLAY:");
        foodName.displayCheeseFoodsTwo();
        System.out.println("DRINKS ON DISPLAY:");
        foodName.displayDrinkFoodsTwo();
        System.out.println("COOKIES ON DISPLAY:");
        foodName.displayCookieFoodsTwo();
        System.out.printf("\nREMOVING FIRST ITEM OUT OF CHEESE: %s\n", foodName.getElementCheeseList(0));
        foodName.removeCheese(0);
        System.out.printf("\nREMOVING FIRST ITEM OUT OF DRINKS: %s\n", foodName.getElementDrinkList(0));
        foodName.removeDrink(0);
        System.out.printf("\nREMOVING FIRST ITEM OUT OF COOKIES: %s\n", foodName.getElementCookieList(0));
        foodName.removeCookie(0);
        System.out.println("CHEESES CURRENTLY ON DISPLAY");
        foodName.displayCheeseFoodsFirst();
        System.out.println("DRINKS CURRENTLY ON DISPLAY");
        foodName.displayDrinkFoodsFirst();
        System.out.println("COOKIES CURRENTLY ON DISPLAY");
        foodName.displayCookieFoodsFirst();
    }
}
