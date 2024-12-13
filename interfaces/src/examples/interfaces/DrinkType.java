package examples.interfaces;
public class DrinkType {
    public interface Graphics {
        int graphicsOnCup();
    }

    protected String drinkName;
    protected String drinkColor;
    protected double price;

    //constructor
    public DrinkType(String drinkName, String drinkColor, double price){
        this.drinkName = drinkName;
        this.drinkColor = drinkColor;
        this.price = price;
    }
    public void setDrinkName(String name) {
        this.drinkName = name;
    }
    public String getDrinkName() {
        return drinkName;
    }
    public void setDrinkColor(String color) {
        this.drinkColor = color;
    }
    public String getDrinkColor() {
        return drinkColor;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("Drink Name: %s\n Drink Color: %s\n Price: %.2f\n", drinkName, drinkColor, price);
    }

    public int graphicsOnCup() {
        return 150;
    }
}
