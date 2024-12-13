import java.util.Scanner;

public class ArrayReview {
    Scanner scnr = new Scanner(System.in);
    String[] movie = new String[5];
    String[] genre = new String[5];
    int[] starRating = new int[5];

    String[] ratings = new String[5];
    public void starToWord(){
        for (int i = 0; i < 4; i++) {
            int stars = starRating[i];
            if(stars == 1){
                ratings[i] = "Poor";
            }
            if(stars == 2){
                ratings[i] = "Below Average";
            }
            if(stars == 3){
                ratings[i] = "Average";
            }
            if(stars == 4){
                ratings[i] = "Above Average";
            }
            if(stars == 5){
                ratings[i] = "Excellent";
            }
        }
    }
    public void findMovies(){
        for (int i = 0; i < 4; i++) {
            System.out.print("Please a movie title: ");
            movie[i] = scnr.nextLine();
            System.out.print("Please the movie's genre: ");
            genre[i] = scnr.nextLine();
            System.out.print("Please type how many stars you give the movie: ");
            starRating[i] = Integer.parseInt(scnr.nextLine());
            System.out.println();
        }
    }


    public void printRatings(){
        System.out.printf("%-5s %s %s %s\n", "Movie | ", "Genre | ", "Stars | ", "Rating");
        for (int i = 0; i < movie.length; i++) {
            System.out.printf("%-6s %-6s %-7d %-6s\n", movie[i], genre[i] , starRating[i], ratings[i]);
            System.out.println();
        }
    }
}
