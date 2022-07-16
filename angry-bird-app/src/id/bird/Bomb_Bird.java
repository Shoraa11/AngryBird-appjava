package id.bird;

public class Bomb_Bird extends Bird {

    public Bomb_Bird(String name, String color, Integer attackPower) {
        super(name, color, attackPower);
        this.specialPower = "Explode";
        this.character = "Big and Exploder";
        this.hasComposition = false;
    }

}
