import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashMapReview {
    Scanner scnr = new Scanner(System.in);
    private Map<String,Integer> movieList = new HashMap<>();


    public void findMovies(){
        while(true){
            String movie;
            System.out.print("\tEnter a movie name or q if " + "finished: ");
            String moveName = scnr.nextLine();
            if(moveName.equals("q")){
                break;
            }
            else{
                movie = scnr.nextLine();
            }
            System.out.print("Please the movie's genre: ");
            System.out.print("Please type your star rating of the movie: ");
            int stars = Integer.parseInt(scnr.nextLine());
            movieList.put(movie, stars);
        }
    }

    public StringBuilder printRatings(){
        StringBuilder allMovies = new StringBuilder();
        movieList.forEach( (movieName, rating) -> {
            allMovies.append( String.format("Movie: %s | Rating: %d\n", movieName, rating));
        });
        return allMovies;
    }
}
