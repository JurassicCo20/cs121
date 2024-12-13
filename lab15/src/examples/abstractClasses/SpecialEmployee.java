package examples.abstractClasses;

public class SpecialEmployee extends Employee{ //inheritance
    private double salary; //encapsulation
    private int extraDays;
    private double extraWagePerDay;

    public SpecialEmployee(int id, String name, double salary, int extraDays, double extraWagePerDay){
        super(id,name);
        this.salary = salary;
        this.extraDays = extraDays;
        this.extraWagePerDay = extraWagePerDay;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getExtraDays(){
        return extraDays;
    }
    public void setExtraDays(int extraDays){
        this.extraDays = extraDays;
    }
    public double getExtraWagePerDay(){
        return extraWagePerDay;
    }
    public void setExtraWagePerDay(double extraWagePerDay){
        this.extraWagePerDay = extraWagePerDay;
    }
    @Override
    public double calculatePay() {
        return salary + (extraDays * extraWagePerDay);
    }
}
