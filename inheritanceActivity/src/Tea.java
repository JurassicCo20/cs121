public class Tea extends DrinkType {
    private String sugarContent;

    public Tea(String drinkName, String drinkColor, double price, String sugarContent){
        super(drinkName, drinkColor, price);
        this.sugarContent = sugarContent;
    }
    public void setSugarContent(String sugarContent){
        this.sugarContent = sugarContent;
    }
    public String getSugarContent(){
        return sugarContent;
    }

    @Override
    public String toString(){
        return String.format("Drink Name: %s\n Drink Color: %s\n Price: %.2f\n Sugar Content: %s", drinkName, drinkColor, price, sugarContent);
    }
}
