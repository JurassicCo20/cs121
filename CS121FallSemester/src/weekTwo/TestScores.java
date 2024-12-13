package weekTwo;
import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
        char letterGrade = 0;
        int testScoreOne = Integer.parseInt(JOptionPane.showInputDialog("Enter your first test score: "));
        int testScoreTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter your second test score: "));
        int testScoreThree = Integer.parseInt(JOptionPane.showInputDialog("Enter your third test score: "));

        int testAverage = (testScoreOne + testScoreTwo + testScoreThree) / 3;

        if (testAverage >= 90){
            letterGrade = 'A';
        }
        else if (testAverage >= 80){
            letterGrade = 'B';
        }
        else if (testAverage >= 70){
            letterGrade = 'C';
        }
        else if (testAverage >= 60){
            letterGrade = 'D';
        }
        else{
            letterGrade = 'F';
        }
        JOptionPane.showMessageDialog(null,String.format("Your average test score was: %d\nYour letter grade is: %c",testAverage,letterGrade));
    }
}
