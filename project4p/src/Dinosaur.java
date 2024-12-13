import java.util.LinkedList;
public class Dinosaur {
    protected String mostUsedName;
    protected String scientificName;
    protected int legs;
    protected String animalType;
    private LinkedList<String> dinoList = new LinkedList<>();
    public Dinosaur(){
    }
    public Dinosaur(String mostUsedName, String scientificName, int legs, String animalType){
        this.mostUsedName = mostUsedName;
        this.scientificName = scientificName;
        this.legs = legs;
        this.animalType = animalType;
    }

    public void addDino(String dino){
        dinoList.add(dino);
    }
    public void removeDino(String dino){
        dinoList.remove(dino);
    }

    public void getDinoBook(){
        System.out.printf("\n%s DINOSAURS %s\n", "=".repeat(10), "=".repeat(10));
        for(String dino : dinoList){
            System.out.println(dino);
        }
    }
    public String getMostUsedName() {
        return mostUsedName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public int getLegs() {
        return legs;
    }

    public LinkedList<String> getNameList() {
        return dinoList;
    }

    public void setMostUsedName(String mostUsedName) {
        this.mostUsedName = mostUsedName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setNameList(LinkedList<String> nameList) {
        this.dinoList = nameList;
    }
    public void sortDinosaurs(){
        String temp;
        for(int i = 1; i < dinoList.size(); i++){
            for(int index = i; index > 0; index--){
                if(dinoList.get(index).charAt(0) < dinoList.get(index - 1).charAt(0)){
                    temp = dinoList.get(index);
                    dinoList.set(index, dinoList.get(index - 1));
                    dinoList.set(index - 1, temp);
                }
            }
        }
    }

    @Override
    public String toString(){
        return String.format("Name: %s\n Scientific Name: %s\n Legs: %d\n Animal Type: %s", mostUsedName, scientificName, legs, animalType);
    }
}
