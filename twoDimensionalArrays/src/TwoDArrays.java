import java.util.Scanner;
public class TwoDArrays {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int[][] array1 = { {3, 1, 2}, {11, 9, 10}, {30, 50, 61}, {30, 90, 95} };
        double[][] array2 = new double[4][3];
        String[][] newArray = { {"June", "July", "August"}, {"October", "November", "December"} };

        array2[0][0] = 1.0;
        array2[0][1] = 1.2;
        array2[0][2] = 1.4;
        array2[1][0] = 2.4;
        array2[1][1] = 3.5;
        array2[1][2] = 1.4;
        array2[2][0] = 6.7;
        array2[2][1] = 6.9;
        array2[2][2] = 7.8;
        array2[3][0] = 2.4;
        array2[3][1] = 2.8;
        array2[3][2] = 6.8;

        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Array 2");
        for (double[] row : array2){
            for (double column: row){
                System.out.printf(column + " ");
            }
            System.out.println();
        }
        System.out.println("Array 3");
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < newArray[i].length; j++){
                System.out.printf("%s ", newArray[i][j]);
            }
            System.out.println();
        }
        scnr.close();
    }
}
