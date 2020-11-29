package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Thursday {
    Farm froilansFarm = new Farm();
    Farmer froilan = new Farmer("Froilan");
    Farmer froilanda = new Farmer("Froilanda");
    @Before
    public void setup(){
        froilansFarm.getFarmhouse().getPeople().add(froilan);
        froilansFarm.getFarmhouse().getPeople().add(froilanda);

        //fill field
        ArrayList<CropRow> cropRows = froilansFarm.getField().getRowsOfCrops();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                cropRows.add(new CropRow());
            } else {
                cropRows.add(new CropRow());
                // we'll just make the "arbitrary vegetation" tomato plants
            }
        }
        //fill chicken coops
        for (int i = 0; i < 4; i++){
            ChickenCoop coopToBeAdded = new ChickenCoop();
            if (i == 3) { // add 3 on the last chicken coop
                for (int j = 0; j < 2; j++) {
                    coopToBeAdded.getChickens().add(new Chicken());
                }
            } else {
                for (int j = 0; j < 3; j++){
                    coopToBeAdded.getChickens().add(new Chicken());
                }
            }
            froilansFarm.getChickenCoops().add(coopToBeAdded);
        }
        //fill stables
        for (int i = 0; i < 3; i++){
            Stable stableToBeAdded= new Stable();
            if (i == 2) { // add 4 to the last stable
                for (int j = 0; j < 3; j++) {
                    stableToBeAdded.getHorses().add(new Horse());
                }
            }
            else {
                for (int j = 0; j < 2; j++){
                    stableToBeAdded.getHorses().add(new Horse());
                }
            }
            froilansFarm.getStables().add(stableToBeAdded);
        }
        //Vehicles
        froilansFarm.getGarage().add(new Tractor());
        froilansFarm.getGarage().add(new CropDuster());
    }


    @Test
    public void farmerMakeNoiseTest(){
        //froilan and froilana talking
        String expected = "Good day on the farm.";

        String actual = froilan.makeNoise();
        String actual2 = froilanda.makeNoise();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }

    @Test
    public void horsesMakeNoiseTest(){
        Horse horse = new Horse();
        String expected = "nay";

        String actual = horse.makeNoise();

        System.out.println(horse.makeNoise());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void personMakeNoiseTest(){
        Person person = new Person();
        String expected = "I am a person!";

        String actual = person.makeNoise();

        Assert.assertEquals(expected, actual);
    }


}
