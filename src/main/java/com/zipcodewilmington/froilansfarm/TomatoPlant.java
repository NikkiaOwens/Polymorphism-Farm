package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop{


    @Override
    public Tomato yield(){
        if (super.hasBeenFertilized){
            return new Tomato();
        }
        return null;
    }
}
