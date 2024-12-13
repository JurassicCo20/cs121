import java.util.ArrayList;

public class StringArrayTest {
    public static void main(String[] args){
        StringArrayList foodName = new StringArrayList();

        foodName.addFood("Mango");
        foodName.addFood("Pineapple");
        foodName.addFood("Pizza");
        foodName.addFood("Rice");

        System.out.printf("The number of foods currently in the list: %d\n", foodName.getSizeList());
        System.out.println("FOODS ON DISPLAY:");
        foodName.displayFoodsTwo();
        System.out.printf("\nREMOVING FIRST ITEM: %s\n", foodName.getElementList(0));
        foodName.removeFood(0);
        System.out.println("FOODS CURRENTLY ON DISPLAY");
        foodName.displayFoodsFirst();
    }
}
