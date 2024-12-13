import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter number of elements in the array? ");
        int arrayChecker = scnr.nextInt();

        int[] arrayOne = new int[arrayChecker];
        int[] arrayTwo = new int[arrayChecker];
        int[] arrayThree = new int[arrayChecker];
        int[] arrayFour = new int[arrayChecker];
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print("Enter array element " + i + ": ");
            arrayOne[i] = scnr.nextInt();
        }

        System.out.println("Array 1");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
            System.out.print(arrayTwo[i] + " ");
        }
        System.out.println();

        System.out.println("Array 3");
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayThree[i] = arrayOne[i] * arrayOne[i];
            System.out.print(arrayThree[i] + " ");
        }
        System.out.println();

        System.out.println("Array 4");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayFour[i] = arrayOne[i];
        }
        for (int i = 0; i <= (arrayOne.length / 2); i++) {
            int tempValue = arrayOne[i];
            arrayFour[i] = arrayOne[arrayOne.length - 1 - i];
            arrayFour[arrayOne.length - 1 - i] = tempValue;
        }
        for (int i = 0; i < arrayFour.length; i++) {
            System.out.print(arrayFour[i] + " ");
        }
        System.out.println();
        scnr.close();
    }
}

