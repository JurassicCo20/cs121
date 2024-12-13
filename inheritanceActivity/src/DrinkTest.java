public class DrinkTest {
    public static void main(String[] args){
        DrinkType drink1 = new DrinkType("Coffee", "brown", 12.15);

        System.out.println("DRINK 1");
        System.out.println(drink1.getDrinkName());
        System.out.println(drink1.getDrinkColor());
        System.out.println(drink1.getPrice());
        System.out.println(drink1);

        Tea drink2 = new Tea("FreshTea" ,"brown",13.00, "High");

        System.out.println("DRINK 2 - TEA");
        System.out.println(drink2.getDrinkColor());
        System.out.println(drink2.getPrice());
        System.out.println(drink2.getPrice());
        System.out.println(drink2);

        Lemonade drink3 = new Lemonade("PinkLemonade","yellow",10.30, 7);

        System.out.println("DRINK 3 - LEMONADE");
        System.out.println(drink2.getDrinkColor());
        System.out.println(drink2.getPrice());
        System.out.println(drink2.getPrice());
        System.out.println(drink2);

    }
}
