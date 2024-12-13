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

        numStudents = 0;
        numTestsStudents = 0;
            System.out.print("Enter number of students: ");
            numStudents = scnr.nextInt();
            System.out.print("Enter number of test scores per student: ");
            numTestsStudents = scnr.nextInt();
            for(numStudentsCheck = 1; numStudentsCheck <= numStudents; numStudentsCheck = numStudentsCheck + 1) {
                for(numTestsCheck = 0; numTestsCheck < numTestsStudents; numTestsCheck = numTestsCheck + 1) {
                    scoreCheck = scoreCheck + 1;
                    System.out.println("Enter score " + scoreCheck + ": ");
                    int guess = scnr.nextInt();
                    averageStudents = averageStudents + guess;
                }
                System.out.println("The average for student " + numStudentsCheck + " is " + (averageStudents/numStudents));
                scoreCheck = 0;
            }
        }
    }
