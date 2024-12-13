//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dinosaur dinosaur1 = new Dinosaur();
        Dinosaur dinosaur2 = new Dinosaur("Stegosaurus");
        Dinosaur dinosaur3 = new Dinosaur("Trex", "Walking", 2);
        System.out.printf("Dinosaur Name : %s\n", dinosaur3.getName());
        System.out.printf("Dinosaur Movement Method : %s\n", dinosaur3.getMovingMethod());
        dinosaur3.setWeight(2,dinosaur3.getWeight());
        System.out.printf("Dinosaur Legs : %d\n", dinosaur3.getLegs());
        System.out.printf("Dinosaur weight : %.2f\n", dinosaur3.getWeight());
    }
}