package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {

        this(name, LeafType.NEEDLE); // to avoid null pointer exception, a default value is set to NEEDLE
    }

    public Tree(String name, LeafType leafType) {

        super(name);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {

        return leafType;
    }

    public void setLeafType(LeafType leafType) {

        this.leafType = leafType;
    }

    @Override
    public String toString() {

        return "Tree " + getName() + " has as type leaf " + getLeafType().name().toLowerCase() + " and a height of " + getHeight();
    }
}
