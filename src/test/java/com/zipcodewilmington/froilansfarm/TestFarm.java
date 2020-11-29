package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarm {


    @Test
    public void getNumOfChickenCoopsTest(){
        Farm farm = new Farm();
        ChickenCoop chickenCoop = new ChickenCoop();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        chickenCoops.add(chickenCoop);
        Integer expected = 0;
        Integer actual = farm.getNumChickenCoops();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumOfStablesTest(){
        Farm farm = new Farm();
        Stable stable = new Stable();
        ArrayList<Stable> stables = new ArrayList<Stable>();
        stables.add(stable);
        Integer expected = 0;
        Integer actual = farm.getNumStables();

        Assert.assertEquals(expected, actual);
    }
}
