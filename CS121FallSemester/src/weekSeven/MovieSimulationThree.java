package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    public static void main(String[] args){
        final int rows = 5;
        final int columns = 10;
        String[] movieNames = {"Terminator", "Jurassic Park", "Sing", "Wicked"};
        String[] movieTypes = {"3D", "2D", "2D", "3D"};
        double[] moviePrices = {9.00, 11.00, 12.00, 14.00};
        int[][] movieAvailability = new int[rows][columns];
        String dash = "-".repeat(25);
        displayMovieDetails(movieNames, movieTypes, moviePrices);

        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        System.out.printf("\n%s AVAILABLE SEATS %s\n", dash, dash);
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available]\n\n ");

        theaterSeatsRandom(movieAvailability);

    }

    public static void theaterSeatsRandom(int[][] randomSeats){
        Random random = new Random();
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.print("  ");
        for(int c = 1; c <= randomSeats[0].length; c++){
            System.out.printf("%d ",c);
        }
        System.out.printf("\n  %s", "-".repeat(30));
        for(int i = 0; i < randomSeats.length; i++){
            System.out.printf("\n%c |", rowLabel[i]);
            for(int j = 0; j < randomSeats[i].length; j++){
                randomSeats[i][j] = random.nextInt(2);
                System.out.printf("%d ", randomSeats[i][j]);
            }
            System.out.println();
        }
    }

    static int selectMovie(String[] movieNames){
        Scanner scnr = new Scanner(System.in);
        String selectedMovie;
        while (true){
            System.out.print("\nEnter the movie name you are purchasing tickets for: ");
            selectedMovie = scnr.nextLine();
            for(int i = 0; i < movieNames.length; i++){
                if(selectedMovie.equalsIgnoreCase(movieNames[i])){
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    static void displaySelectedMovie(String movieName, String movieType, double moviePrice){
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s %.2f\n", movieName, movieType, moviePrice);
    }
    static void randomizeAvailability(int[][] movieAvailability) {
        Random randGen = new Random();
        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = randGen.nextInt(2);
            }
        }
    }
    static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices){
        System.out.printf("\n%s MOVIE SHOWCASE %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Names", "Movie Types", "Movie Prices");
        for (int i = 0; i < movieNames.length; i++){
            System.out.printf("Movie %d: %-15s %-24s %.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
    static void setSeatAvailability(int[][] movieAvailability){
        for(int i = 0; i < movieAvailability.length; i++){
            for(int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = 0;
            }
        }
    }
    static void displaySeatAvailability(int[][] movieAvailability){
        System.out.println("\nSeating Availability: [1 = unavailable, 0 = available]\n");
        for(int i = 0; i < movieAvailability.length; i++){
            for(int j = 0; j < movieAvailability[i].length; j++){
                System.out.printf("%d ", movieAvailability[i][j]);
            }
            System.out.println();
        }
    }
}
