package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

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
}
