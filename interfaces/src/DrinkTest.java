public class DrinkTest {
    public static void main(String[] args){
        Coffee drink1 = new Coffee("Starbucks" ,"brown",12.00, "High");
        System.out.printf("Graphics on cup Count: %d\n", drink1.graphicsOnCup());

        Boba drink2 = new Boba("BrownSugarBoba","beige",11.30, 29);
        System.out.printf("Graphics on Cup Count: %d\n", drink2.graphicsOnCup());
    }
}
