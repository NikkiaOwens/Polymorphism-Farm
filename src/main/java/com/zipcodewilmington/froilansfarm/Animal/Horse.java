package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {
    public void eat(Edible food) {
    }

    public String makeNoise() {
        return "nay";
    }
}
