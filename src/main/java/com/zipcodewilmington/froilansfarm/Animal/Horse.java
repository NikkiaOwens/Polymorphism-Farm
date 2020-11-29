package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {
    public Boolean isBeingRidden;

    public String eat(Edible earCorn) {
        for (int i = 0; i < 3; i++) {
        // ArrayList<EarCorn> corn = new ArrayList<>();
         //   EarCorn.corn.size()-1;
        }
        return "Horse is fed.";
    }

    public String makeNoise() {
        return "nay";
    }

    public Boolean getBeingRidden() {
        return isBeingRidden;
    }

    public void setBeingRidden(Boolean beingRidden) {
        isBeingRidden = beingRidden;
    }
}
