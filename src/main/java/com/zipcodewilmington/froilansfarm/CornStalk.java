package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{

    public CornStalk(){

    }

    @Override
    public EarCorn yield(){
        if (super.getHasBeenFertilized()){
            return new EarCorn();
        }
        return null;
    }
}
