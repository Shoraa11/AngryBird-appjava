package id.pig;

public class Hat_Pig implements Pig {

    protected Integer defense = 1;
    protected Integer hatDefense = 1;
    protected String name;

    public Hat_Pig(String name) {
        this.name = name;
        this.defense += this.hatDefense;
    }

    @Override
    public void getInfo() {
        System.out.println("Name    : " + this.name);
        System.out.println("Defense : " + getDefense());
        System.out.println("Hat Defense : " + this.hatDefense);
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
