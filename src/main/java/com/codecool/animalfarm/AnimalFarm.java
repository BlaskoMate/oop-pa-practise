package com.codecool.animalfarm;

import com.codecool.animalfarm.animal.Animal;
import com.codecool.animalfarm.animal.Goose;

import java.util.LinkedList;
import java.util.List;

public class AnimalFarm {

    private List<Animal> animals = new LinkedList<>();

    public void addAnimal(Animal animal){}

    public void hearAllAnimalNoise(){}

    public Goose findGoldenGoose(){
        return new Goose(12000, 1);
    }
}
