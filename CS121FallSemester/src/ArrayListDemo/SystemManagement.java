package ArrayListDemo;
import java.util.ArrayList;

public class SystemManagement {
    ArrayList<String> newCheese = new ArrayList<>();
    ArrayList<String> newDrink = new ArrayList<>();
    ArrayList<String> newCookie = new ArrayList<>();

    public void addCheese(String foodOne){
        newCheese.add(foodOne);
    }
    public void addDrink(String foodOne){
        newDrink.add(foodOne);
    }

    public void addCookie(String foodOne){
        newCookie.add(foodOne);
    }
    public void removeCheese(int placement){
        newCheese.remove(placement);
    }
    public void removeDrink(int placement){
        newDrink.remove(placement);
    }
    public void removeCookie(int placement){
        newCookie.remove(placement);
    }
    public int getSizeCheeseList(){
        return newCheese.size();
    }
    public int getSizeDrinkList(){
        return newDrink.size();
    }
    public int getSizeCookieList(){
        return newCookie.size();
    }
    public String getElementCheeseList(int index){
        return newCheese.get(index);
    }
    public String getElementDrinkList(int index){
        return newDrink.get(index);
    }
    public String getElementCookieList(int index){
        return newCookie.get(index);
    }
    public void displayCheeseFoodsFirst(){
        for (String s : newCheese) {
            System.out.printf("%s\n", s);
        }
    }
    public void displayCheeseFoodsTwo(){
        for(int i = 0; i < newCheese.size(); i++) {
            System.out.printf("%s\n", newCheese.get(i));
        }
    }

    public void displayDrinkFoodsFirst(){
        for (String s : newDrink) {
            System.out.printf("%s\n", s);
        }
    }
    public void displayDrinkFoodsTwo(){
        for(int i = 0; i < newDrink.size(); i++) {
            System.out.printf("%s\n", newDrink.get(i));
        }
    }

    public void displayCookieFoodsFirst(){
        for (String s : newCookie) {
            System.out.printf("%s\n", s);
        }
    }
    public void displayCookieFoodsTwo(){
        for(int i = 0; i < newCookie.size(); i++) {
            System.out.printf("%s\n", newCookie.get(i));
        }
    }
}
