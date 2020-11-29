package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop{

    public TomatoPlant(){

    }

    @Override
    public Tomato yield(){
            return new Tomato();
    }
}
