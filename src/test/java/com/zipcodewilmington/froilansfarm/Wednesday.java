package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Wednesday {
    @Test
    public void feedChickens() {
        //given
        Farm farm = new Farm();
        Farmhouse farmhouse = farm.getFarmhouse();
        Farmer farmer = (Farmer) farmhouse.getPeople().get(0); //test wont pass until getPeople() problem
        List<ChickenCoop> chickenCoops = farm.chickenCoops();

        // when
        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                //      farmer.feed(chicken); // farmer does not have a feed(Animal);
            }
        }
    }

    @Test
    public void eatAllEggsInChickenCoop() {
        //given
        Farm farm = new Farm();
        Farmhouse farmhouse = farm.getFarmhouse();
        Farmer farmer = (Farmer) farmhouse.getPeople().get(0);
        List<ChickenCoop> chickenCoops = farm.chickenCoops();

        // when
        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                for (Egg egg : chicken.getLaidEggs()) {
                    if (!egg.hasBeenFertilized()) {
                        farmer.eat(egg);
                    }
                }
            }
        }
        //then
        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                for (Egg egg : chicken.getLaidEggs()) {
                    if (!egg.hasBeenFertilized() && !egg.hasBeenEaten()) {
                        Assert.fail("Not all edible eggs have been eaten.");
                    }
                }
            }
        }
    }
}
