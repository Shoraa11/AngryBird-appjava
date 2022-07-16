package id.bird;

public class Blue_Bird extends Bird {

    public Blue_Bird(String name, String color, Integer attackPower) {
        super(name, color, attackPower);
        this.specialPower = "Killing Pig as A Group, Destroy Ice";
        this.character = "Triplets";
        this.hasComposition = true;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        if (this.hasComposition) {
            System.out.println("Has Composition : " + 3);
        }
    }
}
