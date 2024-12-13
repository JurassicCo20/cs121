package packagesDemo;

public class Dinosaur {
    //variables
    public String dinosaurName;
    public String eatingType;
    private int toeCount;
    private int babyCount;

    //constructor
    public Dinosaur(String dinosaurName, String eatingType, int toeCount, int babyCount){
        this.dinosaurName = dinosaurName;
        this.eatingType = eatingType;
        this.toeCount = toeCount;
        this.babyCount = babyCount;
    }
    public String getDinosaurName() {
        return dinosaurName;
    }
    void findEatingType(String food) {
        if(food.equals("plants")){
            this.eatingType = "herbivore";
            System.out.printf("Eating Type: %s\n", eatingType);
        }
        else if(food.equals("meat")){
            this.eatingType = "carnivore";
            System.out.printf("Eating Type: %s\n", eatingType);
        }
        else if(food.equals("meat and plants")){
            this.eatingType = "omnivore";
            System.out.printf("Eating Type: %s\n", eatingType);
        }
    }
    void calculateToeCount(String eatingType) {
        if(eatingType.equals("herbivore")){
            this.toeCount = 4;
            System.out.printf("Toe Count: %d\n", toeCount);
        }
        else if(eatingType.equals("carnivore")){
            this.toeCount = 3;
            System.out.printf("Toe Count: %d\n", toeCount);
        }
        else if(eatingType.equals("omnivore")){
            this.toeCount = 4;
            System.out.printf("Toe Count: %d\n", toeCount);
        }
    }
    public int getBabyCount() {
        return babyCount;
    }
}
