package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {

        this(name, 0, 0, 0);
    }

    public Carnivore(String name, double weight, double height, double length) {

        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {

        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {

        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {

        return "The " + getName() + " has a maximum food size of " + getMaxFoodSize() +
                ", a weight of " + getWeight() + ", a height of " + getHeight() +
                " and a length of " + getLength();
    }
}
