package weekSix;

import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args){
        final int rows = 5;
        final int columns = 10;
        String[] movieNames = {"Terminator", "Jurassic Park", "Sing", "Wicked"};
        String[] movieTypes = {"3D", "2D", "2D", "3D"};
        double[] moviePrices = {9.00, 11.00, 12.00, 14.00};
        int[][] movieAvailability = new int[rows][columns];
        String dash = "-".repeat(25);
        displayMovieDetails(movieNames, movieTypes, moviePrices);
        setSeatAvailability(movieAvailability);
        System.out.printf("\n%s INITIAL SEATING %s\n", dash, dash);
        displaySeatAvailability(movieAvailability);
        System.out.printf("\n%s RANDOM GENERATED SEATS %s\n", dash, dash);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
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
        System.out.printf("\n%s Movie Details %s\n", "-".repeat(25), "-".repeat(25));
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
