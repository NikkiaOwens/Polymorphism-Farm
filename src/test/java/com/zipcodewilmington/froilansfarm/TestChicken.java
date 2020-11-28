package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChicken {
    @Test
    public void makeNoiseTest(){
        //given
        Chicken chicken = new Chicken();
        String expectedNoise = "cluck";
        //when
        String actualNoise = chicken.makeNoise();
        //then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest(){
        //given
        Chicken chicken = new Chicken();
        ArrayList<EarCorn> cornArray = new ArrayList<EarCorn>();
        EarCorn corn = new EarCorn();
        int expectedCornAmount = 0;
        //when
        cornArray.add(corn);
        chicken.eat();
        //int actualCornAmount = EarCorn.size();
        //then
        //   Assert.assertEquals(expectedCornAmount, actualCornAmount);
    }
}
