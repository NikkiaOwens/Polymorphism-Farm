package com.zipcodewilmington.froilansfarm;

public class Person implements Eater, NoiseMaker{
    // will implement eater and noisemaker
    String name;

    public String eat(Edible food) {
        return "I ate " + food.getClass().getName();
    }

    public String makeNoise() {
        return "I am a person!";
    }
}
