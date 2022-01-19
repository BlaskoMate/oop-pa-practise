package com.codecool.animalfarm.animal;

public class Cow extends Mammal{
    public Cow(double weight, int id) {
        super(weight, id);
    }

    @Override
    public void makeNoise() {
        System.out.println("Moo");
    }
}
