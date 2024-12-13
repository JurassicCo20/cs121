package weekFive;

import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String[] herbivores = new String[4];
        int[] numberOfPlants = new int[4];
        double[] weight = new double[4];

        for (int i = 1; i < 5; i++) {
            System.out.println(">> " + i + ". Enter herbivore ");
            herbivores[i] = scnr.nextLine();
            System.out.println(">> " + i + ". Enter the number of plants it eats ");
            numberOfPlants[i] = scnr.nextInt();
            System.out.println(">> " + i + ". Enter the herbivore's weight ");
            weight[i] = scnr.nextDouble();
        }
        System.out.printf("%-5s %-5s %-5s\n", "Herbivore", "# of Plants", "Weight");
        for (int i = 0; i < herbivores.length; i++) {
            System.out.printf("%-6s %-15d %-7.2f\n", herbivores[i], numberOfPlants[i] , weight[i]);
        }
        scnr.close();
    }
}
