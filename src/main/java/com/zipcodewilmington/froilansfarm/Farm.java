package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;
import java.util.Collection;

public class Farm {

    private Farmhouse farmhouse = new Farmhouse();
    private ArrayList<Stable> stables = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private Field field = new Field();
    private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();


    public ArrayList<Stable> getStables(){
        return stables;
    }

    public Farm(){

    }

    public Field getField(){
        return field;
    }

//    public void setStables(){
//        this.stables = stables;
//    }

    public int getNumStables(){
        return stables.size();
    }

    public void setNumStables(Integer numStables){
        Stable stable = new Stable();
        for(int i = 0; i < numStables; i++){
            stables.add(stable);
        }
    }

//    public void setChickenCoops(){
//        this.chickenCoops = chickenCoops;
//    }

    public int getNumChickenCoops(){
        return chickenCoops.size();
    }

//    public void setNumChickenCoops(Integer numChickenCoops){
//        ChickenCoop chickenCoop = new ChickenCoop();
//        for (int i = 0; i < numChickenCoops; i++){
//            chickenCoops.add(chickenCoop);
//        }
//    }

//    public void setField(){
//        this.field = field;
//    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public Farmhouse getFarmhouse() {
        return farmhouse;
    }
}
