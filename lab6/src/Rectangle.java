import java.util.Scanner;

public class Rectangle {
    static Scanner scnr = new Scanner(System.in);
    public static int getLength(){
        System.out.print("Enter the length of a rectangle: ");
        return scnr.nextInt();
    }
    public static int getWidth(){
        System.out.print("Enter the width of a rectangle: ");
        return scnr.nextInt();
    }
    public static double getArea(int length, int width){
        return (double) (length * width);
    }
    public static void displayData(int length, int width, double area){
        System.out.printf("Rectangle length: %d\n", length);
        System.out.printf("Rectangle width: %d\n", width);
        System.out.printf("Rectangle area: %.2f", area);
    }
    public static void main(String[] args) {
        int length = getLength();
        int width = getWidth();
        double area = getArea(length,width);
        displayData(length,width,area);
        scnr.close();
    }
}
