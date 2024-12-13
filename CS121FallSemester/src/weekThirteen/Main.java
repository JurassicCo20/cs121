package weekThirteen;

public class Main {
    public static void main(String[] args) {
        DataStructure struc = new DataStructure();
        struc.addStudent("London");
        struc.addStudent("Bridget");
        struc.addStudent("Noir");
        System.out.println("Current Students:");
        struc.displayStudents();
        struc.removeStudent(1);
        System.out.println("\nNew Students:\n");
        struc.displayStudents();

        struc.addAge(0,15);
        struc.addAge(1,13);
        struc.addAge(2,18);
        System.out.println("\nCurrent Ages:");
        struc.displayAges();
        struc.removeAge(1);
        System.out.println("\nNew Ages:\n");
        struc.displayAges();

        struc.addMajorGpaMap("Chemistry", 3.4);
        struc.addMajorGpaMap("Math", 3.1);
        struc.addMajorGpaMap("English", 2.2);
        System.out.println("\nCurrent GPA's:\n");
        struc.displayAllGpas();
        struc.removeMajorGpaMap("English");
        System.out.println("\nNew GPA's:\n");
        struc.displayAllGpas();

        struc.addNationality("Indian");
        struc.addNationality("Scottish");
        struc.addNationality("Chinese");
        System.out.println("\nCurrent Nationalities:\n");
        struc.displayNationality();
        struc.removeNationality("Chinese");
        System.out.println("\nNew Nationalities:\n");
        struc.displayNationality();

        struc.addHometown("Novi");
        struc.addHometown("Indianapolis");
        struc.addHometown("Cincinnati");
        System.out.println("\nCurrent Hometowns:\n");
        struc.displayHometown();
        struc.removeHometown("Novi");
        System.out.println("\nNew Hometowns:\n");
        struc.displayHometown();

        struc.addHomeState("MI");
        struc.addHomeState("IN");
        struc.addHomeState("OH");
        System.out.println("\nCurrent Home States:\n");
        struc.displayHomeStates();
        struc.removeHomeState();
        System.out.println("\nNew Home States:\n");
        struc.displayHomeStates();
    }
}
