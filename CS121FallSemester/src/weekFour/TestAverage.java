package weekFour;

import java.util.*;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numStudents;
        int numStudentsCheck;
        int numTestsCheck;
        int scoreCheck = 0;
        int averageStudents = 0;
        int numTestsStudents;

        System.out.print("Enter number of students: ");
        numStudents = scnr.nextInt();
        System.out.print("Enter number of tests per student: ");
        numTestsStudents = scnr.nextInt();
        for(numStudentsCheck = 1; numStudentsCheck <= numStudents; numStudentsCheck++) {
            System.out.printf("Student number " + numStudentsCheck + "\n%s\n", "-".repeat(20));
            for(numTestsCheck = 0; numTestsCheck < numTestsStudents; numTestsCheck++) {
                scoreCheck++;
                System.out.println("Enter score " + scoreCheck + ": ");
                int guess = scnr.nextInt();
                averageStudents = averageStudents + guess;
            }
            double actualValue = (averageStudents/numTestsStudents);
            System.out.printf("The average for student " + numStudentsCheck + " is %.2f\n\n", actualValue);
            scoreCheck = 0;
            averageStudents = 0;
        }
    }
}
