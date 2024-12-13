public class Employee {
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double raise;
    private double totalPay;

    //constructor
    public Employee(String name, String id, double salary, double bonus, double raise){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.raise = raise;
    }
    public void calculateTotalPay() {
        totalPay = salary + bonus;
        System.out.println(totalPay);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setID(String id) {
        this.id = id;
    }
    public String getID() {
        return id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setRaise(double raise) {
        this.raise = raise;
    }
    public double getRaise() {
        return raise;
    }
    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
    public double getTotalPay() {
        return totalPay;
    }
}
