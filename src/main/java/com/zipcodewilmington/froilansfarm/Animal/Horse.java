package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {
    public void eat() {
        //if Edible = true, -1 Edible
    }

    public String makeNoise() {
        return "nay";
    }
}
