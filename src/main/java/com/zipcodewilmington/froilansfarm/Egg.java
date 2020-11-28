package com.zipcodewilmington.froilansfarm;

public class Egg implements Edible {
    Boolean isFertilized = false;

    public Egg() {
    }

    public Boolean hasBeenFertilized() {
        return isFertilized;
    }
}
