import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String[] juices = new String[4];
        String[] toppings = new String[4];
        int[] addedSyrup = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Please type a juice type: ");
            juices[i] = scnr.nextLine();
            System.out.print("Please type a topping: ");
            toppings[i] = scnr.nextLine();
            System.out.print("Please type how many pumps of syrup you want: ");
            addedSyrup[i] = Integer.parseInt(scnr.nextLine());
            System.out.println();
        }
        System.out.printf("%-5s %s %s\n", "Juices", "Toppings", "Syrup");
        for (int i = 0; i < juices.length; i++) {
            System.out.printf("%-6s %-6s %-7d\n", juices[i], toppings[i] , addedSyrup[i]);
        }
        scnr.close();
    }
}
