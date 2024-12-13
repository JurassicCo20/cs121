import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    public static void main(String[] args){
        final int rows = 5;
        final int columns = 10;
        String[] movieNames = {"Barbie", "Jurassic Park", "Cats", "Madagascar"};
        String[] movieTypes = {"2D", "3D", "2D", "3D"};
        double[] moviePrices = {12.00, 15.00, 13.00, 14.00};
        int[][] movieAvailability = new int[rows][columns];
        displayMovieDetails(movieNames, movieTypes, moviePrices);

        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    public static void randomizeAvailability(int[][] movieAvailability) {
        Random random = new Random();
        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = random.nextInt(2);
            }
        }
    }
    static int selectMovie(String[] movieNames){
        Scanner scnr = new Scanner(System.in);
        String selectedMovie;
        while (true){
            System.out.print("\nEnter the movie name you are purchasing tickets for: ");
            selectedMovie = scnr.nextLine();
            for(int i = 0; i < movieNames.length; i++){
                if(selectedMovie.equals(movieNames[i])){
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }
    public static void displaySelectedMovie(String movieName, String movieType, double moviePrice){
        System.out.printf("\n%s Movie Selection %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s %.2f\n", movieName, movieType, moviePrice);
    }
    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices){
        System.out.printf("\n%s Movie Details %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Names", "Movie Types", "Movie Prices");
        for (int i = 0; i < movieNames.length; i++){
            System.out.printf("Movie %d: %-15s %-24s %.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
    public static void setSeatAvailability(int[][] movieAvailability){
        for(int i = 0; i < movieAvailability.length; i++){
            for(int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = 0;
            }
        }
    }
    public static void displaySeatAvailability(int[][] movieAvailability){
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available]\n\n ");

        for(int col = 1; col <= movieAvailability[0].length; col++){
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));

        for(int i = 0; i < movieAvailability.length; i++){
            System.out.printf("%c|", rowLabel[i]);
            for(int j = 0; j < movieAvailability[i].length; j++){
                System.out.printf("%d ", movieAvailability[i][j]);
            }
            System.out.println();
        }
    }
}
