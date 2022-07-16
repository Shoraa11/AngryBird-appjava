package id.pig;

public class Armor_Pig implements Pig {

    protected Integer defense = 1;
    protected Integer armorDefense = 2;
    protected String name;

    public Armor_Pig(String name) {
        this.name = name;
        this.defense += this.armorDefense;
    }

    @Override
    public void getInfo() {
        System.out.println("Name    : " + this.name);
        System.out.println("Defense : " + getDefense());
        System.out.println("Armor Defense : " + this.armorDefense);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Integer getDefense() {
        return this.defense;
    }

    @Override
    public void setDefense(Integer newDefense) {
        this.defense = newDefense;
    }
}
