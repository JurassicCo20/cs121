import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random randGenOne = new Random(15);
        Random randGenTwo = new Random(15);
        String nameCharacterOne = "";
        String nameCharacterTwo = "";
        int hitPoints = 0;
        int attackSpeed = 0;
        int[] playerOne = new int[3];
        int[] playerTwo = new int[3];
        int playerOneWin = 0;
        int playerTwoWin = 0;

        System.out.print("Please enter an ODD number of rounds to play! ");
        int roundsConfirmed = scnr.nextInt();
        for(int i = 1; i < roundsConfirmed; i++) {
            System.out.println("Round " + i + ": ");
            System.out.println("------------------");
            for(int l = 1; l <= 2; l++){
                if(l == 1){
                    System.out.println("Player " + l + ": Select a Character and enter its stats");
                    System.out.print("Enter name: ");
                    nameCharacterOne = scnr.nextLine();
                    System.out.print("Enter HP: ");
                    hitPoints = Integer.parseInt(scnr.nextLine());
                    playerOne[0] = hitPoints;
                    System.out.print("Enter move name: ");
                    scnr.nextLine();
                    System.out.print("Enter move power: ");
                    int movePower = Integer.parseInt(scnr.nextLine());
                    playerOne[1] = movePower;
                    System.out.print("Enter attack speed: ");
                    attackSpeed = Integer.parseInt(scnr.nextLine());
                    playerOne[2] = attackSpeed;
                }
                if(l == 2){
                    System.out.println("Player " + l + ": Select a Character and enter its stats");
                    System.out.print("Enter name: ");
                    nameCharacterTwo = scnr.nextLine();
                    System.out.print("Enter HP: ");
                    hitPoints = Integer.parseInt(scnr.nextLine());
                    playerTwo[0] = hitPoints;
                    System.out.print("Enter move name: ");
                    scnr.nextLine();
                    System.out.print("Enter move power: ");
                    int movePower = Integer.parseInt(scnr.nextLine());
                    playerTwo[1] = movePower;
                    System.out.print("Enter attack speed: ");
                    attackSpeed = Integer.parseInt(scnr.nextLine());
                    playerTwo[2] = attackSpeed;
                }
            }
            int rightOfWay = 0;
            if(playerOne[2] > playerTwo[2]){
                rightOfWay = 1;
            }
            else if(playerTwo[2] > playerOne[2]){
                rightOfWay = 2;
            }
            else if(playerTwo[2] == playerOne[2]){
                int playOneNum = randGenOne.nextInt();
                int playTwoNum = randGenTwo.nextInt();
                if(playOneNum > playTwoNum){
                    rightOfWay = 1;
                }
                else if(playTwoNum > playOneNum){
                    rightOfWay = 2;
                }
            }
            while(playerOne[0] != 0 && playerTwo[0] != 0){
                if(rightOfWay == 1){
                    playerTwo[0] = playerTwo[0] - playerOne[1];
                    rightOfWay = 2;
                }
                if(rightOfWay == 2){
                    playerOne[0] = playerOne[0] - playerTwo[1];
                    rightOfWay = 1;
                }
            }
            if(playerOne[0] <= 0){
                System.out.println("Player 1 " + nameCharacterOne + " wins this round!");
                playerOneWin = playerOneWin + 1;
            }
            else if(playerTwo[0] <= 0){
                System.out.println("Player 2 " + nameCharacterTwo + " wins this round!");
                playerTwoWin = playerTwoWin + 1;
            }
            System.out.printf("wins: \nPlayer 1 Wins: %d\nPlayer 2 Wins: %d\n", playerOneWin, playerTwoWin);
        }
        System.out.printf("Final Scores: \nPlayer 1 Wins: %d\nPlayer 2 Wins: %d\n", playerOneWin, playerTwoWin);
        if(playerOneWin > playerTwoWin){
            System.out.println("Player 1 has won the game!");
        }
        if(playerTwoWin > playerOneWin){
            System.out.println("Player 2 has won the game!");
        }
        scnr.close();
    }
}
