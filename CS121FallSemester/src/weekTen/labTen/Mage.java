package weekTen.labTen;
public class Mage extends Character implements Fighter{
    private int magicPower;

    Mage(String name, int health, int magicPower){
        super(name,health);

        this.magicPower = magicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public void attack(){
        System.out.println("Gandalf casts a fireball! Magic Power: 50");
    }

    @Override
    public void defend(){
        System.out.println("Gandalf conjures a magical barrier.");
    }
}

