package weekTen.labTen;

public class Archer extends Character implements Fighter{
    private int agility;

    Archer(String name, int health, int agility){
        super(name,health);
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void attack(){
        System.out.println("Robin shoots an arrow! Agility: 50");
    }

    @Override
    public void defend(){
        System.out.println("Robin dodges the attack swiftly.");
    }
}
