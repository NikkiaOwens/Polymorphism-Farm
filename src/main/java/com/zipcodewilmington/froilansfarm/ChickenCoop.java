package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.Collection;

public class ChickenCoop {
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();
    //need to setup arrayList of chickens;
    //need 4 chickenCoops with 15 total chickens
    public ChickenCoop(){
        chickens = new ArrayList<Chicken>();
    }

    public Collection<Chicken> getChickens() {
        return chickens;
    }

    public Integer getChickensSize(){
        return this.chickens.size();
    }

    public void addChicken(Integer numChickens){
        Chicken chicken = new Chicken();
        for (int i = 0; i <= numChickens; i++){
            chickens.add(chicken);
        }
    }

    public void deleteChicken(Integer chickensToDelete){
        for (int i = 0; i <= chickensToDelete; i++){
            chickens.remove(chickens.size()-1);
        }
    }
}
