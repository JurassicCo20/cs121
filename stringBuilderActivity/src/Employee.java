public class Employee {
    String name;
    int id;
    double wage;
    public Employee(String name, int id, double wage){
        this.name = name;
        this.id = id;
        this.wage = wage;
    }


    @Override
    public String toString(){
        return String.format("Employee Name: %s\n Employee ID: %d\n Employee Wage: %.2f\n", name, id, wage);
    }
}
