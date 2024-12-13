package weekFour;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int correctAnswerUser = 0;
        int guessCap = 1;
        int correctGuess = 0;
        String computerColor = null;
        String userAnswer;
        while(guessCap <= 10){
            int randomInt = (int)(Math.random() * 4 + 0);
            switch (randomInt){
                case 0 -> computerColor = "red";
                case 1 -> computerColor = "green";
                case 2 -> computerColor = "blue";
                case 3 -> computerColor = "orange";
                case 4 -> computerColor = "yellow";
            }
            System.out.println("What color has the computer chosen?");
            userAnswer = scnr.nextLine();
            switch (userAnswer) {
                case "red" -> correctAnswerUser = 0;
                case "green" -> correctAnswerUser = 1;
                case "blue" -> correctAnswerUser = 2;
                case "orange" -> correctAnswerUser = 3;
                case "yellow" -> correctAnswerUser = 4;
            }
            System.out.printf("> The computer has chosen %s\n", computerColor);
            if(correctAnswerUser == randomInt){
                correctGuess++;
            }
            guessCap++;
        }
        System.out.println("You got " + correctGuess + " out of 10 correct!");
    }
}
