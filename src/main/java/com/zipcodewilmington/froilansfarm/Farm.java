package com.zipcodewilmington.froilansfarm;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Farm {
    //Need to setup arrayLists for farmHouse, chickenCoop, and Stable depending on how many are required
    Farmhouse farmhouse = new Farmhouse();
    ArrayList<Stable> stables = new ArrayList<Stable>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    //Farm also needs 1 field containing 5 cropRow
    Field field;
    //Need the farmVehicles
    CropDuster cropDuster;
    Tractor tractor;
    //need farmer and pilot
    Farmer farmer;
    Pilot pilot;

    public ArrayList<Stable> getStables(){
        return stables;
    }
    public ArrayList<ChickenCoop> chickenCoops(){
        return chickenCoops;
    }

    public Field getField(){
        return field;
    }
    public void setStables(){
        this.stables = stables;
    }
    public void setChickenCoops(){
        this.chickenCoops = chickenCoops;
    }
    public void setField(){
        this.field = field;
    }
}
