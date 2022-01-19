package com.codecool.animalfarm.animal;

public abstract class Animal {

    private double weight;
    private final int id;

    public Animal(double weight, int id) {
        this.weight = weight;
        this.id = id;
    }

    public abstract void makeNoise();
}
