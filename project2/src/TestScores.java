import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        final int SIZE = randGen.nextInt(10) + 3;

        int[] testScores = new int[SIZE];
        char[] letterScores = new char[SIZE];
        System.out.print("Enter your " + SIZE + " test scores\n");
        for (int i = 0; i < testScores.length; i++){
            System.out.println("Enter test " + ( i + 1 ) + " score: ");
            int newScore = scnr.nextInt();
            testScores[i] = newScore;
            int letterScore = testScores[i];
            letterScores[i] = getLetterGrade(letterScore);
        }
        printGrades(testScores, letterScores);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scnr.close();
    }
    public static char getLetterGrade(int score){
        if(score < 49){
            return 'F';
        }
        if(score < 59){
            return 'E';
        }
        if(score < 69){
            return 'D';
        }
        if(score < 79){
            return 'C';
        }
        if(score < 89){
            return 'B';
        }
        if(score < 100){
            return 'A';
        }
        else{
            return 'F';
        }
    }
    public static void printGrades(int[] testScores, char[] letterGrades){
        System.out.printf("%-20s %s\n", "Score", "Grade");
        for (int i = 0; i < testScores.length; i++){
            System.out.printf("%-20s %-20c\n", testScores[i], letterGrades[i]);
        }
    }
    public static void printHighestScore(int[] testScores){
        int highestScore = 0;
        for(int i = 0; i < testScores.length; i++){
            if(testScores[i] > highestScore){
                highestScore = testScores[i];
            }
        }
        System.out.printf("The highest score is %d", highestScore);
        System.out.println();
    }
    public static void printLowestScore(int[] testScores){
        int lowestScore = 100;
        for(int i = 0; i < testScores.length; i++){
            if(testScores[i] < lowestScore){
                lowestScore = testScores[i];
            }
        }
        System.out.printf("The lowest score is %d", lowestScore);
        System.out.println();
    }
    public static void printAverageScore(int[] testScores){
        double averageTotal = 0;
        for(int i = 0; i < testScores.length; i++){
            averageTotal = averageTotal + testScores[i];
        }
        System.out.printf("Average score is %.1f", (averageTotal/testScores.length));
    }
}
