package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Friday {
    Farm froilansFarm = new Farm();
    Farmer froilan = new Farmer();
    Farmer froilanda = new Farmer();
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
    public void morningRoutine(){
        //ride each horse
        // feed them 3 ears of corn
        Boolean expectedIsBeingRidden = true;
        for (Stable s : froilansFarm.getStables()){
            for (Horse h : s.getHorses()){
                froilan.mount(h);
                Assert.assertEquals(expectedIsBeingRidden, h.getBeingRidden());
                froilan.dismount(h);
                froilanda.mount(h);
                Assert.assertEquals(expectedIsBeingRidden, h.getBeingRidden());
                froilanda.dismount(h);
                for (int i = 0; i < 3; i++){
                    h.eat(new EarCorn());
                }
            }
        }
        //eat breakfast
        froilan.eat(new EarCorn());
        for (int i = 0; i < 2; i++){froilan.eat(new Tomato());}
        for (int i = 0; i < 5; i++){froilan.eat(new Egg());}

        for (int i = 0; i < 2; i++){froilanda.eat(new EarCorn());}
        froilanda.eat(new Tomato());
        for (int i = 0; i < 2; i++){froilanda.eat(new Egg());}
    }

//    @Test
//    public void vehicleMakeNoiseTest(){
//        Vehicle vehicle = new Vehicle();
//
//        String expected = "Vroom vroom";
//        String actual = Vehicle.makeNoise();
//
//    }
}
