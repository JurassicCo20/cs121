import java.util.Random;
import java.util.Scanner;

public class MovieSimulationFour {
    static Scanner scnr = new Scanner(System.in);
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
        selectSeats(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    public static void selectSeats(int[][] movieAvailability){
        Random random = new Random();
        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = random.nextInt(2);
            }
        }

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
        System.out.print("Enter the number of tickets you'd like to purchase: ");
        int ticketsPerMovie = scnr.nextInt();
        for(int i = 1; i <= ticketsPerMovie; i++){
            System.out.printf("Please pick an available seat (e.g. A2) for ticket %d: ", i);
            String ticket = scnr.nextLine();
            int ticketRow = ticket.charAt(0) - 65;
            String ticketNumber = String.valueOf(ticket.charAt(1));
            int numberIndex = Integer.parseInt(ticketNumber) - 1;
            if(movieAvailability[ticketRow][numberIndex] == 1){
                while(movieAvailability[ticketRow][numberIndex] == 1){
                    System.out.println("Sorry, seat " + ticket + " is already booked. Try again!");
                    System.out.printf("Please pick an available seat (e.g. A2) for ticket %d: ", i);
                    ticket = scnr.nextLine();
                    ticketRow = ticket.charAt(0) - 65;
                    ticketNumber = String.valueOf(ticket.charAt(1));
                    numberIndex = Integer.parseInt(ticketNumber) - 1;
                }
            }
            System.out.println("You have successfully booked seat " + ticket);
            movieAvailability[ticketRow][numberIndex] = 1;
        }
        System.out.println("All seats are booked! Enjoy your movie!");
    }
    public static void randomizeAvailability(int[][] movieAvailability) {

    }
    static int selectMovie(String[] movieNames){
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

    }
}
