import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        Integer[] newArray = sort.getArray();
        System.out.print(Arrays.toString(newArray));
        Integer[] sortedArray = sort.sortArray(newArray);
        System.out.print(Arrays.toString(sortedArray));
    }
}