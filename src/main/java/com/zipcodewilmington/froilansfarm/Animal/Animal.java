package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public class Animal implements Eater, NoiseMaker {
    public void eat() {
        //if Edible = true, -1 Edible
    }

    public String makeNoise() {
        return null;
    }

    public String eat(Edible food) {
        return this.getClass().getName() + " ate " + food.getClass().getName();
    }
}
