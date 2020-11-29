package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestHorse {
    @Test
    public void makeNoiseTest(){
        //given
        Horse horse = new Horse();
        String expectedNoise = "nay";
        //when
        String actualNoise = horse.makeNoise();
        //then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest(){
        //given
        Horse horse = new Horse();
        ArrayList<EarCorn> cornArray = new ArrayList<EarCorn>();
        EarCorn corn = new EarCorn();
        int expectedCornAmount = 0;
        //when
        cornArray.add(corn);
        horse.eat();
        //int actualCornAmount = EarCorn.size();
        //then
     //   Assert.assertEquals(expectedCornAmount, actualCornAmount);
    }

    @Test
    public void beingRiddenTest(){
        //given
        Horse horse = new Horse();
        //when
        horse.setBeingRidden(true);
        Boolean actual = horse.getBeingRidden();
        //then
        Assert.assertTrue(actual);
    }
}
