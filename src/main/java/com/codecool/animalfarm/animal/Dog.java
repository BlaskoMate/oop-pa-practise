package com.codecool.animalfarm.animal;

public class Dog extends Mammal{

    private int holesDug;
    private DogType dogType;

    public Dog(double weight, int id, DogType dogType) {
        super(weight, id);
        this.dogType = dogType;
        holesDug = 0;
    }


    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    public void digHole(){}

    public boolean isAllowedToDig(){
        return true;
    }
}
