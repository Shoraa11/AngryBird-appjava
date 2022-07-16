package id.block;

public class Block {

    private String name;
    private Integer defense;
    private Integer size;

    public Block(String name, Integer defense, Integer size) {
        this.name = name;
        this.size = size;
        this.defense = defense * size;
    }

    public void getInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Defense : " + getDefense());
        System.out.println("Size : " + getSize());
    }

    public String getName() { return this.name; }
    public Integer getDefense() { return this.defense; }
    public Integer getSize() { return this.size; }

    public void setName(String newName) {  }
    public void setDefense(Integer newDefense) { this.defense = newDefense; }
    public void setSize(Integer newSize) { this.size = newSize; }

}
