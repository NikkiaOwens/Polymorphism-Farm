package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
    public void eat(){

    }
    public String makeNoise(){
        return "cluck";
    }

    public Edible yield() {
        return null;
    }

    public void hasBeenFertilized(){
        //boolean
    }
}
