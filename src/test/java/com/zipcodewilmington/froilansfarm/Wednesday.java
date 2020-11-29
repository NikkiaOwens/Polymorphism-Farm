package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Wednesday {

    Farm froilansFarm = new Farm();
    Farmer froilan = new Farmer("Froilan");
    Farmer froilanda = new Farmer("Froilanda");
    @Before
    public void setup() {
        froilansFarm.getFarmhouse().getPeople().add(froilan);
        froilansFarm.getFarmhouse().getPeople().add(froilanda);

        //fill chicken coops
        for (int i = 0; i < 4; i++) {
            ChickenCoop coopToBeAdded = new ChickenCoop();
            if (i == 3) { // add 3 on the last chicken coop
                for (int j = 0; j < 2; j++) {
                    coopToBeAdded.getChickens().add(new Chicken());
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    coopToBeAdded.getChickens().add(new Chicken());
                }
            }
            froilansFarm.getChickenCoops().add(coopToBeAdded);
        }
    }

    @Test
    public void feedChickens() {
        //given
        Farmhouse farmhouse = froilansFarm.getFarmhouse();
        Farmer farmer = (Farmer) farmhouse.getPeople().get(0); //test wont pass until getPeople() problem
        List<ChickenCoop> chickenCoops = froilansFarm.getChickenCoops();

        // when
        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                ; // farmer does not have a feed(Animal);
                Assert.assertEquals("Chicken is fed.", chicken.eat(new EarCorn()));
            }
        }
    }

    @Test
    public void eatAllEggsInChickenCoop() {
        //given
        Farmhouse farmhouse = froilansFarm.getFarmhouse();
        Farmer farmer = (Farmer) farmhouse.getPeople().get(0);
        List<ChickenCoop> chickenCoops = froilansFarm.getChickenCoops();

        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                for (Egg egg : chicken.getLaidEggs()) {
                    if (!egg.hasBeenFertilized()) {

        // when
                        Assert.assertEquals(froilan.eat(egg), "I ate egg");  //eat() must tell set egg to hasBeenEaten: true;
                    }
                }
            }
        }

//        for (ChickenCoop chickenCoop : chickenCoops) {
//            for (Chicken chicken : chickenCoop.getChickens()) {
//                for (Egg egg : chicken.getLaidEggs()) {
//                    if (!egg.hasBeenFertilized() && !egg.hasBeenEaten()) {
//        //then
//                        Assert.fail("Not all edible eggs have been eaten.");
//                    }
//                }
//            }
//        }
    }
}
