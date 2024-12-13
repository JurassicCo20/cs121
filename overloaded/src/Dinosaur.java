public class Dinosaur {
    //variables
    private String name;
    private String movingMethod;
    private int legs;
    private double weight;

    public Dinosaur() {
    }
    public Dinosaur(String name){
        this.name = name;
    }
    //constructor
    public Dinosaur(String name, String movingMethod, double weight){
        this.name = name;
        this.movingMethod = movingMethod;
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMovingMethod(String  movingMethod) {
        this.movingMethod = movingMethod;
    }
    public String getMovingMethod() {
        return movingMethod;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setWeight(int legs, double removeweight) {
        if(legs == 3){
            weight = weight - removeweight;
        }
        if(legs == 2){
            weight = weight + removeweight;
        }
    }
    public double  getWeight() {
        return weight;
    }
}

