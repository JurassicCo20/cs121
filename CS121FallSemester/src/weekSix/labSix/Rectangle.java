package weekSix.labSix;
import java.util.Scanner;

public class Rectangle {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        double length,width,area;
        length = getLength();
        width = getWidth();
        area = getArea(length,width);
        displayData(length,width,area);
        scnr.close();
    }
    public static void displayData(double length, double width, double area){
        System.out.printf("Rectangle length: %.2f\n", length);
        System.out.printf("Rectangle width: %.2f\n", width);
        System.out.printf("Rectangle area: %.2f", area);
    }
    public static double getLength(){
        System.out.println("Enter the length of a rectangle: ");
        return Double.parseDouble(scnr.nextLine());
    }
    public static double getWidth(){
        System.out.println("Enter the width of a rectangle: ");
        return Double.parseDouble(scnr.nextLine());
    }
    public static double getArea(double length, double width){
        return length * width;
    }
}
