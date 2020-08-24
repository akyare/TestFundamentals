package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Herbivore extends Animal {

    Set<Plant> plantDiet;

    public Herbivore(String name) {

        this(name, 0, 0, 0);
    }

    public Herbivore(String name, double weight, double height, double length) {

        super(name, weight, height, length);
        plantDiet = new HashSet<>();
    }

    public Set<Plant> getPlantDiet() {

        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {

        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {

        boolean plantDietContainsPlant = false;
        for (Plant plt : plantDiet) {
            if(plt.equals(plant)) {

                plantDietContainsPlant = true;
            }
        }
        if(!plantDietContainsPlant) {

            plantDiet.add(plant);
        }

    }

    @Override
    public String toString() {

        String plants = plantDiet.stream()  //samengesproken met Alexander om geen appart method printDiet te maken
                .map(plant -> plant.getName())
                .collect(Collectors.joining(", "));
        return "The " + getName() + " has a plant diet of " + plants;
    }
}
