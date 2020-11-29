package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmhouse {
    private ArrayList<Person> farmhouse;
    Farmer farmer;
    Pilot pilot;

    public Farmhouse(){
        farmhouse = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople(){
        return farmhouse;
    }

    public Farmer getFarmer(){
        return this.farmer;
    }

    public Pilot getPilot(){
        return this.pilot;
    }

    public void setFarmer(Farmer farmer){
        this.farmer = farmer;
    }

    //pilot is abstract so it cannot be instantiated
//    public void setPilot(){
//        this.pilot = new Pilot();
//    }



}
