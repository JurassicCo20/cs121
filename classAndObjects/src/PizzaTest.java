public class PizzaTest {
    public static void main(String[] args){
        Pizza newPizzaOne = new Pizza("Pepperoni", 17, 2, 3);
        SecondPizza newPizzaTwo = new SecondPizza("Hungry Howies", 15.00, 12, 3);

        newPizzaOne.getTotalPizza();
        newPizzaTwo.getNewPizzaData();
    }
}
