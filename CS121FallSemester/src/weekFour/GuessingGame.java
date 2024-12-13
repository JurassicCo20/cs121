package weekFour;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = 35;
        int guessAmount = 1;
        System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up: ");
        String guess = scn.nextLine();
        boolean q = false;
        while(!q){
            if(guess.equals("q")){
                System.out.printf("Quitter. The number was %d", number);
                q = true;
                break;
            }
            else{
                int iGuess = Integer.parseInt(guess);
                if(iGuess > number){
                    System.out.println("Too high. Guess again!");
                    guessAmount++;
                    guess = scn.nextLine();
                }
                else if(iGuess < number){
                    System.out.println("Too low. Guess again!");
                    guessAmount++;
                    guess = scn.nextLine();
                }
                else{
                    System.out.println("Correct!!");
                    System.out.printf("Number of guesses: %d", guessAmount);
                    break;
                }
            }
        }
    }
}
