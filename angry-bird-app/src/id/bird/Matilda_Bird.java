package id.bird;

public class Matilda_Bird extends Bird {

    protected String shape;

    public Matilda_Bird(String name, String color, Integer attackPower) {
        super(name, color, attackPower);
        this.shape = "Egg";
        this.specialPower = "Throw Eggs";
        this.character = "Bomb Lover";
        this.hasComposition = false;
    }

    public String getShape() {
        return this.shape;
    }

    public void setShape(String newShape) {
        this.shape = newShape;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Shape  : " + getShape());
    }

}
