package weekFour;

public class CFTable {
    public static void main(String[] args) {
        System.out.printf("Celsius %s Fahrenheit\n%s", " ".repeat(5), "*".repeat(25));
        for(int i = 0; i <= 20; i++){
            double fare = (9.0/5.0) * i + 32;
            System.out.printf("\n%s" + i + "%s%.1f", " ".repeat(2), " ".repeat(13),fare);
        }
    }
}
