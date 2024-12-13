import java.util.ArrayList;
public class StringArrayList {
    private ArrayList<String> foodName = new ArrayList<>();

    public void addFood(String foodOne){
        foodName.add(foodOne);
    }
    public void removeFood(int placement){
        foodName.remove(placement);
    }
    public int getSizeList(){
        return foodName.size();
    }
    public String getElementList(int index){
        return foodName.get(index);
    }

    public void displayFoodsFirst(){
        for (String s : foodName) {
            System.out.printf("%s\n", s);
        }
    }
    public void displayFoodsTwo(){
        for(int i = 0; i < foodName.size(); i++) {
            System.out.printf("%s\n", foodName.get(i));
        }
    }
}
