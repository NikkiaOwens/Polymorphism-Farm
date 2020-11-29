package com.zipcodewilmington.froilansfarm;


import com.sun.deploy.net.MessageHeader;

import java.security.PermissionCollection;
import java.util.ArrayList;
import java.util.Collection;

public class Farm {
    //Need to setup arrayLists for farmHouse, chickenCoop, and Stable depending on how many are required

    private Farmhouse farmhouse = new Farmhouse();
    private ArrayList<Stable> stables = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private Field field = new Field();
    private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();


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

    public Collection<ChickenCoop> getChickenCoops() {
        return chickenCoops();
    }

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public Farmhouse getFarmhouse() {
        return farmhouse;
    }
}
