package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce{
    Boolean hasBeenFertilized;

    public Crop(){
        hasBeenFertilized = false;
    }

    public void setHasBeenFertilized(Boolean b){
        hasBeenFertilized = b;
    }

    public Boolean getHasBeenFertilized(){
        return hasBeenFertilized;
    }

    public Edible yield(){
        return null;
    }
}
