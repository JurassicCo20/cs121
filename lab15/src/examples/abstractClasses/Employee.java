package examples.abstractClasses;
public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee() { //polymorphism
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getId() {
        return id;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\n", name, id);
    }

    public abstract double calculatePay(); //abstract method
}
