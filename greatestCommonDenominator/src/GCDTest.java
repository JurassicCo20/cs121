import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        GCD newGCD = new GCD();
        System.out.println("Enter your first integer: ");
        int numberOne = scnr.nextInt();
        System.out.println("Enter your second integer: ");
        int numberTwo = scnr.nextInt();
        System.out.println("1. for loop gcd: " + newGCD.findGCDForLoop(numberOne, numberTwo));
        System.out.println("2. while loop gcd: " + newGCD.findGCDWhileLoop(numberOne, numberTwo));
        System.out.println("3. recursive gcd: " + newGCD.findGCDRecursively(numberOne, numberTwo));

        System.out.println("Optional Bonus");
        System.out.println("Enter a positive integer: ");
        numberOne = scnr.nextInt();
        System.out.println("Enter a negative integer: ");
        int negativeNumberTwo = scnr.nextInt();
        negativeNumberTwo = Math.abs(negativeNumberTwo);
        System.out.println("4. negative gcd: " + newGCD.findGCDForLoop(numberOne, negativeNumberTwo));
    }
}
