import java.util.Scanner;
import java.util.Random;

public class ESP {
    public static void main(String [] args) {
    int guessEstimate = 0;
    String correctAnswer;
    int correctAnswerUser = 0;
    int correctAnswerEstimate = 0;
    Scanner scnr = new Scanner(System.in);
    while (guessEstimate <= 10) { // Get values until 0 (or less)
        Random rand = new Random();
        int randomInt = rand.nextInt(5);
        System.out.println("What color has the computer chosen?");
        correctAnswer = scnr.nextLine();
        switch (correctAnswer) {
            case "red" -> correctAnswerUser = 0;
            case "green" -> correctAnswerUser = 1;
            case "blue" -> correctAnswerUser = 2;
            case "orange" -> correctAnswerUser = 3;
            case "yellow" -> correctAnswerUser = 4;
        }
        if(correctAnswerUser == randomInt){
            correctAnswerEstimate = correctAnswerEstimate + 1;
            guessEstimate = guessEstimate + 1;
        }
        else{
            guessEstimate = guessEstimate + 1;
        }
    }
    System.out.println("You got " + correctAnswerEstimate + " out of 10 correct!");
}
}
