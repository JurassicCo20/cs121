package weekFive.labFive;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRooms;
        int occupiedRooms;
        int totalRooms = 0;
        int totalOccupancy = 0;

        System.out.print("Enter number of floors: ");
        int floorsHotel = scnr.nextInt();
        for(int numFloorsCheck = 1; numFloorsCheck <= floorsHotel; numFloorsCheck++) {
            System.out.println("Enter number of rooms on floor " + numFloorsCheck + ": ");
            numRooms = scnr.nextInt();
            totalRooms = totalRooms + numRooms;
            System.out.println("How many of the floor rooms are occupied?");
            occupiedRooms = scnr.nextInt();
            totalOccupancy = totalOccupancy + occupiedRooms;
        }
        double occupancyRate = ((double)totalOccupancy / totalRooms);
        System.out.printf("Floors: %d\nRooms: %d\nOccupied Rooms: %d\nVacant Rooms: %d\nOccupancy: %.2f" , floorsHotel, totalRooms, totalOccupancy, (totalRooms - totalOccupancy), occupancyRate);
        System.out.print(" (" + (int)(occupancyRate * 100) + "%)");
    }
}
