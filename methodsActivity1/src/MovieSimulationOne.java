import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the number of movies: ");
        final int numMovies = scnr.nextInt();
        String[] movieNames = new String[numMovies];
        String[] movieTypes = new String[numMovies];
        int[] movieAvailability = new int[numMovies];
        double[] moviePrices = new double[numMovies];

        for(int i = 0; i < movieNames.length; i++) {
            System.out.printf("Enter movie %d name: ", i + 1);
            movieNames[i] = scnr.nextLine();
            System.out.printf("Enter movie %d type: ", i + 1);
            movieTypes[i] = scnr.nextLine();
            System.out.printf("Enter 0 if movie %d seat available, 1 if unavailable: ", i + 1);
            movieAvailability[i] = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter movie %d price: ", i + 1);
            moviePrices[i] = Double.parseDouble(scnr.nextLine());
            System.out.println(" - + - ");
        }
        System.out.println();
        displayMovieDetails(movieNames, movieTypes, movieAvailability, moviePrices);
    }

    static void displayMovieDetails(String[] movieNames, String[] movieTypes, int[] movieAvailability, double[] moviePrices){
        System.out.printf("\n%s Movie Details %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %-20s %s\n", "Movie Names", "Movie Types", "Available Seats", "Prices");
        for (int i = 0; i < movieNames.length; i++){
            System.out.printf("Movie %d: %-15s %-24s %-12d %.2f\n", i + 1, movieNames[i], movieTypes[i], movieAvailability[i], moviePrices[i]);
        }
    }
}
