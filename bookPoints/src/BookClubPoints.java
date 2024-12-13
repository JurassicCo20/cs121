import java.util.Scanner;

public class BookClubPoints {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int booksPurch;
        int points = 0;

        System.out.print("How many books you purchased this month: ");
        booksPurch = scn.nextInt();

        if (booksPurch == 0) {
            points = 0;
        } else if (booksPurch == 1) {
            points = 5;
        } else if (booksPurch == 2) {
            points = 15;
        } else if (booksPurch == 3) {
            points = 30;
        } else if (booksPurch >= 4){
            points = 60;
        }
        System.out.printf("Points: %d",points);
    }
}
