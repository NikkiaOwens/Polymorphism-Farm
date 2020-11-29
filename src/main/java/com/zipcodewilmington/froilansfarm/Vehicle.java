package com.zipcodewilmington.froilansfarm;

public class Vehicle implements Rideable,NoiseMaker{

    public Vehicle(){
    }

    public String makeNoise() {
        return "Vroom vroom";
    }
}
