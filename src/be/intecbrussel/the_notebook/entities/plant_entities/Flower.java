package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {

    private Scent smell;

    public Flower(String name) {

        this(name, 0);
        smell = Scent.EARTHY; // to avoid null pointer exception, a default value is set to EARTHY
    }

    public Flower(String name, double height) {

        super(name, height);
        smell = Scent.EARTHY; // to avoid null pointer exception, a default value is set to EARTHY
    }

    public Scent getSmell() {

        return smell;
    }

    public void setSmell(Scent smell) {

        this.smell = smell;
    }

    @Override
    public String toString() {

        return "Flower " + getName() + " has as type of smell " + getSmell().name().toLowerCase() + " and a height of " + getHeight();
    }
}
