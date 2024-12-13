package weekTen.labTen;

public class Warrior extends Character implements Fighter{
    private int strength;

    Warrior(String name, int health, int strength){
        super(name,health);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack(){
        System.out.println("Thor slashes with a sword! Strength: 30");
    }

    @Override
    public void defend(){
        System.out.println("Thor raises a shield to block the attack.");
    }
}
