package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {

        this(name, LeafType.NEEDLE); // to avoid null pointer exception, a default value is set to NEEDLE
        fruit = ""; // to avoid null pointer exception
    }

    public Bush(String name, LeafType leafType) {

        super(name);
        this.leafType = leafType;
        fruit = ""; // to avoid null pointer exception
    }

    public String getFruit() {

        return fruit;
    }

    public void setFruit(String fruit) {

        this.fruit = fruit;
    }

    public LeafType getLeafType() {

        return leafType;
    }

    public void setLeafType(LeafType leafType) {

        this.leafType = leafType;
    }

    @Override
    public String toString() {

        return "Bush " + getName() + " has fruit " + getFruit() + ", type of leaf " + getLeafType().name().toLowerCase() + " and a height of " + getHeight();
    }
}
