package com.zipcodewilmington.froilansfarm;

public class Egg implements Edible {
    private Boolean hasBeenEaten = false;
    private Boolean isFertilized = false;

    public Egg() {
    }

    public Boolean hasBeenFertilized() {

        return isFertilized;
    }

    public boolean hasBeenEaten() {
        return hasBeenEaten;
    }

    public void fertilize(){
        isFertilized = true;
    }

    public void beEaten(){
        hasBeenEaten = true;
    }
}
