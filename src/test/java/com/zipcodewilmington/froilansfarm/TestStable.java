package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class TestStable {

    @Test
    public void addHorseTest(){
        Horse horse = new Horse();
        Stable stable = new Stable();

        stable.addHorse(1);
        Integer expected = 1;
        Integer actual = stable.getHorsesSize();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteHorseTest(){
        Horse horse = new Horse();
        Stable stable = new Stable();

        stable.addHorse(3);
        stable.deleteHorse(1);
        Integer expected = 1;
        Integer actual = stable.getHorsesSize();

        Assert.assertEquals(expected, actual);
    }
}
