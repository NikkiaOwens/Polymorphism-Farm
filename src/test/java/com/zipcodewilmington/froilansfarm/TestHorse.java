package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

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
}
