package weekSeven;

public class TestClass {
    public static void main(String[] args) {
        String name = "Ladelle";
        String names [] = {"Ladelle", "Emma", "JP"};

        //Create an instance of my Student class
        Student student1 = new Student("Ladelle", 123456, "Computer Science");
        student1.displayStudentInfo();
        Student student2 = new Student();
        student2.displayStudentInfo();
    }
}
