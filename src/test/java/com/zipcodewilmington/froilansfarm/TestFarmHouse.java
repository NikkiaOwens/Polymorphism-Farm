package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestFarmHouse {

    @Test
    public void testSetFarmer(){
        Farmer farmer = new Farmer();
        Farmhouse farmhouse = new Farmhouse();
        farmhouse.setFarmer(farmer);

        Assert.assertEquals(farmer, farmhouse.getFarmer());

    }
}
