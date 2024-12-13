//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pizza {
    //variable
    String pizzaStyle;
    int toppingCount;
    int sauceCount;
    int pizzaCount;

    //constructor
    public Pizza(String pizzaStyle, int toppingCount, int sauceCount, int pizzaCount){
        this.pizzaStyle = pizzaStyle;
        this.toppingCount = toppingCount;
        this.sauceCount = sauceCount;
        this.pizzaCount = pizzaCount;
    }
    void getTotalPizza() {
        System.out.printf("> Pizza Style: %s\n" +
                "> Topping Count: %d\n" +
                "> Sauce Count: %d\n" +
                "> Pizza Count: %d\n", pizzaStyle, toppingCount, sauceCount, pizzaCount);
    }
}
