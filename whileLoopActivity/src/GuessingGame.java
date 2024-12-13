import java.util.*;

    public class GuessingGame {
        public static void main(String [] args) {
            Scanner scnr = new Scanner(System.in);
            int correctGuess = 38;
            int inputValue;
            int guessEstimate = 0;
            System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");
            String guess = scnr.nextLine();
            inputValue = Integer.parseInt(guess);
            while (true) { // Get values until 0 (or less)
                if (guess.equals("q")){
                    break;
                }
                if(inputValue > correctGuess){
                    System.out.println("Too high, guess again:");
                    System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");
                    guessEstimate = guessEstimate + 1;
                    guess = scnr.nextLine();
                }
                else if(inputValue < correctGuess){
                    System.out.println("Too low, guess again:");
                    System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");
                    guessEstimate = guessEstimate + 1;
                    guess = scnr.nextLine();
                }
                else if(inputValue == correctGuess){
                    System.out.println("Correct!");
                    System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");
                    guessEstimate = guessEstimate + 1;
                    System.out.println("Number of guesses: " + guessEstimate);
                    break;
                }
                inputValue = Integer.parseInt(guess);
            }
            if(inputValue != correctGuess){
                System.out.println("Quitter! The number was " + correctGuess);
            }
        }
    }
