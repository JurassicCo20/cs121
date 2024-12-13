package examples.abstractClasses;

public class Main {
    public static void main(String[] args){
        SpecialEmployee employee1 = new SpecialEmployee(10985,"James Brown", 15.65, 5, 5.15);
        System.out.printf("Calculated Pay: %.2f\n", employee1.calculatePay());

        SpecialEmployee employee2 = new SpecialEmployee(50914, "Brianna May", 30.14, 1, 2.15);

        System.out.printf("Calculated Pay: %.2f\n", employee2.calculatePay());
    }
}