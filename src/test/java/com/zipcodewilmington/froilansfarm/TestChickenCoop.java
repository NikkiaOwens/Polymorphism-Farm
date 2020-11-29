package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {

    @Test
    public void addChickenTest(){
        Chicken chicken = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChicken(1);
        Integer expected = 2;
        Integer actual = chickenCoop.getChickensSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteChickenTest(){
        Chicken chicken = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addChicken(3);
        chickenCoop.deleteChicken(1);
        Integer expected = 2;
        Integer actual = chickenCoop.getChickensSize();

        Assert.assertEquals(expected, actual);
    }
}
