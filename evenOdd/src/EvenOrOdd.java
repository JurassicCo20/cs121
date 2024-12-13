import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int testNumber;
        int testScoreTwo;
        int testScoreThree;

        System.out.print("Please enter a number: ");
        testNumber = scn.nextInt();
        
        if(testNumber % 2 == 0){
            System.out.println("The number is even");
        }
        else if(testNumber % 2 != 0){
            System.out.println("The number is odd");
        }
    }
}

