import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericArrayList list = new GenericArrayList();
        ArrayList<Integer> intList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4)
        );
        ArrayList<Double> DoubleList = new ArrayList<>(
                Arrays.asList(2.2, 3.5, 3.9, 4.1)
        );
        ArrayList<Character> CharList = new ArrayList<>(
                Arrays.asList('c', 'd', 'e', 'f')
        );
        ArrayList<String> StringList = new ArrayList<>(
                Arrays.asList("Alpha", "Betta", "Gamma", "Delta")
        );
        System.out.print("Integer Array: ");
        list.printArray(intList);
        System.out.print("Double Array: ");
        list.printArray(DoubleList);
        System.out.print("Char Array: ");
        list.printArray(CharList);
        System.out.print("String Array: ");
        list.printArray(StringList);
    }
}