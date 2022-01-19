package com.codecool.animalfarm.animal;

public class Cat extends Mammal{
    public Cat(double weight, int id) {
        super(weight, id);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
