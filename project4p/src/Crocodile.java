public class Crocodile extends Dinosaur {
    private int numberOfFeathers;
    private int yearsOfDeath;
    private int currentYear;

    public Crocodile(String mostUsedName, String scientificName, int legs, String animalType, int currentYear, int yearsOfDeath) {
        super(mostUsedName, scientificName, legs, animalType);
        this.yearsOfDeath = yearsOfDeath;
        this.currentYear = currentYear;
        System.out.println("Crocodile Age: " + calculateBirdAge());
    }

    public int getNumberOfFeathers() {
        return numberOfFeathers;
    }
    public void setNumberOfFeathers(int numberOfFeathers) {
        this.numberOfFeathers = numberOfFeathers;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\n Scientific Name: %s\n Legs: %d\n Animal Type: %s\n Number Of Feathers", mostUsedName, scientificName, legs, animalType, numberOfFeathers);
    }

    public int calculateBirdAge() {
        return (currentYear - yearsOfDeath);
    }
}