package com.zipcodewilmington.froilansfarm;

public class Vehicle implements Rideable,NoiseMaker{

    private boolean isBeingRidden;

    public Vehicle(){
    }

    public String makeNoise() {
        return "Vroom vroom";
    }

    public boolean getBeingRidden() {
        return isBeingRidden;
    }

    public void setIsRidden(boolean ridden) {
        this.isBeingRidden = ridden;
    }
}
