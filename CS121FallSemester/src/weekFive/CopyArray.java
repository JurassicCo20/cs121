package weekFive;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int numElements = scnr.nextInt();
        int[] array = new int[numElements];
        int[] arrayCopy = new int[numElements];
        int[] arraySquared = new int[numElements];
        int[] arrayReversed = new int[numElements];

        for(int i = 0; i < numElements; i++){
            System.out.println("Enter array element " + i + ": ");
            array[i] = scnr.nextInt();
        }
        System.out.print("Array 1\n");
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nArray 2 - copy\n");
        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[i];
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.print("\nArray 3 - squared\n");
        for(int i = 0; i < array.length; i++){
            arraySquared[i] = array[i] * array[i];
            System.out.print(arraySquared[i] + " ");
        }
        System.out.print("\nArray 4 - reversed\n");
        for (int i = 0; i < array.length; i++) {
            arrayReversed[i] = array[i];
        }
        for(int i = 0; i < array.length; i++){
            arrayReversed[i] = array[i] * array[i];
        }
        for (int i = 0; i <= (array.length / 2); i++) {
            int tempValue = array[i];
            arrayReversed[i] = array[array.length - 1 - i];
            arrayReversed[array.length - 1 - i] = tempValue;
        }
        for (int i = 0; i < arrayReversed.length; i++) {
            System.out.print(arrayReversed[i] + " ");
        }
    }
}
