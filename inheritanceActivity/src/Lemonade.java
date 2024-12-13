public class Lemonade extends DrinkType{
    private int iceCount;

    public Lemonade(String drinkName, String drinkColor, double price, int iceCount){
        super(drinkName, drinkColor,price);
        this.iceCount = iceCount;
    }
    public void setIceCount(int iceCount){
        this.iceCount = iceCount;
    }
    public int getIceCount(){
        return iceCount;
    }

    @Override
    public String toString(){
        return String.format("Drink Name: %s\n Drink Color: %s\n Price: %.2f\n Ice Count: %d", drinkName, drinkColor, price, iceCount);
    }
}
