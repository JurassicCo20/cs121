import java.util.ArrayList;

public class EmployeeRecord {
    private ArrayList<Employee> employeeInfo = new ArrayList<>();
    public void addEmployee(Employee employee){
        employeeInfo.add(employee);
    }
    public StringBuilder getAllEmployees(){
        StringBuilder employees = new StringBuilder();
        for (Employee e : employeeInfo) {
            employees.append(e + "\n");
        }
        return employees;
    }

}
