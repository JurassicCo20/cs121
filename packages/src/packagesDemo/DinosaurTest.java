package packagesDemo;

public class DinosaurTest {
    public static void main(String[] args){
        Dinosaur dinosaur1 = new Dinosaur("T-rex", "carnivore", 3, 5);
        System.out.printf("Dinosaur Name: %s\n", dinosaur1.dinosaurName);
        System.out.printf("Eating Type: %s\n", dinosaur1.eatingType);
        System.out.printf("Toe Count: %d\n", dinosaur1.toeCount); // This variable throws an error
        System.out.printf("Baby Count: %d\n", dinosaur1.babyCount); // This variable throws an error

        System.out.println( dinosaur1.getDinosaurName());
        dinosaur1.findEatingType("meat");
        dinosaur1.calculateToeCount("meat"); // This method does not run
        System.out.println( dinosaur1.getBabyCount());
    }
}
