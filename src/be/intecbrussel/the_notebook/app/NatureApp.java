package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.util.ArrayList;
import java.util.List;

public class NatureApp {

    public static void main(String[] args) {

        ForestNoteBook walkNoteBook = new ForestNoteBook();

        Tree blackOak = new Tree("Black Oak", LeafType.ROUND);
        blackOak.setHeight(150);
        Tree chesnutOak = new Tree("Chestnut Oak", LeafType.HEART);
        chesnutOak.setHeight(250);
        Flower abelia = new Flower("Abelia", 90);
        Weed cannabis = new Weed("Cannabis ", 50);
        cannabis.setArea(65);
        Bush butterfly = new Bush("Butterfly", LeafType.HAND);
        butterfly.setHeight(50);
        butterfly.setFruit("capsule");

        walkNoteBook.addPlant(blackOak);
        walkNoteBook.addPlant(chesnutOak);
        walkNoteBook.addPlant(abelia);
        walkNoteBook.addPlant(cannabis);
        walkNoteBook.addPlant(butterfly);

        Carnivore tiger = new Carnivore("Tiger", 120, 100, 250);
        tiger.setMaxFoodSize(50);
        Carnivore lion = new Carnivore("Lion", 180, 150, 300);
        lion.setMaxFoodSize(80);
        Carnivore lynx = new Carnivore("Lynx", 30, 60, 90);
        lynx.setMaxFoodSize(40);
        Carnivore leopard = new Carnivore("Leopard", 31, 70, 100);
        leopard.setMaxFoodSize(50);

        List<Carnivore> carnivores = new ArrayList<>();
        carnivores.add(tiger);
        carnivores.add(lion);
        carnivores.add(lynx);
        carnivores.add(leopard);
        walkNoteBook.setCarnivores(carnivores);

        Herbivore giraffe = new Herbivore("Giraffe", 2200, 500, 420);
        Herbivore elephant = new Herbivore("Elephant", 6000, 320, 550);
        giraffe.addPlantToDiet(abelia);
        giraffe.addPlantToDiet(cannabis);
        giraffe.addPlantToDiet(butterfly);
        elephant.addPlantToDiet(cannabis);
        elephant.addPlantToDiet(abelia);

        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(giraffe);
        herbivores.add(elephant);
        walkNoteBook.setHerbivores(herbivores);

        Omnivore opossum = new Omnivore("Opossum", 5, 25, 45);
        opossum.addPlantToDiet(abelia);
        opossum.addPlantToDiet(butterfly);
        opossum.setMaxFoodSize(10);
        Omnivore skunk = new Omnivore("Skunk", 8, 30, 50);
        skunk.addPlantToDiet(butterfly);
        skunk.setMaxFoodSize(15);
        Omnivore rat = new Omnivore("Rat", 1, 15, 30);
        rat.addPlantToDiet(abelia);
        rat.addPlantToDiet(cannabis);
        rat.addPlantToDiet(butterfly);
        rat.setMaxFoodSize(5);

        List<Omnivore> omnivores = new ArrayList<>();
        omnivores.add(opossum);
        omnivores.add(skunk);
        omnivores.add(rat);
        walkNoteBook.setOmnivores(omnivores);

        System.out.println("There are " + walkNoteBook.getAnimalCount() + " animals in the notebook.");
        System.out.println("There are " + walkNoteBook.getPlantCount() + " plants in the notebook.");
        System.out.println();

        walkNoteBook.printNotebook();
        System.out.println();

        System.out.println("-----Carnivores-----");
        walkNoteBook.getCarnivores().stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("-----Omnivores-----");
        walkNoteBook.getOmnivores().stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("-----Herbivores-----");
        walkNoteBook.getHerbivores().stream()
                .forEach(System.out::println);
        System.out.println();

        walkNoteBook.sortAllAnimalsByName();
        walkNoteBook.sortAllPlantsByName();
        walkNoteBook.printNotebook();
    }
}
