import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReview {
    Scanner scnr = new Scanner(System.in);

    private java.util.ArrayList<String> movieArrayList = new java.util.ArrayList<>();
    private java.util.ArrayList<String> genreArrayList = new java.util.ArrayList<>();
    private java.util.ArrayList<Integer> starArrayList = new java.util.ArrayList<>();
    private java.util.ArrayList<String> ratingArrayList = new java.util.ArrayList<>();

    public void findMovies(){
        while(true){
            System.out.print("\tEnter a movie name or q if " + "finished: ");
            String moveName = scnr.nextLine();
            if(moveName.equals("q")){
                break;
            }
            else{
                String movie = scnr.nextLine();
                movieArrayList.add(movie);
            }
            System.out.print("Please the movie's genre: ");
            String genre = scnr.nextLine();
            genreArrayList.add(genre);
            System.out.print("Please type how many stars you give the movie: ");
            int stars = Integer.parseInt(scnr.nextLine());
            starArrayList.add(stars);
        }
    }
    public void starToWord(){
        for (int stars : starArrayList) {
            if (stars == 1) {
                ratingArrayList.add("Poor");
            }
            if (stars == 2) {
                ratingArrayList.add("Below Average");
            }
            if (stars == 3) {
                ratingArrayList.add("Average");
            }
            if (stars == 4) {
                ratingArrayList.add("Above Average");
            }
            if (stars == 5) {
                ratingArrayList.add("Excellent");
            }
        }
    }
    public void printRatings(){
        System.out.printf("%-5s %s %s %s\n", "Movie | ", "Genre | ", "Stars | ", "Rating");
        for (int i = 0; i < movieArrayList.size(); i++) {
            System.out.printf("%-6s %-6s %-7d %-6s\n", movieArrayList.get(i), genreArrayList.get(i), starArrayList.get(i), ratingArrayList.get(i));
            System.out.println();
        }
    }
}
