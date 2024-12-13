package weekFour;
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle in mph: ");
        int speed = scn.nextInt();
        System.out.print("Enter the number of hours traveling: ");
        int hours = scn.nextInt();
        System.out.printf("Hour %s Distance Traveled\n%s", " ".repeat(5), "-".repeat(25));
        for(int i = 1; i <= hours; i++){
            int distance = speed * i;
            System.out.printf("\n%s" + i + "%s%d", " ".repeat(2), " ".repeat(13),distance);
        }
    }
}
