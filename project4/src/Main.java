import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String mostUsedName, scientificName, animalType;
        int legs, yearOfDeath, currentYear;
        Dinosaur dinos = new Dinosaur();

        while(true) {
            int temp = 1;
            System.out.print("What is the animal's most used name? ");
            mostUsedName = scnr.nextLine();
            if (mostUsedName.equals("q")) {
                break;
            }
            System.out.print("What is the animal's scientific name? ");
            scientificName = scnr.nextLine();
            System.out.print("How many legs does the animal have? ");
            legs = scnr.nextInt();
            System.out.print("Which animal type: dinosaur, bird, or crocodile?");
            animalType = scnr.nextLine().toLowerCase();
            if (animalType.equals("bird")){
                System.out.print("What is the current year?");
                currentYear = scnr.nextInt();
                System.out.print("When was the bird born?");
                yearOfDeath = scnr.nextInt();
                Bird bird = new Bird(mostUsedName, scientificName, legs, animalType, currentYear, yearOfDeath);
                bird.addDino("Bird " + temp);
                temp++;
                return;
            }
            if (animalType.equals("crocodile")){
                System.out.print("What is the current year?");
                currentYear = scnr.nextInt();
                System.out.print("When was the crocodile born?");
                yearOfDeath = scnr.nextInt();
                Crocodile croc = new Crocodile(mostUsedName, scientificName, legs, animalType, currentYear, yearOfDeath);
                croc.addDino("Crocodile " + temp);
                temp++;
                return;
            }
        }

        dinos.getDinoBook();
    }
}