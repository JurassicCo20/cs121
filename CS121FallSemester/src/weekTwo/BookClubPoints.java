package weekTwo;
import javax.swing.JOptionPane;

public class BookClubPoints {
    public static void main(String[] args) {
        int points;
        int booksPurchase = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of books purchased: "));

        if(booksPurchase == 0){
            points = 0;
        }
        else if(booksPurchase == 1){
            points = 5;
        }
        else if(booksPurchase == 2){
            points = 15;
        }
        else if(booksPurchase == 3){
            points = 30;
        }
        else if(booksPurchase >= 4){
            points = 60;
        }
        else{
            points = -1;
            JOptionPane.showMessageDialog(null,"Invalid input!");
        }
        String message = String.format("The amount you are awarded is: %d", points);
        JOptionPane.showMessageDialog(null, message);
    }
}
