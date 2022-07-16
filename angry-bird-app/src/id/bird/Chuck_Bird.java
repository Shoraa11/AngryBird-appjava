package id.bird;

public class Chuck_Bird extends Bird {

    protected String shape;

    public Chuck_Bird(String name, String color, Integer attackPower) {
        super(name, color, attackPower);
        this.shape = "Triangle";
        this.specialPower = "Up Velocity than before";
        this.character = "Fast and Agile";
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
