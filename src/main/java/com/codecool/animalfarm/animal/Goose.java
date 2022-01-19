package com.codecool.animalfarm.animal;

public class Goose extends Animal{

    private int eggsLaid;

    public Goose(double weight, int id) {
        super(weight, id);
        this.eggsLaid = 0;
    }

    public void makeNoise(){
        System.out.println("Goof");
    }

    public void layEgg(){}
}
