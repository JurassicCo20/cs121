import java.util.Scanner;

public class TestScores {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int testScoreOne;
        int testScoreTwo;
        int testScoreThree;

        System.out.print("Please enter the first test score: ");
        testScoreOne = scn.nextInt();
        System.out.print("Please enter the second test score: ");
        testScoreTwo = scn.nextInt();
        System.out.print("Please enter the third test score: ");
        testScoreThree = scn.nextInt();
        int testScoreAverage = ((testScoreOne + testScoreTwo + testScoreThree) / 3);

        System.out.printf("The average is: %d ", testScoreAverage);
        if (testScoreAverage < 60) {
            System.out.println("Test Score Average: F");
        } else if (testScoreAverage < 70) {
            System.out.println("Test Score Average: D");
        } else if (testScoreAverage < 80) {
            System.out.println("Test Score Average: C");
        } else if (testScoreAverage < 90) {
            System.out.println("Test Score Average: B");
        } else if (testScoreAverage < 101){
            System.out.println("Test Score Average: A");
        }
    }
}
