package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmhouse {
    //Need to set up arrayList of Person(and one of farmer and pilot individually as well?)
    private ArrayList<Person> farmhouse = new ArrayList<Person>();
    Farmer farmer;
    Pilot pilot;

    public Farmhouse(){

    }

    public ArrayList<Person> getPeople(){
        return farmhouse;
    }



}
