import java.util.Scanner;
public class RecursionTest {
    public static void main(String[] args){
        Recursion newRecourse = new Recursion();

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scnr.nextInt();
        newRecourse.countDown(number);
        System.out.print("Enter a character: ");
        char nextChar = scnr.next().charAt(0);
        newRecourse.alphaBackwards(nextChar);
    }
}
