package id.bird;

import id.pig.Armor_Pig;
import id.pig.Hat_Pig;

abstract class Bird {

    // properti bird
    protected String name;
    protected String color;
    protected Integer attackPower;
    protected String specialPower;
    protected Boolean hasComposition;
    protected String character;

    // konstruktor berparameter name,color,attackpower
    public Bird(String name, String color, Integer attackPower) {
        this.name = name;
        this.color = color;
        this.attackPower = attackPower;
    }

    // method enkapsulasi
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setAttackPower(Integer newAttackPower) {
        this.attackPower = newAttackPower;
    }

    public Integer getAttackPower() {
        return this.attackPower;
    }

    public String getSpecialPower() {
        return this.specialPower;
    }

    public void setCharacter(String newCharacter) {
        this.character = newCharacter;
    }

    public String getCharacter() {
        return this.character;
    }

    // method attack armor pig
    public void attack(Armor_Pig armorPig) {
        if (this.getAttackPower() > armorPig.getDefense()) {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + armorPig.getName() + " (defense :" + armorPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : menang ");
            System.out.println(armorPig.getName() + " : kalah \n");

        } else if (this.getAttackPower() < armorPig.getDefense()) {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + armorPig.getName() + " (defense :" + armorPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : kalah ");
            System.out.println(armorPig.getName() + " : menang \n");
        } else {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + armorPig.getName() + " (defense :" + armorPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : kalah ");
            System.out.println(armorPig.getName() + " : kalah \n");
        }
    }

    // overloading method attack --> menerima 2 paramete yang berbeda
    public void attack(Hat_Pig hatPig) {
        if (this.getAttackPower() > hatPig.getDefense()) {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + hatPig.getName() + " (defense :" + hatPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : menang ");
            System.out.println(hatPig.getName() + " : kalah \n");
        } else if (this.getAttackPower() < hatPig.getDefense()) {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + hatPig.getName() + " (defense :" + hatPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : kalah ");
            System.out.println(hatPig.getName() + " : menang \n");
        } else {
            System.out.println("> " + this.getName() + " (attack power:" + this.getAttackPower() + ") attacking "
                    + hatPig.getName() + " (defense :" + hatPig.getDefense() + ")");
            System.out.println("-----------------------------------------");
            System.out.println(this.getName() + " : kalah ");
            System.out.println(hatPig.getName() + " : kalah \n");
        }
    }

    // properti main program
    public void getInfo() {
        System.out.println("Name  : " + getName());
        System.out.println("Color : " + getColor());
        System.out.println("Attack Power  : " + getAttackPower());
        System.out.println("Special Power : " + getSpecialPower());
        System.out.println("Character : " + getCharacter());
    };

}
