import java.util.*;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numFloors;
        int numFloorsCheck;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;;
        double occupancyRate = 0;

        numFloors = 0;
        System.out.print("Enter number of floors: ");
        numFloors = scnr.nextInt();
        for(numFloorsCheck = 1; numFloorsCheck <= numFloors; numFloorsCheck = numFloorsCheck + 1) {
            System.out.print("Enter number of rooms on floor " + numFloorsCheck + ": ");
            int rooms = scnr.nextInt();
            totalRooms = totalRooms + rooms;
            System.out.print("How many of the floor rooms are occupied? ");
            int occupiedRooms = scnr.nextInt();
            totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
        }
        occupancyRate = (double)totalOccupiedRooms / totalRooms;
        System.out.println("Floors: " + numFloors);
        System.out.println("Rooms: " + totalRooms);
        System.out.println("Occupied Rooms: " + totalOccupiedRooms);
        System.out.println("Vacant Rooms: " + (totalRooms - totalOccupiedRooms));
        System.out.println("Occupancy: " + occupancyRate + "(" + (occupancyRate * 100) + "%)");
    }
}
