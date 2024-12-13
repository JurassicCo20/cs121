public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("John Doe", "12345", 75600.00, 20000.0, 0.05);
        System.out.println( employee1.getName());
        employee1.setName("John Doe, Jr.");
        System.out.println( employee1.getName());
    }
}
