package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    public void eat(){

    }
    public String makeNoise(){
        return "cluck";
    }

    public Edible yield() {
        return null;
    }

    public void hasBeenFertilized(){
        //boolean
    }
}
