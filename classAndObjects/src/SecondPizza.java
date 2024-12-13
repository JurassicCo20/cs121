//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SecondPizza {
    //variable
    String store;
    double totalPrice;
    int peopleInStore;
    int storeRating;

    //constructor
    public SecondPizza (String store, double totalPrice, int peopleInStore, int storeRating){
        this.store = "Hungry Howies";
        this.totalPrice = 15.00;
        this.peopleInStore = 12;
        this.storeRating = 3;
    }
    void getNewPizzaData(){
        System.out.printf("> Store: %s\n" +
                "> Total Price: %.2f\n" +
                "> People in Store: %d\n" +
                "> Store Rating: %d\n", store, totalPrice, peopleInStore, storeRating);
    }
}
