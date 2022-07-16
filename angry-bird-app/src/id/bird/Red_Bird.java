package id.bird;

public class Red_Bird extends Bird {

    public Red_Bird(String name, String color, Integer attackPower) {
        super(name, color, attackPower);
        this.specialPower = "Destroy Pig's Vechile";
        this.character = "Angry";
        this.hasComposition = false;
    }

}
