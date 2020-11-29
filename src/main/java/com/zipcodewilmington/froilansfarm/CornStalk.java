package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{

    @Override
    public EarCorn yield(){
        if (super.getHasBeenFertilized()){
            return new EarCorn();
        }
        return null;
    }
}
