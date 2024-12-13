package weekThree;
import java.util.Scanner;

public class Triangles {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        String triangle;

        System.out.println("Length of Side1: ");
        side1 = scn.nextInt();
        System.out.println("Length of Side2: ");
        side2 = scn.nextInt();
        System.out.print("Length of Side3: ");
        side3 = scn.nextInt();

        if(side1 != side2 && side2 != side3){
            System.out.println("Triangle is Scalene");
        }
        else if(side1 == side2 && side2 == side3){
            System.out.println("Triangle is equilateral");
        }
        else if(side1 == side2 || side2 == side3){
            System.out.println("Triangle is isosceles");
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
