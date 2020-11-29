package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Egg;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.List;

public class Chicken extends Animal implements Produce {
    private List<Egg> laidEggs;

    public String eat(Edible earCorn) {
        for (int i = 0; i < 3; i++) {
            // ArrayList<EarCorn> corn = new ArrayList<>();
            //   EarCorn.corn.size()-1;

        }
        return "Chicken is fed.";
    }

    public String makeNoise() {
        return "cluck";
    }

    public Edible yield() {
        Edible egg = new Egg();
        // ArrayList<Egg> eggInventory = new ArrayList;
        // eggInventory.add(egg);
        return egg;
    }

    public List<Egg> getLaidEggs() {
        return laidEggs;
    }
}
