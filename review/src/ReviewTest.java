public class ReviewTest {
    public static void main(String[] args) {
        ArrayReview newArray = new ArrayReview();
        newArray.findMovies();
        newArray.starToWord();
        newArray.printRatings();
        ArrayListReview newArrayTwo = new ArrayListReview();
        newArrayTwo.findMovies();
        newArrayTwo.starToWord();
        newArrayTwo.printRatings();
        HashMapReview newArrayThree = new HashMapReview();
        newArrayThree.findMovies();
        newArrayThree.printRatings();
    }
}
