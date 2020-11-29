package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Collection;

public class Stable {
    private ArrayList<Horse> horses = new ArrayList<Horse>();


    public Stable(){
        horses = new ArrayList<Horse>();
    }


    public Collection<Horse> getHorses() {
        return horses;
    }

    public Integer getHorsesSize(){
        return this.horses.size();
    }

    public void addHorse(Integer numHorses){
        Horse horse = new Horse();
        for (int i = 0; i < numHorses; i++){
            horses.add(horse);
        }
    }
    public void deleteHorse(Integer horseToDelete){
        Horse horse = new Horse();
        for (int i = 0; i <= horseToDelete; i++){
            horses.remove(horses.size()-1);
        }
    }

}
