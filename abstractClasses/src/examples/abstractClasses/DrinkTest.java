package examples.abstractClasses;
public class DrinkTest {
    public static void main(String[] args){
        Tea drink1 = new Tea("FreshTea" ,"brown",13.00, "High");

        System.out.printf("Calorie Count: %d\n", drink1.calculateCalories());

        Lemonade drink2 = new Lemonade("PinkLemonade","yellow",10.30, 7);

        System.out.printf("Calorie Count: %d\n", drink2.calculateCalories());
    }
}
