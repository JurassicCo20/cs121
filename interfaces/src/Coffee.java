import examples.interfaces.DrinkType;

public class Coffee implements DrinkType.Graphics {
    private String sugarContent;
    private String drinkName;
    private String drinkColor;
    private double price;
    public Coffee(String drinkName, String drinkColor, double price, String sugarContent){
        this.drinkName = drinkName;
        this.drinkColor = drinkColor;
        this.price = price;
        this.sugarContent = sugarContent;
    }
    public void setSugarContent(String sugarContent){
        this.sugarContent = sugarContent;
    }
    public String getSugarContent(){
        return sugarContent;
    }

    @Override
    public int graphicsOnCup() {
        return 3;
    }
}
