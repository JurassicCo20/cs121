import examples.interfaces.DrinkType;

public class Boba implements DrinkType.Graphics{
    private int bobaBalls;
    private String drinkName;
    private String drinkColor;
    private double price;
    public Boba(String drinkName, String drinkColor, double price, int bobaBalls){
        this.drinkName = drinkName;
        this.drinkColor = drinkColor;
        this.price = price;
        this.bobaBalls = bobaBalls;
    }
    public void setBobaBalls(int bobaBalls){
        this.bobaBalls = bobaBalls;
    }
    public int getBobaBalls(){
        return bobaBalls;
    }

    @Override
    public int graphicsOnCup() {
        return 2;
    }
}
