package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public List<Carnivore> getCarnivores() {

        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {

        this.carnivores = carnivores;
        animals.addAll(carnivores);
    }

    public List<Omnivore> getOmnivores() {

        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {

        this.omnivores = omnivores;
        animals.addAll(omnivores);
    }

    public List<Herbivore> getHerbivores() {

        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {

        this.herbivores = herbivores;
        animals.addAll(herbivores);
    }

    public int getPlantCount() {

        plantCount = (int) plants.stream()
                .count();

        return plantCount;
    }

    public int getAnimalCount() {

        animalCount = (int) animals.stream()
                .count();

        return animalCount;
    }

    public void addAnimal(Animal animal) {

        animals.add(animal);

        if (animal instanceof Carnivore) {

            carnivores.add((Carnivore) animal);
        }
        if (animal instanceof Herbivore) {

            herbivores.add((Herbivore) animal);
        }
        if (animal instanceof Omnivore) {

            omnivores.add((Omnivore) animal);
        }
    }

    public void addPlant(Plant plant) {

        plants.add(plant);
    }

    public void printNotebook() {

        System.out.println("-----Plants-----");
        plants.stream()
                .forEach(System.out::println);

        System.out.println("\n-----Animals-----");
        animals.stream()
                .forEach(System.out::println);
    }

    public void sortAllAnimalsByName() {

        animals = animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }

    public void sortAllPlantsByName() {

        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getName))
                .collect(Collectors.toList());
    }

    public void printHeavyAnimalsCount() {

        long heavyAnimalsCount = animals.stream()
                .filter(animal -> animal.getWeight() > 50)
                .count();

        System.out.println(heavyAnimalsCount);

    }

    public void printTallAnimals() {

        animals.stream()
                .filter(animal -> animal.getHeight() > 100)
                .forEach(System.out::println);
    }

    public void sortAllAnimalsByHeight() {

        animals = animals.stream()
                .sorted(Comparator.comparing(Animal::getHeight))
                .collect(Collectors.toList());
    }

    public void sortAllPlantsByHeight() {

        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getHeight))
                .collect(Collectors.toList());
    }
}
